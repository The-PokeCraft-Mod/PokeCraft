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

package com.thepokecraftmod.pokecraft.level.entity;

import com.thepokecraftmod.pokecraft.api.pokemon.PokemonInstance;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;

/**
 * Extra {@link net.minecraft.network.syncher.EntityDataSerializer}'s used in UniMon
 */
public class PokeCraftEntityDataSerializers {
    public static final EntityDataSerializer<PokemonInstance> POKEMON_INSTANCE = EntityDataSerializer.simple(
            (buf, PokemonInstance) -> PokemonInstance.serializeToByteBuf(buf),
            buf -> buf.readWithCodec(NbtOps.INSTANCE, PokemonInstance.CODEC)
    );

    public static void onInitialize() {
        EntityDataSerializers.registerSerializer(POKEMON_INSTANCE);
    }
}
