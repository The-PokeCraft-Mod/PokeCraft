package com.thepokecraftmod.pokecraft.api.species.evolution.condition;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.pokemon.Property;
import com.thepokecraftmod.pokecraft.api.registry.builtin.EvolutionConditionTypes;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public record DefeatedPokemonCondition(
        ResourceLocation species,
        List<Property> properties

) implements EvolutionCondition {
    public static final Codec<DefeatedPokemonCondition> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ResourceLocation.CODEC.fieldOf("species").forGetter(DefeatedPokemonCondition::species),
            Property.CODEC.listOf().fieldOf("properties").forGetter(DefeatedPokemonCondition::properties)
    ).apply(instance, DefeatedPokemonCondition::new));

    @Override
    public Type<?> getType() {
        return EvolutionConditionTypes.DEFEATED_POKEMON;
    }
}
