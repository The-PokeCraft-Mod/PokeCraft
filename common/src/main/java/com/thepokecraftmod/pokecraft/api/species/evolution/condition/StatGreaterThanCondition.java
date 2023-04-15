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

package com.thepokecraftmod.pokecraft.api.species.evolution.condition;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.registry.builtin.EvolutionConditionTypes;

public record StatGreaterThanCondition(String lesserStat, String greaterStat) implements EvolutionCondition {
    public static final Codec<StatGreaterThanCondition> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.STRING.fieldOf("lesserStat").forGetter(StatGreaterThanCondition::lesserStat),
            Codec.STRING.fieldOf("greaterStat").forGetter(StatGreaterThanCondition::greaterStat)
    ).apply(instance, StatGreaterThanCondition::new));

    @Override
    public Type<?> getType() {
        return EvolutionConditionTypes.STAT_GREATER_THAN;
    }
}
