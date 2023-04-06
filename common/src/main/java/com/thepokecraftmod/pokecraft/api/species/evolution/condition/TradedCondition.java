package com.thepokecraftmod.pokecraft.api.species.evolution.condition;

import com.mojang.serialization.Codec;
import com.thepokecraftmod.pokecraft.api.registry.builtin.EvolutionConditionTypes;

public record TradedCondition(
) implements EvolutionCondition {
    public static final Codec<TradedCondition> CODEC = Codec.unit(new TradedCondition());

    @Override
    public Type<?> getType() {
        return EvolutionConditionTypes.TRADED;
    }
}
