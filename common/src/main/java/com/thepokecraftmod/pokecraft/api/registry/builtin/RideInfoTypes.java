package com.thepokecraftmod.pokecraft.api.registry.builtin;

import com.mojang.serialization.Codec;
import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.species.riding.NoRideInfo;
import com.thepokecraftmod.pokecraft.api.species.riding.RideInfo;

public class RideInfoTypes {
    public static final RideInfo.Type<?> NONE = register("none", NoRideInfo.CODEC, NoRideInfo.class);

    public static void onInitialize() {
        PokeCraftRegistries.RIDE_INFO_TYPES.freeze();
    }

    public static <T extends RideInfo> RideInfo.Type<?> register(String name, Codec<T> codec, Class<T> clazz) {
        return PokeCraftRegistries.RIDE_INFO_TYPES.register(PokeCraft.id(name), new RideInfo.Type<>(codec, clazz));
    }
}
