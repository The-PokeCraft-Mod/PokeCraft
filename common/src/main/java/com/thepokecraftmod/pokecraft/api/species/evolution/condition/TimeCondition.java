package com.thepokecraftmod.pokecraft.api.species.evolution.condition;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.pokemon.Property;
import com.thepokecraftmod.pokecraft.api.registry.builtin.EvolutionConditionTypes;

import java.util.List;

public record TimeCondition(String time) implements EvolutionCondition {
    public static final Codec<TimeCondition> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.STRING.fieldOf("time").forGetter(TimeCondition::time)
    ).apply(instance, TimeCondition::new));

    @Override
    public Type<?> getType() {
        return EvolutionConditionTypes.TIME;
    }
}
