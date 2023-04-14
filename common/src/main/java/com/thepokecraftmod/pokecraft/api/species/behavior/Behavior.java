package com.thepokecraftmod.pokecraft.api.species.behavior;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.ExtraCodecs;

public record Behavior(
        Aggression aggression,
        int baseFriendship,
        boolean canSwim,
        boolean isSocial
) {
    public static final Codec<Behavior> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ExtraCodecs.enumCodec(Aggression.class).fieldOf("aggression").forGetter(Behavior::aggression),
            Codec.INT.fieldOf("baseFriendship").forGetter(Behavior::baseFriendship),
            Codec.BOOL.fieldOf("canSwim").forGetter(Behavior::canSwim),
            Codec.BOOL.fieldOf("isSocial").forGetter(Behavior::isSocial)
    ).apply(instance, Behavior::new));
}
