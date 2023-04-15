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
import net.minecraft.network.FriendlyByteBuf;

/**
 * Storage for Pokemon Stats
 */
public class StatStorage {
    public static final Codec<StatStorage> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("hp").forGetter(i -> i.hp),
            Codec.INT.fieldOf("speed").forGetter(i -> i.speed),
            Codec.INT.fieldOf("attack").forGetter(i -> i.attack),
            Codec.INT.fieldOf("defense").forGetter(i -> i.defense),
            Codec.INT.fieldOf("specialAttack").forGetter(i -> i.specialAttack),
            Codec.INT.fieldOf("specialDefense").forGetter(i -> i.specialDefense)
    ).apply(instance, StatStorage::new));
    public int hp;
    public int speed;
    public int attack;
    public int defense;
    public int specialAttack;
    public int specialDefense;

    public StatStorage() {
    }

    public StatStorage(int hp, int speed, int attack, int defense, int specialAttack, int specialDefense) {
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.speed = speed;
    }

    public void serializeToNbt(CompoundTag tag) {
        tag.putInt("Hp", hp);
        tag.putInt("Att", attack);
        tag.putInt("Def", defense);
        tag.putInt("SpAtt", specialAttack);
        tag.putInt("SpDef", specialDefense);
        tag.putInt("Speed", speed);
    }

    public static IndividualValues deserializeFromNbt(CompoundTag tag) {
        var storage = new IndividualValues();
        storage.hp = tag.getInt("Hp");
        storage.attack = tag.getInt("Att");
        storage.defense = tag.getInt("Def");
        storage.specialAttack = tag.getInt("SpAtt");
        storage.specialDefense = tag.getInt("SpDef");
        storage.speed = tag.getInt("Speed");
        return storage;
    }

    public void serializeToByteBuf(FriendlyByteBuf byteBuf) {
        byteBuf.writeVarInt(this.hp);
        byteBuf.writeVarInt(this.attack);
        byteBuf.writeVarInt(this.defense);
        byteBuf.writeVarInt(this.specialAttack);
        byteBuf.writeVarInt(this.specialDefense);
        byteBuf.writeVarInt(this.speed);
    }

    public static IndividualValues readFromByteBuf(FriendlyByteBuf byteBuf) {
        var storage = new IndividualValues();
        storage.hp = byteBuf.readVarInt();
        storage.attack = byteBuf.readVarInt();
        storage.defense = byteBuf.readVarInt();
        storage.specialAttack = byteBuf.readVarInt();
        storage.specialDefense = byteBuf.readVarInt();
        storage.speed = byteBuf.readVarInt();
        return storage;
    }
}
