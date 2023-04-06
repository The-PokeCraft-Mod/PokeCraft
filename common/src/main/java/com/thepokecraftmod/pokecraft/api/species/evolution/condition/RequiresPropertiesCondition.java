package com.thepokecraftmod.pokecraft.api.species.evolution.condition;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.pokemon.Property;
import com.thepokecraftmod.pokecraft.api.registry.builtin.EvolutionConditionTypes;

import java.util.List;

public record RequiresPropertiesCondition(List<Property> properties) implements EvolutionCondition {
    public static final Codec<RequiresPropertiesCondition> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Property.CODEC.listOf().fieldOf("properties").forGetter(RequiresPropertiesCondition::properties)
    ).apply(instance, RequiresPropertiesCondition::new));

    @Override
    public Type<?> getType() {
        return EvolutionConditionTypes.REQUIRES_PROPERTIES;
    }
}
