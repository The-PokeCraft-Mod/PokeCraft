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
import com.thepokecraftmod.mimikyu.state.StateChange;
import com.thepokecraftmod.mimikyu.state.ContextualizedStateChange;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * A personalised version of {@link ActionResult} which has different messages depending on the person receiving it. {@link StateChange}'s <b>CANNOT</b> be different per participant
 */
public class PersonalActionResult extends ActionResult {

    private Function<Participant<?>, String> suppliedHeader;
    private final List<Function<Participant<?>, ContextualizedStateChange>> suppliedChanges = new ArrayList<>();
    private Function<Participant<?>, String> suppliedExtraData;

    public PersonalActionResult(BattleAction action) {
        super(action);
    }

    public void pushStateChange(Function<Participant<?>, ContextualizedStateChange> change) {
        this.suppliedChanges.add(change);
    }

    public void setHeading(Function<Participant<?>, String> message) {
        this.suppliedHeader = message;
    }

    @Override
    public String getHeading(Participant<?> sendingTo) {
        return suppliedHeader.apply(sendingTo);
    }

    public void setExtraData(Function<Participant<?>, String> suppliedExtraData) {
        this.suppliedExtraData = suppliedExtraData;
    }

    @Override
    public String getExtraData(Participant<?> sendingTo) {
        return suppliedExtraData == null ? null : suppliedExtraData.apply(sendingTo);
    }

    @Override
    public List<ContextualizedStateChange> getStateChanges(Participant<?> sendingTo) {
        return suppliedChanges.stream()
                .map(func -> func.apply(sendingTo))
                .toList();
    }

    @Override
    public boolean shouldSendToClient() {
        return suppliedChanges.size() > 0 || suppliedHeader != null;
    }
}
