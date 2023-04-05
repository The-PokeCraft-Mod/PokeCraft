package com.thepokecraftmod.pokecraft.api.species.evolution.condition;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.registry.builtin.EvolutionConditionTypes;
import net.minecraft.resources.ResourceLocation;

public record HoldingItemCondition(
        ResourceLocation item
) implements EvolutionCondition {
    public static final Codec<HoldingItemCondition> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ResourceLocation.CODEC.fieldOf("item").forGetter(HoldingItemCondition::item)
    ).apply(instance, HoldingItemCondition::new));

    @Override
    public Type<?> getType() {
        return EvolutionConditionTypes.HOLDING_ITEM;
    }
}
