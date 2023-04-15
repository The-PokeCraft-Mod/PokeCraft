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

package com.thepokecraftmod.pokecraft.api.species;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.mimikyu.util.ElementType;
import com.thepokecraftmod.pokecraft.api.ExtraCodecs;
import com.thepokecraftmod.pokecraft.api.species.behavior.Behavior;
import com.thepokecraftmod.pokecraft.api.species.egg.EggInfo;
import com.thepokecraftmod.pokecraft.api.species.evolution.Evolution;
import com.thepokecraftmod.pokecraft.api.species.riding.RideInfo;
import com.thepokecraftmod.pokecraft.api.species.xp.XpInfo;
import com.thepokecraftmod.pokecraft.api.pokemon.StatStorage;

import java.util.List;
import java.util.Optional;

/**
 * (almost) all the information about a species. Separate due to the ability for transforms to modify info
 */
public record PartialSpeciesInfo(
        Optional<StatStorage> stats,
        Optional<List<ElementType>> typing,
        Optional<Integer> catchRate,
        Optional<Integer> genderRatio,
        Optional<XpInfo> xpInfo,
        Optional<RideInfo> rideInfo,
        Optional<Behavior> behaviour,
        Optional<AbilityPool> abilityPool,
        Optional<EggInfo> eggInfo,
        Optional<BoundingBoxSize> boundingBox,
        Optional<List<Evolution>> evoTargets,
        Optional<MovePool> movePool
) {
    public static final Codec<PartialSpeciesInfo> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            StatStorage.CODEC.optionalFieldOf("stats").forGetter(PartialSpeciesInfo::stats),
            ExtraCodecs.enumCodec(ElementType.class).listOf().optionalFieldOf("typing").forGetter(PartialSpeciesInfo::typing),
            Codec.INT.optionalFieldOf("catchRate").forGetter(PartialSpeciesInfo::catchRate),
            Codec.INT.optionalFieldOf("genderRatio").forGetter(PartialSpeciesInfo::genderRatio),
            XpInfo.CODEC.optionalFieldOf("xpInfo").forGetter(PartialSpeciesInfo::xpInfo),
            RideInfo.TYPE_BASED_CODEC.optionalFieldOf("rideInfo").forGetter(PartialSpeciesInfo::rideInfo),
            Behavior.CODEC.optionalFieldOf("behaviour").forGetter(PartialSpeciesInfo::behaviour),
            AbilityPool.CODEC.optionalFieldOf("abilityPool").forGetter(PartialSpeciesInfo::abilityPool),
            EggInfo.CODEC.optionalFieldOf("eggInfo").forGetter(PartialSpeciesInfo::eggInfo),
            BoundingBoxSize.CODEC.optionalFieldOf("boundingBox").forGetter(PartialSpeciesInfo::boundingBox),
            Evolution.CODEC.listOf().optionalFieldOf("evolutions").forGetter(PartialSpeciesInfo::evoTargets),
            MovePool.CODEC.optionalFieldOf("movePool").forGetter(PartialSpeciesInfo::movePool)
    ).apply(instance, PartialSpeciesInfo::new));

    public PartialSpeciesInfo(StatStorage stats, List<ElementType> typing, int catchRate, int genderRatio, XpInfo xpInfo, RideInfo rideInfo, Behavior behavior, AbilityPool abilityPool, EggInfo eggInfo, BoundingBoxSize boundingBox, List<Evolution> evoTargets, MovePool movePool) {
        this(Optional.ofNullable(stats),
                Optional.ofNullable(typing),
                Optional.of(catchRate),
                Optional.of(genderRatio),
                Optional.ofNullable(xpInfo),
                Optional.ofNullable(rideInfo),
                Optional.ofNullable(behavior),
                Optional.ofNullable(abilityPool),
                Optional.ofNullable(eggInfo),
                Optional.ofNullable(boundingBox),
                Optional.ofNullable(evoTargets),
                Optional.ofNullable(movePool)
        );
    }
}
