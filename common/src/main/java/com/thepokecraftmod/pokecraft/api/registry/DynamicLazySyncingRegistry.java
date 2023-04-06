/*
 * Copyright (C) 2023 ThePokeCraftMod
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package com.thepokecraftmod.pokecraft.api.registry;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.JsonOps;
import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.event.RegistryEvents;
import com.thepokecraftmod.pokecraft.network.packets.s2c.S2CSyncRegistry;
import com.thepokecraftmod.pokecraft.api.event.DataEvents;
import com.thepokecraftmod.pokecraft.network.PokeCraftNetworking;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderOwner;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.TagLoader;
import net.minecraft.util.profiling.ProfilerFiller;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

import static net.minecraft.tags.TagManager.getTagDir;

/**
 * A custom type of registry which focuses on making sure that the client and server sync does not need to send all the data from the registry, just entries which have had modifications. This registry has {@link Holder} and {@link net.minecraft.tags.TagKey} support.
 *
 * @param <T> the type of object you want to store
 */
public class DynamicLazySyncingRegistry<T> extends SimpleJsonResourceReloadListener implements RegistryLike<T>, HolderOwner<T> {
    @ApiStatus.Internal
    public static final Map<ResourceKey<?>, DynamicLazySyncingRegistry<?>> REGISTRY_MAP = new HashMap<>();
    public static final Gson GSON = new Gson();
    private static final MessageDigest HASH_DIGEST;
    private final Codec<T> objCodec;
    private final BiMap<ResourceLocation, T> objects = HashBiMap.create();
    private final BiMap<ResourceLocation, T> objectThatNeedToSync = HashBiMap.create();
    private final BiMap<ResourceLocation, Holder.Reference<T>> objectHolders = HashBiMap.create();
    private final ResourceKey<Registry<T>> key;
    public final String path;

    /**
     * Creates a new instance of a {@link DynamicLazySyncingRegistry}
     *
     * @param path     the path you want to have your json files in. For example the path <b>"foo"</b> would mean you put your json in <b>data/mod_id/foo</b>
     * @param objCodec the codec used to sync your objects
     */
    public DynamicLazySyncingRegistry(String path, @NotNull Codec<T> objCodec) {
        super(GSON, path);
        this.objCodec = objCodec;
        this.key = ResourceKey.createRegistryKey(PokeCraft.id(path));
        this.path = path;

        REGISTRY_MAP.put(key, this);
        RegistryEvents.ADD_RESOURCE_RELOADERS.listen(listeners -> listeners.add(this));
        DataEvents.SYNC_PLAYER.listen(this::syncRegistry);
    }

    /**
     * Resets the registry and clears all objects
     */
    public void clear() {
        objects.clear();
        objectHolders.clear();
        objectThatNeedToSync.clear();
    }

    /**
     * Registers an object to this registry.
     *
     * @param id          the id you want to associate with the object
     * @param obj         the object you are trying to register
     * @param needsToSync if the object is not already known about on the client. <b>Unless this is internally used, this should ALWAYS be true</b>
     * @return the object you registered to the registry
     */
    public T register(ResourceLocation id, T obj, boolean needsToSync) {
        objects.put(id, obj);
        if (needsToSync) objectThatNeedToSync.put(id, obj);
        objectHolders.put(id, Holder.Reference.createStandAlone(this, ResourceKey.create(key, id)));
        return obj;
    }

    /**
     * Inverts the maps order to find the {@link ResourceLocation} associated with an object
     *
     * @param obj an object of type T that is registered to this registry
     */
    public ResourceLocation getId(T obj) {
        return this.objects.inverse().get(obj);
    }

    /**
     * Gets the holder for a object. This can be used to get tags on a object if there are any available
     *
     * @param id
     * @return
     */
    public Holder<T> getHolder(ResourceLocation id) {
        return objectHolders.get(id);
    }

    /**
     * Gets a holder as a reference. Needed to properly sync tags. Almost always internal only. Use {@link DynamicLazySyncingRegistry#getHolder(ResourceLocation)}
     *
     * @param id the id of the object you want a holder for
     * @return a holder casted to a Holder.Reference
     */
    @ApiStatus.Internal
    public Holder.Reference<T> getReferenceHolder(ResourceLocation id) {
        return objectHolders.get(id);
    }

