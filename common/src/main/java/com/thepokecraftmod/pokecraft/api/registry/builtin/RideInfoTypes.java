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

package com.thepokecraftmod.pokecraft.api.registry.builtin;

import com.mojang.serialization.Codec;
import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.species.riding.NoRideInfo;
import com.thepokecraftmod.pokecraft.api.species.riding.RideInfo;

public class RideInfoTypes {
    public static final RideInfo.Type<?> NONE = register("none", NoRideInfo.CODEC, NoRideInfo.class);

    public static void onInitialize() {
        PokeCraftRegistries.RIDE_INFO_TYPES.freeze();
    }

    public static <T extends RideInfo> RideInfo.Type<?> register(String name, Codec<T> codec, Class<T> clazz) {
        return PokeCraftRegistries.RIDE_INFO_TYPES.register(PokeCraft.id(name), new RideInfo.Type<>(codec, clazz));
    }
}
