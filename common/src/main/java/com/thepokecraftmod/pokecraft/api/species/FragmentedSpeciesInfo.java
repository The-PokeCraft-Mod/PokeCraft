package com.thepokecraftmod.pokecraft.api.species;

import com.thepokecraftmod.mimikyu.util.ElementType;
import com.thepokecraftmod.pokecraft.api.species.behaviour.Behaviour;
import com.thepokecraftmod.pokecraft.api.species.egg.EggInfo;
import com.thepokecraftmod.pokecraft.api.species.evolution.EvolutionTarget;
import com.thepokecraftmod.pokecraft.api.species.riding.RideInfo;
import com.thepokecraftmod.pokecraft.api.species.xp.XpInfo;
import com.thepokecraftmod.unimon.api.mon.StatStorage;

import java.util.List;

/**
 * (almost) all the information about a species. Separate due to the ability for transforms to modify info
 */
public record FragmentedSpeciesInfo(
        StatStorage stats,
        List<ElementType> typing,
        int catchRate,
        int genderRatio,
        XpInfo xpInfo,
        RideInfo rideInfo,
        Behaviour behaviour,
        AbilityPool abilityPool,
        EggInfo eggInfo,
        BoundingBoxSize boundingBox,
        List<EvolutionTarget> evoTargets,
        MovePool movePool
) {}
