package com.thepokecraftmod.mimikyu.action;

import com.thepokecraftmod.mimikyu.action.actions.BattleAction;
import com.thepokecraftmod.mimikyu.action.actions.TargetingAction;

import java.util.List;

/**
 * The order which is used to determine how {@link TargetingAction}'s are executed. <br>The order used is ABSOLUTE_FIRST -> SPECIAL_MECHANICS -> BEFORE_MOVES -> MOVES -> AFTER_MOVES
 */
public enum SortPosition {
    ABSOLUTE_FIRST, SPECIAL_MECHANICS, BEFORE_MOVES, MOVES, AFTER_MOVES;

    public static List<BattleAction> getAllFrom(List<BattleAction> queuedActions, SortPosition pos) {
        return queuedActions.stream().filter(q -> q.sortingPosition == pos).toList();
    }
}