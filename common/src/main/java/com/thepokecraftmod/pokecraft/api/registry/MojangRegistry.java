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

import com.thepokecraftmod.pokecraft.PokeCraft;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * A better deferred register
 *
 * @param <V> the type of object to register.
 */
public class MojangRegistry<V, R extends Registry<V>> implements Iterable<Map.Entry<ResourceLocation, V>> {
    // FIXME: This is Forge API Specific. Move Out when i get time
    @ApiStatus.ScheduledForRemoval
    private static final List<MojangRegistry<?, Registry<Object>>> AVAILABLE_REGISTRIES = new ArrayList<>();
    protected final Function<String, ResourceLocation> locationFactory;
    public final ResourceKey<R> registryKey;
    public final HashMap<ResourceLocation, V> registrationQueue;

    @ApiStatus.Internal
    public MojangRegistry(ResourceKey<R> registryKey) {
        this(PokeCraft::id, registryKey);
    }

    @ApiStatus.Internal
    public MojangRegistry(Function<String, ResourceLocation> locationFactory, ResourceKey<R> registryKey) {
        this.locationFactory = locationFactory;
        this.registryKey = registryKey;
        this.registrationQueue = new HashMap<>();
        AVAILABLE_REGISTRIES.add((MojangRegistry<?, Registry<Object>>) this);
    }

    /**
     * Registers an object to be registered later.
     *
     * @param name  the name of the object. Will be prefixed with <b>unimon</b>
     * @param value the object to be registered by the name.
     * @return the value provided
     */
    public <S extends V> S register(String name, S value) {
        registrationQueue.put(locationFactory.apply(name), value);
        return value;
    }

    /**
     * Loops through all registries used by the mod
     *
     * @param consumer consumes a {@link MojangRegistry} of an unknown type
     */
    @ApiStatus.ScheduledForRemoval
    public static void allRegistries(Consumer<MojangRegistry<?, Registry<Object>>> consumer) {
        AVAILABLE_REGISTRIES.forEach(consumer);
    }

    @NotNull
    @Override
    @ApiStatus.ScheduledForRemoval
    public Iterator<Map.Entry<ResourceLocation, V>> iterator() {
        return registrationQueue.entrySet().iterator();
    }
}
