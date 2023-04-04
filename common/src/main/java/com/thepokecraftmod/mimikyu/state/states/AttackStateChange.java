package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;

public class AttackStateChange extends StatSettingStateChange {

    public AttackStateChange(Participant<?> target, Integer value) {
        super(Type.ATTACK, target, value);
    }

    public AttackStateChange(PokemonBattleData target, Integer value) {
        super(Type.ATTACK, target, value);
    }

    @Override
    public void handle() {
        target.setAttack(value);
    }
}
