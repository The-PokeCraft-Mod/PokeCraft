package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;

public class EvasivenessStateChange extends StatSettingStateChange {

    public EvasivenessStateChange(Participant<?> target, Integer value) {
        super(Type.EVASIVENESS, target, value);
    }

    public EvasivenessStateChange(PokemonBattleData target, Integer value) {
        super(Type.EVASIVENESS, target, value);
    }

    @Override
    public void handle() {
        target.setEvasiveness(value);
    }
}
