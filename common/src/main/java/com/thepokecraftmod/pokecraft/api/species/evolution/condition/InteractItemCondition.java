package com.thepokecraftmod.pokecraft.api.species.evolution.condition;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.registry.builtin.EvolutionConditionTypes;
import net.minecraft.resources.ResourceLocation;

public record InteractItemCondition(
        ResourceLocation item
) implements EvolutionCondition {
    public static final Codec<InteractItemCondition> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ResourceLocation.CODEC.fieldOf("item").forGetter(InteractItemCondition::item)
    ).apply(instance, InteractItemCondition::new));

    @Override
    public Type<?> getType() {
        return EvolutionConditionTypes.INTERACT_ITEM;
    }
}