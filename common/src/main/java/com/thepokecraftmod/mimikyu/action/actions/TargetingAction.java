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

package com.thepokecraftmod.mimikyu.action.actions;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.Battle;
import com.thepokecraftmod.mimikyu.action.ActionResult;
import com.thepokecraftmod.mimikyu.action.SortPosition;
import org.jetbrains.annotations.Nullable;

/**
 * Anything which can happen during a turn
 */
public class TargetingAction extends BattleAction {

    protected final ActionTarget target;

    public TargetingAction(SortPosition sortingPosition, Participant<?> sender, ActionTarget target, TargetingRunMethod action) {
        super(sortingPosition, sender, action);
        this.target = target;
    }

    public ActionResult execute(Battle battle, @Nullable String defaultEffect) {
        var result = new ActionResult(this);
        ((TargetingRunMethod) this.action).execute(result, battle, sender, target);
        return result;
    }

    @FunctionalInterface
    public interface TargetingRunMethod extends RunMethod {
        @Override
        default void execute(ActionResult result, Battle battle, Participant<?> sender) {
            throw new RuntimeException("Tried Executing without Target on TargetingRunMethod");
        }

        void execute(ActionResult result, Battle battle, Participant<?> sender, ActionTarget target);
    }
}
