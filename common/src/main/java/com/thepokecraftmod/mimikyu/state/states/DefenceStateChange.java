package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;

public class DefenceStateChange extends StatSettingStateChange {

    public DefenceStateChange(Participant<?> target, Integer value) {
        super(Type.DEFENCE, target, value);
    }

    public DefenceStateChange(PokemonBattleData target, Integer value) {
        super(Type.DEFENCE, target, value);
    }

    @Override
    public void handle() {
        target.setDefense(value);
    }
}
