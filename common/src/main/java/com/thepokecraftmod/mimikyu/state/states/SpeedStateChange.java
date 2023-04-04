package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;

public class SpeedStateChange extends StatSettingStateChange {

    public SpeedStateChange(Participant<?> target, Integer value) {
        super(Type.SPEED, target, value);
    }

    public SpeedStateChange(PokemonBattleData target, Integer value) {
        super(Type.SPEED, target, value);
    }

    @Override
    public void handle() {
        target.setSpeed(value);
    }
}
