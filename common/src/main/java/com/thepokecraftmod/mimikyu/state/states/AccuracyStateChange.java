package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;

public class AccuracyStateChange extends StatSettingStateChange {

    public AccuracyStateChange(Participant<?> target, Integer value) {
        super(Type.ACCURACY, target, value);
    }

    public AccuracyStateChange(PokemonBattleData target, Integer value) {
        super(Type.ACCURACY, target, value);
    }

    @Override
    public void handle() {
        target.setAccuracy(value);
    }
}
