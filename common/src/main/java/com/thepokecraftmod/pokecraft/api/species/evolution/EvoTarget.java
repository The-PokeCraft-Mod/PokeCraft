package com.thepokecraftmod.pokecraft.api.species.evolution;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.resources.ResourceLocation;

public record EvoTarget(
        ResourceLocation species
        // TODO: handle transform categories here.
) {
    public static final Codec<EvoTarget> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ResourceLocation.CODEC.fieldOf("species").forGetter(EvoTarget::species)
    ).apply(instance, EvoTarget::new));
}
