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

import java.util.Collections;
import java.util.List;

public class BattleAction {

    public final SortPosition sortingPosition;
    public final Participant<?> sender;
    public final RunMethod action;

    public BattleAction(SortPosition sortingPosition, Participant<?> sender, RunMethod action) {
        this.sortingPosition = sortingPosition;
        this.sender = sender;
        this.action = action;
    }

    public ActionResult execute(Battle battle, @Nullable String defaultEffect) {
        var result = new ActionResult(this);
        this.action.execute(result, battle, sender);
        return result;
    }

    /**
     * Add actions which carry onto the next turn
     */
    public List<BattleAction> addCarryOnActions() {
        return Collections.emptyList();
    }

    @FunctionalInterface
    public interface RunMethod {
        void execute(ActionResult result, Battle battle, Participant<?> sender);
    }
}
