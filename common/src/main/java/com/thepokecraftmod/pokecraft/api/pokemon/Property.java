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

public record Property(
        String property,
        String comparison,
        String value
) {
    public static final Codec<Property> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.STRING.fieldOf("property").forGetter(Property::property),
            Codec.STRING.fieldOf("comparison").forGetter(Property::comparison),
            Codec.STRING.fieldOf("value").forGetter(Property::value)
    ).apply(instance, Property::new));
}
