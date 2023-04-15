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
