package com.thepokecraftmod.pokecraft.api.pokemon;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

/**
 * Used for storing Pokemon Effort Values (EV's)
 */
public class EffortValues extends StatStorage {
    public static final Codec<EffortValues> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("hp").forGetter(i -> i.hp),
            Codec.INT.fieldOf("speed").forGetter(i -> i.speed),
            Codec.INT.fieldOf("attack").forGetter(i -> i.attack),
            Codec.INT.fieldOf("defense").forGetter(i -> i.defense),
            Codec.INT.fieldOf("specialAttack").forGetter(i -> i.specialAttack),
            Codec.INT.fieldOf("specialDefense").forGetter(i -> i.specialDefense)
    ).apply(instance, EffortValues::new));
    public static final int MAX_EVS = 252;
    public static final int MAX_TOTAL_EVS = 510;

    public EffortValues(int hp, int speed, int attack, int defense, int specialAttack, int specialDefense) {
        super(hp, speed, attack, defense, specialAttack, specialDefense);
    }

    public EffortValues() {
    }

    /**
     * Adds another {@link EffortValues} to this {@link EffortValues}
     *
     * @param evStorage the other {@link EffortValues} to add to this {@link EffortValues}
     */
    public void addEv(EffortValues evStorage) {
        int remainingEVs = this.getRemainingEVs();
        this.hp = Math.min(MAX_EVS, this.hp + Math.min(remainingEVs, evStorage.hp));
        remainingEVs = this.getRemainingEVs();
        this.attack = Math.min(MAX_EVS, this.attack + Math.min(remainingEVs, evStorage.attack));
        remainingEVs = this.getRemainingEVs();
        this.defense = Math.min(MAX_EVS, this.defense + Math.min(remainingEVs, evStorage.defense));
        remainingEVs = this.getRemainingEVs();
        this.specialAttack = Math.min(MAX_EVS, this.specialAttack + Math.min(remainingEVs, evStorage.specialAttack));
        remainingEVs = this.getRemainingEVs();
        this.specialDefense = Math.min(MAX_EVS, this.specialDefense + Math.min(remainingEVs, evStorage.specialDefense));
        remainingEVs = this.getRemainingEVs();
        this.speed = Math.min(MAX_EVS, this.speed + Math.min(remainingEVs, evStorage.speed));
    }

    private int getRemainingEVs() {
        return Math.max(0, MAX_TOTAL_EVS - this.hp - this.attack - this.defense - this.specialAttack - this.specialDefense - this.speed);
    }

    public EffortValues copy() {
        var copy = new EffortValues();
        copy.hp = hp;
        copy.attack = attack;
        copy.defense = defense;
        copy.specialAttack = specialAttack;
        copy.specialDefense = specialDefense;
        copy.speed = speed;
        return copy;
    }
}
