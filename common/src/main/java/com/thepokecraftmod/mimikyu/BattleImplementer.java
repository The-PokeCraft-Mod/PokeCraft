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
