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

import com.thepokecraftmod.mimikyu.participant.NamedTeam;
import com.thepokecraftmod.mimikyu.participant.Participant;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * The target of a {@link TargetingAction}. Once created the Participants list is unmodifiable
 */
public class ActionTarget implements Iterable<Participant<?>>{
    public final List<Participant<?>> participantTargets;

    public ActionTarget(Participant<?>... targets) {
        this.participantTargets = List.of(targets);
    }

    public ActionTarget(Participant<?> target) {
        this.participantTargets = List.of(target);
    }

    public ActionTarget(NamedTeam team) {
        this.participantTargets = Collections.unmodifiableList(team.participants());
    }

    @Override
    public Iterator<Participant<?>> iterator() {
        return participantTargets.iterator();
    }

    public int size() {
        return participantTargets.size();
    }
}
