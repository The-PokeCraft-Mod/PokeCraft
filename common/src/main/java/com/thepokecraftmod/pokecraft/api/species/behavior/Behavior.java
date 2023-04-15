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

package com.thepokecraftmod.pokecraft.api.species.behavior;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.ExtraCodecs;

public record Behavior(
        Aggression aggression,
        int baseFriendship,
        boolean canSwim,
        boolean isSocial
) {
    public static final Codec<Behavior> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ExtraCodecs.enumCodec(Aggression.class).fieldOf("aggression").forGetter(Behavior::aggression),
            Codec.INT.fieldOf("baseFriendship").forGetter(Behavior::baseFriendship),
            Codec.BOOL.fieldOf("canSwim").forGetter(Behavior::canSwim),
            Codec.BOOL.fieldOf("isSocial").forGetter(Behavior::isSocial)
    ).apply(instance, Behavior::new));
}
