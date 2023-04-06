package com.thepokecraftmod.pokecraft.api.species.evolution;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.species.evolution.condition.EvolutionCondition;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public record Evolution(
        EvoTarget target,
        List<EvolutionCondition> conditions
) {
    public static final Codec<Evolution> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            EvoTarget.CODEC.fieldOf("target").forGetter(Evolution::target),
            EvolutionCondition.TYPE_BASED_CODEC.listOf().fieldOf("conditions").forGetter(Evolution::conditions)
    ).apply(instance, Evolution::new));
}
