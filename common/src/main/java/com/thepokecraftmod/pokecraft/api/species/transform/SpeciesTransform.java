package com.thepokecraftmod.pokecraft.api.species.transform;

import com.mojang.serialization.Codec;
import com.thepokecraftmod.pokecraft.api.registry.builtin.PokeCraftRegistries;

public interface SpeciesTransform {
    Codec<SpeciesTransform> TYPE_BASED_CODEC = PokeCraftRegistries.SPECIES_TRANSFORM_TYPES.registryCodec().dispatch("type", SpeciesTransform::getType, Type::codec);

    Type<?> getType();

    record Type<T extends SpeciesTransform>(
            Codec<T> codec,
            Class<T> clazz
    ) {}
}
