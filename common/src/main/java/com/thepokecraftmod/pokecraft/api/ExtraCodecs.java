package com.thepokecraftmod.pokecraft.api;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import java.util.Locale;
import java.util.UUID;

/**
 * Extra Codecs Missing from Minecraft
 */
public class ExtraCodecs {
    public static final Codec<UUID> UUID = RecordCodecBuilder.create(instance -> instance.group(
        Codec.LONG.fieldOf("lesserBits").forGetter(java.util.UUID::getLeastSignificantBits),
        Codec.LONG.fieldOf("greaterBits").forGetter(java.util.UUID::getMostSignificantBits)
    ).apply(instance, UUID::new));

    public static <T extends Enum<T>> Codec<T> enumCodec(Class<T> clazz) {
        return Codec.STRING.xmap(a -> Enum.valueOf(clazz, a.toUpperCase(Locale.ENGLISH)), Enum::name);
    }
}
