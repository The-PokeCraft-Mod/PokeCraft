package com.thepokecraftmod.pokecraft.api.species.evolution;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.species.evolution.condition.EvolutionCondition;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public record EvolutionTarget(
        ResourceLocation target,
        List<EvolutionCondition> conditions
) {
    public static final Codec<EvolutionTarget> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ResourceLocation.CODEC.fieldOf("target").forGetter(EvolutionTarget::target),
            EvolutionCondition.TYPE_BASED_CODEC.listOf().fieldOf("conditions").forGetter(EvolutionTarget::conditions)
    ).apply(instance, EvolutionTarget::new));
}
