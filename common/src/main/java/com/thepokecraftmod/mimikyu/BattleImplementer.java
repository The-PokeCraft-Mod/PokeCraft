package com.thepokecraftmod.mimikyu;

import com.thepokecraftmod.mimikyu.action.ExecutionPoint;
import com.thepokecraftmod.mimikyu.action.RunActionResult;
import com.thepokecraftmod.mimikyu.action.Turn;
import com.thepokecraftmod.mimikyu.action.actions.BattleAction;

/**
 * This should be implemented to call packets to send to clients to allow them to know what's going on
 */
public interface BattleImplementer {

    void doFirstTurnActions(Battle battle, Turn turn);

    void newTurn(int turnNumber);

    RunActionResult runAction(BattleAction action, ExecutionPoint point);

    void onTurnFinish();

    void setBattle(Battle battle);

    /**
     * Uh oh...
     */
    void exceptionThrown(String location, Exception e);
}
