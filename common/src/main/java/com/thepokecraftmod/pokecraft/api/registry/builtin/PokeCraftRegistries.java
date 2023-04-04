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
