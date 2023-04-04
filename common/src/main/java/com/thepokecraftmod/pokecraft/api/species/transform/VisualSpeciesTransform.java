package com.thepokecraftmod.pokecraft.api.species.transform;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.registry.builtin.SpeciesTransformTypes;

public record VisualSpeciesTransform(
        String category,
        String variant
) implements SpeciesTransform {
    public static final Codec<VisualSpeciesTransform> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.STRING.fieldOf("category").forGetter(VisualSpeciesTransform::category),
            Codec.STRING.fieldOf("variant").forGetter(VisualSpeciesTransform::variant)
    ).apply(instance, VisualSpeciesTransform::new));

    @Override
    public Type<?> getType() {
        return SpeciesTransformTypes.VISUAL;
    }
}
