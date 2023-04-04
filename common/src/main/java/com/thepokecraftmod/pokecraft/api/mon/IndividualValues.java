package com.thepokecraftmod.pokecraft.api.mon;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.PokeCraft;

/**
 * Used for storing Pokemon Individual Values (IV's)
 */
public class IndividualValues extends StatStorage {
    public static final Codec<IndividualValues> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("hp").forGetter(i -> i.hp),
            Codec.INT.fieldOf("speed").forGetter(i -> i.speed),
            Codec.INT.fieldOf("attack").forGetter(i -> i.attack),
            Codec.INT.fieldOf("defense").forGetter(i -> i.defense),
            Codec.INT.fieldOf("specialAttack").forGetter(i -> i.specialAttack),
            Codec.INT.fieldOf("specialDefense").forGetter(i -> i.specialDefense)
    ).apply(instance, IndividualValues::new));
    public static final int MAX_IV = 31;

    public IndividualValues() {
        this.hp = PokeCraft.RANDOM.nextInt(0, MAX_IV);
        this.attack = PokeCraft.RANDOM.nextInt(0, MAX_IV);
        this.defense = PokeCraft.RANDOM.nextInt(0, MAX_IV);
        this.specialAttack = PokeCraft.RANDOM.nextInt(0, MAX_IV);
        this.specialDefense = PokeCraft.RANDOM.nextInt(0, MAX_IV);
        this.speed = PokeCraft.RANDOM.nextInt(0, MAX_IV);
    }

    public IndividualValues(int hp, int speed, int attack, int defense, int specialAttack, int specialDefense) {
        super(hp, speed, attack, defense, specialAttack, specialDefense);
    }

    public IndividualValues copy() {
        var copy = new IndividualValues();
        copy.hp = hp;
        copy.attack = attack;
        copy.defense = defense;
        copy.specialAttack = specialAttack;
        copy.specialDefense = specialDefense;
        copy.speed = speed;
        return copy;
    }
}
