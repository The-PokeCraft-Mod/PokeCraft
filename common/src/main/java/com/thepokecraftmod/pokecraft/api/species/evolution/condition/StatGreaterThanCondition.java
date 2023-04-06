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
