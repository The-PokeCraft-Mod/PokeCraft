package com.thepokecraftmod.mimikyu.participant;

import com.thepokecraftmod.mimikyu.participant.party.BattleParty;
import com.thepokecraftmod.mimikyu.util.FullNetworkable;
import com.thepokecraftmod.mimikyu.util.ReferenceNetworkable;

import java.util.UUID;

public interface Participant<T> extends FullNetworkable, ReferenceNetworkable {

    String getName();

    UUID getUuid();

    BattleParty getParty();

    T getHolder();
}
