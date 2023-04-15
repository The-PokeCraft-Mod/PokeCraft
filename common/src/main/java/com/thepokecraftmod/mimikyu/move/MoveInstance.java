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

package com.thepokecraftmod.mimikyu.move;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

/**
 * An instance of a move. Contains the Data for the original move and the PP for that specific instance of the move
 */
public class MoveInstance {
    public static final Codec<MoveInstance> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Move.CODEC.fieldOf("data").forGetter(i -> i.data),
            Codec.INT.fieldOf("pp").forGetter(i -> i.pp)
    ).apply(instance, MoveInstance::new));
    public final Move data;
    public int pp;

    public MoveInstance(Move data) {
        this.data = data;
        this.pp = data.maxPP();
    }

    public MoveInstance(Move data, int pp) {
        this.data = data;
        this.pp = pp;
    }

    public int getPPMax() {
        return data.maxPP();
    }
}
