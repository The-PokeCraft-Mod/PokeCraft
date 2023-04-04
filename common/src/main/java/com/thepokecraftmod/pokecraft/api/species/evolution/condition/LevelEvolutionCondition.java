package com.thepokecraftmod.pokecraft.api.species.evolution.condition;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.registry.builtin.EvolutionConditionTypes;

public record LevelEvolutionCondition(int level) implements EvolutionCondition {
    public static final Codec<LevelEvolutionCondition> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("level").forGetter(LevelEvolutionCondition::level)
    ).apply(instance, LevelEvolutionCondition::new));

    @Override
    public Type<?> getType() {
        return EvolutionConditionTypes.LEVEL;
    }
}
