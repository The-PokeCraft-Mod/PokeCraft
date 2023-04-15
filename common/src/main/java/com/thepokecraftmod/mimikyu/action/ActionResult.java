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
import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.state.ContextualizedStateChange;
import com.thepokecraftmod.mimikyu.state.StateChange;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * Given to the clients for text and used on both sides for statuses
 */
public class ActionResult {

    public final BattleAction action;
    private String heading;
    private final List<ContextualizedStateChange> stateChanges = new ArrayList<>();
    @Nullable
    private String extraData;

    public ActionResult(BattleAction action) {
        this.action = action;
    }

    /**
     * Sets the main message for the result of the action
     */
    public void setHeading(String message) {
        this.heading = message;
    }

    public void pushStateChange(@Nullable Participant<?> cause, StateChange<?, ?> change, @Nullable ResourceLocation effectId, String message) {
        this.stateChanges.add(new ContextualizedStateChange(cause, change, effectId, message));
    }

    public boolean shouldSendToClient() {
        return stateChanges.size() > 0 || heading != null;
    }

    public String getHeading(Participant<?> sendingTo) {
        return heading;
    }

    public List<ContextualizedStateChange> getStateChanges(Participant<?> sendingTo) {
        return stateChanges;
    }

    public String getExtraData(Participant<?> sendingTo) {
        return extraData;
    }

    public void setExtraData(String extraData) {
        this.extraData = extraData;
    }
}