    /**
     * Gets an object from its {@link ResourceLocation}
     *
     * @param id the of the object you want to find
     */
    public T get(ResourceLocation id) {
        return this.objects.get(id);
    }

    /**
     * Allows the use of a forEach loop on a registry
     *
     * @param consumer the action to run on each object
     */
    public void forEach(BiConsumer<ResourceLocation, T> consumer) {
        objects.forEach(consumer);
    }

    /**
     * Returns the amount of objects registered to the registry
     */
    public int size() {
        return objects.size();
    }

    /**
     * Returns a registry codec used to map between {@link DynamicLazySyncingRegistry#get(ResourceLocation)} and {@link DynamicLazySyncingRegistry#getId(Object)}
     */
    public Codec<T> registryCodec() {
        return ResourceLocation.CODEC.xmap(this::get, this::getId);
    }

    /**
     * Returns the codec used to read the object
     */
    public Codec<T> codec() {
        return objCodec;
    }

    /**
     * Returns the id's of all registered entries
     */
    public Set<ResourceLocation> keySet() {
        return objects.keySet();
    }

    /**
     * Returns all values inside the Registry of type <b>T</b>
     */
    public Set<T> values() {
        return objects.values();
    }

    /**
     * Returns the key associated with this registry
     */
    public ResourceKey<Registry<T>> registryKey() {
        return key;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return values().iterator();
    }

    /**
     * Returns all entries of the registry which are modified and need syncing to the client
     */
    @ApiStatus.Internal
    public Map<ResourceLocation, T> getSyncingEntries() {
        return objectThatNeedToSync;
    }

    /**
     * Sends a sync packet to sync the current registry
     *
     * @param player the player to sync with
     */
    @ApiStatus.Internal
    private void syncRegistry(ServerPlayer player) {
        PokeCraftNetworking.getInstance().sendPacket(new S2CSyncRegistry(this), player);
    }

    @ApiStatus.Internal
    public <R> void bindTags(Map<TagKey<R>, List<Holder<R>>> keyMap) {
        var map = new HashMap<Holder<T>, List<TagKey<T>>>();

        for (var entry : keyMap.entrySet()) {
            for (Holder<R> holder : entry.getValue()) {
                map.putIfAbsent((Holder<T>) holder, new ArrayList<>());
                map.get(holder).add((TagKey<T>) entry.getKey());
            }
        }

        for (var entry : map.entrySet())
            getReferenceHolder(entry.getKey().unwrapKey().orElseThrow().location()).bindTags(entry.getValue());
    }

    @ApiStatus.Internal
    protected T readJson(ResourceLocation key, JsonElement json) {
        var decode = codec().decode(JsonOps.INSTANCE, json);
        return decode
                .resultOrPartial(PokeCraft.LOGGER::error)
                .orElseThrow(() -> new RuntimeException("Errors exist in " + key + ".json \"" + decode.error().orElseThrow().message() + "\""))
                .getFirst();
    }

    @ApiStatus.Internal
    public void load(Map<ResourceLocation, JsonElement> map, boolean ignoreHashes) {
        for (var entry : map.entrySet()) {
            var json = entry.getValue().getAsJsonObject();
            var originalHash = json.has("hash") ? json.get("hash").getAsString() : "";
            json.remove("hash");
            var fileHash = ignoreHashes ? "" : new String(HASH_DIGEST.digest(GSON.toJson(json).getBytes()), StandardCharsets.UTF_8);
            register(entry.getKey(), readJson(entry.getKey(), json), !ignoreHashes && !originalHash.equals(fileHash));
        }
    }

    @ApiStatus.Internal
    @Override
    protected void apply(@NotNull Map<ResourceLocation, JsonElement> map, @NotNull ResourceManager resourceManager, @NotNull ProfilerFiller profiler) {
        clear();
        load(map, false);

        var tagloader = new TagLoader<>((id) -> Optional.ofNullable(getHolder(id)), getTagDir(registryKey()));
        var loadResult = tagloader.loadAndBuild(resourceManager)
                .entrySet()
                .stream()
                .collect(Collectors.toUnmodifiableMap(entry -> TagKey.create(registryKey(), entry.getKey()), entry -> List.copyOf(entry.getValue())));
        bindTags(loadResult);
    }

    static {
        try {
            HASH_DIGEST = MessageDigest.getInstance("SHA3-256");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
