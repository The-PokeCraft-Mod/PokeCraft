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

package com.thepokecraftmod.pokecraft.fabric.registry;

import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;

public class FabricMojangRegistry<T> extends MojangRegistry<T, Registry<T>> {

    public FabricMojangRegistry(ResourceKey<Registry<T>> registryKey) {
        super(registryKey);
    }

    @Override
    public <S extends T> S register(String name, S value) {
        var id = locationFactory.apply(name);
        var registry = BuiltInRegistries.REGISTRY.get(registryKey.location());
        return Registry.register((Registry<Object>) registry, id, value);
    }
}
