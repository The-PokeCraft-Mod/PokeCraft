package com.thepokecraftmod.mimikyu.ability;

import com.thepokecraftmod.mimikyu.Battle;
import com.thepokecraftmod.mimikyu.action.Turn;
import com.thepokecraftmod.mimikyu.action.actions.BattleAction;

import java.util.List;

public interface Ability {

    /**
     * If this returns true, The client will be notified and {@link Ability#effectTurn(Battle, Turn)} will be executed.
     */
    boolean takesEffectThisTurn(Battle<?> battle, Turn turn);

    void effectTurn(Battle<?> battle, Turn turn);

    /**
     * Some abilities like pursuit change the order that actions take place. With this you can move the opponents attack to before the field pokemon switches out.
     * @param actions the already sorted list of actions
     */
    void postSortActions(List<BattleAction> actions);
}
