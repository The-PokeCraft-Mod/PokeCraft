/*
 * Copyright (C) 2023 ThePokeCraftMod
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

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