package com.thepokecraftmod.pokecraft.api.mon;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.FriendlyByteBuf;

/**
 * Stores information about next level up
 */
public class LevelStorage {
    public static final Codec<LevelStorage> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("level").forGetter(i -> i.level),
            Codec.INT.fieldOf("xp").forGetter(i -> i.xp),
            Codec.INT.fieldOf("xpUntilNextLevel").forGetter(i -> i.xpUntilNextLevel)
    ).apply(instance, LevelStorage::new));

    public int level;
    public int xp;
    public int xpUntilNextLevel;

    public LevelStorage(int level, int xp, int xpUntilNextLevel) {
        this.level = level;
        this.xp = xp;
        this.xpUntilNextLevel = xpUntilNextLevel;
    }

    public LevelStorage() {
    }

    public void serializeToNbt(CompoundTag tag) {
        CODEC.encodeStart(NbtOps.INSTANCE, this);
    }

    public void serializeToByteBuf(FriendlyByteBuf buf) {
        buf.writeWithCodec(NbtOps.INSTANCE, CODEC, this);
    }
}
