package com.thepokecraftmod.pokecraft.api.species.riding;

import com.mojang.serialization.Codec;
import com.thepokecraftmod.pokecraft.api.registry.builtin.RideInfoTypes;

public class NoRideInfo implements RideInfo {
    public static final Codec<NoRideInfo> CODEC = Codec.unit(new NoRideInfo());

    @Override
    public RideInfo.Type<?> getType() {
        return RideInfoTypes.NONE;
    }
}
