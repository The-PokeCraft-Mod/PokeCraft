package com.thepokecraftmod.pokecraft.api.registry.builtin;

import com.mojang.serialization.Codec;
import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.species.evolution.condition.EvolutionCondition;
import com.thepokecraftmod.pokecraft.api.species.evolution.condition.LevelEvolutionCondition;
import com.thepokecraftmod.pokecraft.api.species.evolution.condition.TransformEvolutionCondition;

public class EvolutionConditionTypes {
    public static final EvolutionCondition.Type<?> LEVEL = register("level", LevelEvolutionCondition.CODEC, LevelEvolutionCondition.class);
    public static final EvolutionCondition.Type<?> TRANSFORM = register("transform", TransformEvolutionCondition.CODEC, TransformEvolutionCondition.class);

    public static void onInitialize() {
        PokeCraftRegistries.EVOLUTION_CONDITION_TYPES.freeze();
    }

    public static <T extends EvolutionCondition> EvolutionCondition.Type<?> register(String name, Codec<T> codec, Class<T> clazz) {
        return PokeCraftRegistries.EVOLUTION_CONDITION_TYPES.register(PokeCraft.id(name), new EvolutionCondition.Type<>(codec, clazz));
    }
}
