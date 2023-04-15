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
import com.thepokecraftmod.pokecraft.api.species.evolution.condition.*;

public class EvolutionConditionTypes {
    public static final EvolutionCondition.Type<?> TRANSFORM = register("transform", TransformEvolutionCondition.CODEC, TransformEvolutionCondition.class);
    public static final EvolutionCondition.Type<?> REQUIRES_PROPERTIES = register("requires_properties", RequiresPropertiesCondition.CODEC, RequiresPropertiesCondition.class);
    public static final EvolutionCondition.Type<?> HOLDING_ITEM = register("holding_item", HoldingItemCondition.CODEC, HoldingItemCondition.class);
    public static final EvolutionCondition.Type<?> USED_MOVE = register("used_move", UsedMoveCondition.CODEC, UsedMoveCondition.class);
    public static final EvolutionCondition.Type<?> TRADED = register("trade", TradedCondition.CODEC, TradedCondition.class);
    public static final EvolutionCondition.Type<?> TIME = register("time", TimeCondition.CODEC, TimeCondition.class);
    public static final EvolutionCondition.Type<?> STAT_GREATER_THAN = register("stat_greater_than", StatGreaterThanCondition.CODEC, StatGreaterThanCondition.class);
    public static final EvolutionCondition.Type<?> STAT_EQUAL_TO = register("stat_equal_to", StatEqualToCondition.CODEC, StatEqualToCondition.class);
    public static final EvolutionCondition.Type<?> DEFEATED_POKEMON = register("defeated_pokemon", DefeatedPokemonCondition.CODEC, DefeatedPokemonCondition.class);
    public static final EvolutionCondition.Type<?> INTERACT_ITEM = register("interact_item", InteractItemCondition.CODEC, InteractItemCondition.class);

    public static void onInitialize() {
        PokeCraftRegistries.EVOLUTION_CONDITION_TYPES.freeze();
    }

    public static <T extends EvolutionCondition> EvolutionCondition.Type<?> register(String name, Codec<T> codec, Class<T> clazz) {
        return PokeCraftRegistries.EVOLUTION_CONDITION_TYPES.register(PokeCraft.id(name), new EvolutionCondition.Type<>(codec, clazz));
    }
}
