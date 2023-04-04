package com.thepokecraftmod.pokecraft.api.mon;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;

/**
 * {@link StatStorage} but including evasiveness, accuracy, and max hp
 */
public class FullStatStorage extends StatStorage {
    public static final Codec<FullStatStorage> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("hp").forGetter(i -> i.hp),
            Codec.INT.fieldOf("speed").forGetter(i -> i.speed),
            Codec.INT.fieldOf("attack").forGetter(i -> i.attack),
            Codec.INT.fieldOf("defense").forGetter(i -> i.defense),
            Codec.INT.fieldOf("specialAttack").forGetter(i -> i.specialAttack),
            Codec.INT.fieldOf("specialDefense").forGetter(i -> i.specialDefense),
            Codec.INT.fieldOf("evasiveness").forGetter(i -> i.evasiveness),
            Codec.INT.fieldOf("accuracy").forGetter(i -> i.accuracy),
            Codec.INT.fieldOf("maxHp").forGetter(i -> i.maxHp)
    ).apply(instance, FullStatStorage::new));
    public int evasiveness;
    public int accuracy;
    public int maxHp;

    public FullStatStorage(int hp, int speed, int attack, int defense, int specialAttack, int specialDefense, int evasiveness, int accuracy, int maxHp) {
        this.hp = hp;
        this.speed = speed;
        this.attack = attack;
        this.defense = defense;
        this.specialAttack = specialAttack;
        this.specialDefense = specialDefense;
        this.evasiveness = evasiveness;
        this.accuracy = accuracy;
        this.maxHp = maxHp;
    }

    public FullStatStorage() {
    }

    @Override
    public void serializeToNbt(CompoundTag tag) {
        super.serializeToNbt(tag);
        tag.putInt("Evasiveness", evasiveness);
        tag.putInt("Accuracy", accuracy);
        tag.putInt("MaxHp", maxHp);
    }

    @Override
    public void serializeToByteBuf(FriendlyByteBuf buf) {
        super.serializeToByteBuf(buf);
        buf.writeVarInt(evasiveness);
        buf.writeVarInt(accuracy);
        buf.writeVarInt(maxHp);
    }
}
