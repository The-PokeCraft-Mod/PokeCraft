package com.thepokecraftmod.pokecraft.api.species.evolution.condition;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.registry.builtin.EvolutionConditionTypes;
import net.minecraft.resources.ResourceLocation;

public record TransformEvolutionCondition(
        ResourceLocation category,
        String value
) implements EvolutionCondition {
    public static final Codec<TransformEvolutionCondition> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ResourceLocation.CODEC.fieldOf("category").forGetter(TransformEvolutionCondition::category),
            Codec.STRING.fieldOf("value").forGetter(TransformEvolutionCondition::value)
    ).apply(instance, TransformEvolutionCondition::new));

    @Override
    public Type<?> getType() {
        return EvolutionConditionTypes.TRANSFORM;
    }
}
