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

package com.thepokecraftmod.mimikyu.move;

import com.thepokecraftmod.mimikyu.action.ActionResult;
import com.thepokecraftmod.mimikyu.action.Turn;
import com.thepokecraftmod.mimikyu.action.actions.ActionTarget;
import com.thepokecraftmod.mimikyu.move.equation.EquationHandler;
import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.util.MoveContext;
import com.thepokecraftmod.mimikyu.Battle;

/**
 * Allows moves to do things. This class is used to modify state of a battle such as changing weather, Damaging Pokemon, Changing Stats, etc.
 */
@FunctionalInterface
public interface MoveCommand {

    void execute(ExecutionContext ctx, Object[] args);

    record ExecutionContext(Battle battle, Turn turn, ActionResult result, MoveInstance move, Participant<?> sender, ActionTarget targets) {

        public MoveContext.Context convert(EquationHandler equationHandler, Participant<?> target) {
            return new MoveContext.Context(battle, turn, result, equationHandler, move, sender, targets, target);
        }
    }
}
