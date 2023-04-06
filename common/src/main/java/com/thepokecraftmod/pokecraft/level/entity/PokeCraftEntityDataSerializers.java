package com.thepokecraftmod.pokecraft.level.entity;

import com.thepokecraftmod.pokecraft.api.pokemon.PokemonInstance;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.syncher.EntityDataSerializer;
import net.minecraft.network.syncher.EntityDataSerializers;

/**
 * Extra {@link net.minecraft.network.syncher.EntityDataSerializer}'s used in UniMon
 */
public class PokeCraftEntityDataSerializers {
    public static final EntityDataSerializer<PokemonInstance> POKEMON_INSTANCE = EntityDataSerializer.simple(
            (buf, PokemonInstance) -> PokemonInstance.serializeToByteBuf(buf),
            buf -> buf.readWithCodec(NbtOps.INSTANCE, PokemonInstance.CODEC)
    );

    public static void onInitialize() {
        EntityDataSerializers.registerSerializer(POKEMON_INSTANCE);
    }
}
