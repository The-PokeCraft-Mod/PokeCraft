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

import com.thepokecraftmod.pokecraft.api.registry.DynamicLazySyncingRegistry;
import com.thepokecraftmod.pokecraft.api.registry.FreezingSetRegistry;
import com.thepokecraftmod.pokecraft.api.species.PokemonSpecies;
import com.thepokecraftmod.pokecraft.api.species.evolution.condition.EvolutionCondition;
import com.thepokecraftmod.pokecraft.api.species.riding.RideInfo;
import com.thepokecraftmod.pokecraft.api.species.transform.SpeciesTransform;

public class PokeCraftRegistries {
    public static final FreezingSetRegistry<RideInfo.Type<?>> RIDE_INFO_TYPES = new FreezingSetRegistry<>();
    public static final FreezingSetRegistry<EvolutionCondition.Type<?>> EVOLUTION_CONDITION_TYPES = new FreezingSetRegistry<>();
    public static final FreezingSetRegistry<SpeciesTransform.Type<?>> SPECIES_TRANSFORM_TYPES = new FreezingSetRegistry<>();
    public static final DynamicLazySyncingRegistry<PokemonSpecies> SPECIES = new DynamicLazySyncingRegistry<>("species", PokemonSpecies.CODEC);

    public static void onInitialize() {
        RideInfoTypes.onInitialize();
        EvolutionConditionTypes.onInitialize();
        SpeciesTransformTypes.onInitialize();
    }
}
