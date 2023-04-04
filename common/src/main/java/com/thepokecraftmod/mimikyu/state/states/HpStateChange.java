package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;

public class HpStateChange extends StatSettingStateChange {

    public HpStateChange(Participant<?> target, Integer value) {
        super(Type.HP, target, value);
    }

    public HpStateChange(PokemonBattleData target, Integer value) {
        super(Type.HP, target, value);
    }

    @Override
    public void handle() {
        target.setHp(value);
    }
}
