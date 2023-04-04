package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;

public class SpecialAttackStateChange extends StatSettingStateChange {

    public SpecialAttackStateChange(Participant<?> target, Integer value) {
        super(Type.SPECIAL_ATTACK, target, value);
    }

    public SpecialAttackStateChange(PokemonBattleData target, Integer value) {
        super(Type.SPECIAL_ATTACK, target, value);
    }

    @Override
    public void handle() {
        target.setSpecialAttack(value);
    }
}
