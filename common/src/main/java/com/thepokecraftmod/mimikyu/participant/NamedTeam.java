package com.thepokecraftmod.mimikyu.participant;

import java.util.List;

public record NamedTeam(String name, List<Participant<?>> participants) {

    public NamedTeam(List<Participant<?>> participants) {
        this(null, participants);
    }
}
