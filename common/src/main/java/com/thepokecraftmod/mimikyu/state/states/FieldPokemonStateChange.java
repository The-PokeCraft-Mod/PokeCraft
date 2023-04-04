package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;
import com.thepokecraftmod.mimikyu.state.SimpleStateChange;

public class FieldPokemonStateChange extends SimpleStateChange<Participant, PokemonBattleData> {

    public FieldPokemonStateChange(Participant target, PokemonBattleData value) {
        super(Type.FIELD, target, value);
    }

    @Override
    public void handle() {
        target.getParty().fieldPokemon = value;
    }
}
