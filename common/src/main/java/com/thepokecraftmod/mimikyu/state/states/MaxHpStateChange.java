package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;

public class MaxHpStateChange extends StatSettingStateChange {

    public MaxHpStateChange(Participant<?> target, Integer value) {
        super(Type.MAX_HP, target, value);
    }

    public MaxHpStateChange(PokemonBattleData target, Integer value) {
        super(Type.MAX_HP, target, value);
    }

    @Override
    public void handle() {
        target.setMaxHp(value);
    }
}
