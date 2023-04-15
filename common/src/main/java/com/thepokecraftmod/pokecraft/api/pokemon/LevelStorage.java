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

package com.thepokecraftmod.pokecraft.api.pokemon;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.FriendlyByteBuf;

/**
 * Stores information about next level up
 */
public class LevelStorage {
    public static final Codec<LevelStorage> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("level").forGetter(i -> i.level),
            Codec.INT.fieldOf("xp").forGetter(i -> i.xp),
            Codec.INT.fieldOf("xpUntilNextLevel").forGetter(i -> i.xpUntilNextLevel)
    ).apply(instance, LevelStorage::new));

    public int level;
    public int xp;
    public int xpUntilNextLevel;

    public LevelStorage(int level, int xp, int xpUntilNextLevel) {
        this.level = level;
        this.xp = xp;
        this.xpUntilNextLevel = xpUntilNextLevel;
    }

    public LevelStorage() {
    }

    public void serializeToNbt(CompoundTag tag) {
        CODEC.encodeStart(NbtOps.INSTANCE, this);
    }

    public void serializeToByteBuf(FriendlyByteBuf buf) {
        buf.writeWithCodec(NbtOps.INSTANCE, CODEC, this);
    }
}
