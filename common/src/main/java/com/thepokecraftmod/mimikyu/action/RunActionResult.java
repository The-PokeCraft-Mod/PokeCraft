package com.thepokecraftmod.mimikyu.action;

import com.thepokecraftmod.mimikyu.action.actions.BattleAction;

import java.util.ArrayList;
import java.util.List;

public class RunActionResult {
    public final List<BattleAction> actionsAfterwards = new ArrayList<>();
    public final List<BattleAction> actionsAtEndOfCurrentTurn = new ArrayList<>();
    public final List<BattleAction> actionsForNextTurnStart = new ArrayList<>();
}
