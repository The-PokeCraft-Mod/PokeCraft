package com.thepokecraftmod.pokecraft.api.species;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.resources.ResourceLocation;

import java.util.List;

public record AbilityPool(
        List<ResourceLocation> hidden,
        List<ResourceLocation> regular
) {
    public static final Codec<AbilityPool> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ResourceLocation.CODEC.listOf().fieldOf("hidden").forGetter(AbilityPool::hidden),
            ResourceLocation.CODEC.listOf().fieldOf("regular").forGetter(AbilityPool::regular)
    ).apply(instance, AbilityPool::new));
}
