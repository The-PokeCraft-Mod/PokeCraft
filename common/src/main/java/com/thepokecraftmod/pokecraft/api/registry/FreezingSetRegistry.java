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
