package com.thepokecraftmod.pokecraft.api.species;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.unimon.api.mon.FullStatStorage;
import com.thepokecraftmod.unimon.api.mon.Species;

public class PokemonSpecies implements Species {
    public static final Codec<PokemonSpecies> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("baseHp").forGetter(i -> i.baseHp)
    ).apply(instance, PokemonSpecies::new));

    private final Integer baseHp;

    public PokemonSpecies(Integer baseHp) {
        this.baseHp = baseHp;
    }

    @Override
    public FullStatStorage getStats() {
        return null;
    }
}
