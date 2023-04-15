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
