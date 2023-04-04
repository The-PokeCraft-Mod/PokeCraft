package com.thepokecraftmod.pokecraft.api.species.riding;

import com.mojang.serialization.Codec;
import com.thepokecraftmod.pokecraft.api.registry.builtin.PokeCraftRegistries;

public interface RideInfo {
    Codec<RideInfo> TYPE_BASED_CODEC = PokeCraftRegistries.RIDE_INFO_TYPES.registryCodec().dispatch("type", RideInfo::getType, Type::codec);

    Type<?> getType();

    record Type<T extends RideInfo>(
            Codec<T> codec,
            Class<T> clazz
    ) {}
}
