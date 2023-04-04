package com.thepokecraftmod.pokecraft.api.species.egg;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.unimon.api.ExtraCodecs;

import java.util.List;

public record EggInfo(
        List<EggGroup> groups,
        int steps
) {
    public static final Codec<EggInfo> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ExtraCodecs.enumCodec(EggGroup.class).listOf().fieldOf("groups").forGetter(EggInfo::groups),
            Codec.INT.fieldOf("steps").forGetter(EggInfo::steps)
    ).apply(instance, EggInfo::new));
}
