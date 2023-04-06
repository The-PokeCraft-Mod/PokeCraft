package com.thepokecraftmod.pokecraft.api.registry;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

import java.util.Iterator;

public class FreezingSetRegistry<T> implements RegistryLike<T> {
    private final BiMap<ResourceLocation, T> objects = HashBiMap.create();
    private boolean frozen;

    public T register(ResourceLocation id, T obj) {
        if (frozen) throw new RuntimeException("Tried to register an object to an already frozen registry");
        objects.put(id, obj);
        return obj;
    }

    @NotNull
    @Override
    public T get(ResourceLocation id) {
        if(!objects.containsKey(id)) throw new RuntimeException("Registry does not contain entry " + id);
        return objects.get(id);
    }

    @Override
    public ResourceLocation getId(T obj) {
        return objects.inverse().get(obj);
    }

    /**
     * Returns a registry codec used to map between {@link FreezingSetRegistry#get(ResourceLocation)} and {@link FreezingSetRegistry#getId(Object)}
     */
    public Codec<T> registryCodec() {
        return ResourceLocation.CODEC.xmap(this::get, this::getId);
    }

    public void freeze() {
        this.frozen = true;
    }

    @NotNull
    @Override
    public Iterator<T> iterator() {
        return objects.values().iterator();
    }
}
