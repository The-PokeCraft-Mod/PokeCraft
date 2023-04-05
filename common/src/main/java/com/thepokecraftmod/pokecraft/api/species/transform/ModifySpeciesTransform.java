package com.thepokecraftmod.pokecraft.api.species.transform;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.registry.builtin.SpeciesTransformTypes;
import com.thepokecraftmod.pokecraft.api.species.PartialSpeciesInfo;

public record ModifySpeciesTransform(
        String category,
        PartialSpeciesInfo info
) implements SpeciesTransform {
    public static final Codec<ModifySpeciesTransform> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.STRING.fieldOf("category").forGetter(ModifySpeciesTransform::category),
            PartialSpeciesInfo.CODEC.fieldOf("info").forGetter(ModifySpeciesTransform::info)
    ).apply(instance, ModifySpeciesTransform::new));

    @Override
    public Type<?> getType() {
        return SpeciesTransformTypes.MODIFY_SPECIES;
    }
}
