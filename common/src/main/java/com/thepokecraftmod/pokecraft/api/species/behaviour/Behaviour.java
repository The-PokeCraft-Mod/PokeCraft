package com.thepokecraftmod.pokecraft.api.species.behaviour;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.unimon.api.ExtraCodecs;

public record Behaviour(
        Aggression aggression,
        int baseFriendship,
        boolean canSwim,
        boolean isSocial
) {
    public static final Codec<Behaviour> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            ExtraCodecs.enumCodec(Aggression.class).fieldOf("aggression").forGetter(Behaviour::aggression),
            Codec.INT.fieldOf("baseFriendship").forGetter(Behaviour::baseFriendship),
            Codec.BOOL.fieldOf("canSwim").forGetter(Behaviour::canSwim),
            Codec.BOOL.fieldOf("isSocial").forGetter(Behaviour::isSocial)
    ).apply(instance, Behaviour::new));
}
