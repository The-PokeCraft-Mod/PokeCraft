package com.thepokecraftmod.pokecraft.api.species.evolution.condition;

import com.mojang.serialization.Codec;
import com.thepokecraftmod.pokecraft.api.registry.builtin.PokeCraftRegistries;

public interface EvolutionCondition {
    Codec<EvolutionCondition> TYPE_BASED_CODEC = PokeCraftRegistries.EVOLUTION_CONDITION_TYPES.registryCodec().dispatch("type", EvolutionCondition::getType, Type::codec);

    Type<?> getType();

    record Type<T extends EvolutionCondition>(
            Codec<T> codec,
            Class<T> clazz
    ) {}
}
