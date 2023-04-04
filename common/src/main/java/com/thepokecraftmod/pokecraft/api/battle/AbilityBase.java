package com.thepokecraftmod.pokecraft.api.battle;

import com.thepokecraftmod.mimikyu.Battle;
import com.thepokecraftmod.mimikyu.ability.Ability;
import com.thepokecraftmod.mimikyu.action.Turn;
import com.thepokecraftmod.mimikyu.action.actions.BattleAction;

import java.util.List;

public class AbilityBase implements Ability {

    @Override
    public boolean takesEffectThisTurn(Battle<?> battle, Turn turn) {
        return false;
    }

    @Override
    public void effectTurn(Battle<?> battle, Turn turn) {

    }

    @Override
    public void postSortActions(List<BattleAction> actions) {

    }
}
