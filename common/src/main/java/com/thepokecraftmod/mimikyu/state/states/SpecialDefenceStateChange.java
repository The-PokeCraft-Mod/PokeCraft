package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;

public class SpecialDefenceStateChange extends StatSettingStateChange {

    public SpecialDefenceStateChange(Participant<?> target, Integer value) {
        super(Type.SPECIAL_DEFENCE, target, value);
    }

    public SpecialDefenceStateChange(PokemonBattleData target, Integer value) {
        super(Type.SPECIAL_DEFENCE, target, value);
    }

    @Override
    public void handle() {
        target.setSpecialDefense(value);
    }
}
