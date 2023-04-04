package com.thepokecraftmod.mimikyu;

import com.thepokecraftmod.mimikyu.action.Turn;
import com.thepokecraftmod.mimikyu.action.actions.BattleAction;

public interface HeldItem {

    /**
     * Called when the turn is finished to allow you to add some final changes to the end of the turn.
     */
    void onTurnFinish(Battle battle, Turn turn);

    /**
     * Used for things like life orb to execute a state change to take away user health
     */
    void onUserAction(Battle battle, Turn turn, BattleAction action);
}
