package com.thepokecraftmod.pokecraft.api.species.evolution.condition;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.registry.builtin.EvolutionConditionTypes;
import net.minecraft.resources.ResourceLocation;

public record UsedMoveCondition(
        ResourceLocation move,
        int neededUses
) implements EvolutionCondition {
    public static final Codec<UsedMoveCondition> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ResourceLocation.CODEC.fieldOf("move").forGetter(UsedMoveCondition::move),
            Codec.INT.fieldOf("uses").forGetter(UsedMoveCondition::neededUses)
    ).apply(instance, UsedMoveCondition::new));

    @Override
    public Type<?> getType() {
        return EvolutionConditionTypes.USED_MOVE;
    }
}
