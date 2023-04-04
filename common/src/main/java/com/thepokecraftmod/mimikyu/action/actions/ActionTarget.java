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
