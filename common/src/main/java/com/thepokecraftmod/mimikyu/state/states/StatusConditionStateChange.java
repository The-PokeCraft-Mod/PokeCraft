package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;
import com.thepokecraftmod.mimikyu.state.SimpleStateChange;
import com.thepokecraftmod.mimikyu.util.StatusCondition;

public class StatusConditionStateChange extends SimpleStateChange<PokemonBattleData, StatusCondition> {

    public StatusConditionStateChange(PokemonBattleData target, StatusCondition value) {
        super(Type.STATUS_CONDITION, target, value);
    }

    @Override
    public void handle() {
        target.setStatusCondition(value);
    }
}
