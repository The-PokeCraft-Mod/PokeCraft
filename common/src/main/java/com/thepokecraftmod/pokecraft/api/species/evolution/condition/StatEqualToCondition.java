package com.thepokecraftmod.pokecraft.api.species.evolution.condition;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.registry.builtin.EvolutionConditionTypes;

public record StatEqualToCondition(String stat1, String stat2) implements EvolutionCondition {
    public static final Codec<StatEqualToCondition> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.STRING.fieldOf("stat1").forGetter(StatEqualToCondition::stat1),
            Codec.STRING.fieldOf("stat2").forGetter(StatEqualToCondition::stat2)
    ).apply(instance, StatEqualToCondition::new));

    @Override
    public Type<?> getType() {
        return EvolutionConditionTypes.STAT_EQUAL_TO;
    }
}
