package com.thepokecraftmod.pokecraft.api.battle.move;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.mimikyu.move.MoveInstance;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.FriendlyByteBuf;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Access to a Pokemons moves. Can change depending on the gimmicks used
 */
public class Moves {
    public static final Codec<Moves> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            MoveInstance.CODEC.listOf().fieldOf("moves").forGetter(Moves::getMoves)
    ).apply(instance, Moves::new));
    /**
     * Allows gimmicks to change the move before it's handed to anything else.
     */
    public Function<MoveInstance, MoveInstance> gimmick;
    /**
     * Moves before gimmicks take place.
     */
    private final List<MoveInstance> baseMoves;

    public Moves(List<MoveInstance> baseMoves) {
        this.baseMoves = baseMoves;
    }

    public Moves() {
        this.baseMoves = new ArrayList<>();
    }

    /**
     * @return the moves currently available to the Pokemon
     */
    public List<MoveInstance> getMoves() {
        if (gimmick != null)
            return baseMoves.stream()
                    .map(move -> gimmick.apply(move))
                    .toList();
        else return baseMoves;
    }

    public void serializeToByteBuf(FriendlyByteBuf buf) {
        buf.writeWithCodec(NbtOps.INSTANCE, CODEC, this);
    }
}
