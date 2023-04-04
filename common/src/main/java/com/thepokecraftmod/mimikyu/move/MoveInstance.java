package com.thepokecraftmod.mimikyu.move;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

/**
 * An instance of a move. Contains the Data for the original move and the PP for that specific instance of the move
 */
public class MoveInstance {
    public static final Codec<MoveInstance> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Move.CODEC.fieldOf("data").forGetter(i -> i.data),
            Codec.INT.fieldOf("pp").forGetter(i -> i.pp)
    ).apply(instance, MoveInstance::new));
    public final Move data;
    public int pp;

    public MoveInstance(Move data) {
        this.data = data;
        this.pp = data.maxPP();
    }

    public MoveInstance(Move data, int pp) {
        this.data = data;
        this.pp = pp;
    }

    public int getPPMax() {
        return data.maxPP();
    }
}
