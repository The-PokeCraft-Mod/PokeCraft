package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;
import com.thepokecraftmod.mimikyu.state.SimpleStateChange;

public abstract class StatSettingStateChange extends SimpleStateChange<PokemonBattleData, Integer> {

    public StatSettingStateChange(Type type, Participant<?> target, Integer value) {
        this(type, target.getParty().fieldPokemon, value);
    }

    public StatSettingStateChange(Type type, PokemonBattleData target, Integer value) {
        super(type, target, value);
    }
}
