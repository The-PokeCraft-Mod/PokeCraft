package com.thepokecraftmod.pokecraft.api.species.riding;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.*;
import com.thepokecraftmod.pokecraft.api.registry.builtin.RideInfoTypes;

public class NoRideInfo implements RideInfo {
    public static final Codec<NoRideInfo> CODEC = Codec.of(new Encoder<>() {
        @Override
        public <T> DataResult<T> encode(NoRideInfo input, DynamicOps<T> ops, T prefix) {
            return DataResult.success(prefix);
        }
    }, new Decoder<>() {
        @Override
        public <T> DataResult<Pair<NoRideInfo, T>> decode(DynamicOps<T> ops, T input) {
            return DataResult.success(new Pair<>(new NoRideInfo(), input));
        }
    });

    @Override
    public RideInfo.Type<?> getType() {
        return RideInfoTypes.NONE;
    }
}
