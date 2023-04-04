package com.thepokecraftmod.pokecraft.api.species;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record BoundingBoxSize(
    double width,
    double height
) {
    public static final Codec<BoundingBoxSize> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.DOUBLE.fieldOf("width").forGetter(BoundingBoxSize::width),
            Codec.DOUBLE.fieldOf("height").forGetter(BoundingBoxSize::height)
    ).apply(instance, BoundingBoxSize::new));
}
