package com.thepokecraftmod.pokecraft.api.registry;

import com.thepokecraftmod.pokecraft.api.species.PokemonSpecies;

public class PokeCraftRegistries {
    public static final DynamicLazySyncingRegistry<PokemonSpecies> SPECIES = new DynamicLazySyncingRegistry<>("species", PokemonSpecies.CODEC);

    public static void onInitialize() {
    }
}
