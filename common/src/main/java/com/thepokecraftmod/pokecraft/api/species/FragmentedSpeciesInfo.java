package com.thepokecraftmod.pokecraft.api.species;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.mimikyu.util.ElementType;
import com.thepokecraftmod.pokecraft.api.ExtraCodecs;
import com.thepokecraftmod.pokecraft.api.species.behaviour.Behaviour;
import com.thepokecraftmod.pokecraft.api.species.egg.EggInfo;
import com.thepokecraftmod.pokecraft.api.species.evolution.EvolutionTarget;
import com.thepokecraftmod.pokecraft.api.species.riding.RideInfo;
import com.thepokecraftmod.pokecraft.api.species.transform.SpeciesTransform;
import com.thepokecraftmod.pokecraft.api.species.xp.XpInfo;
import com.thepokecraftmod.pokecraft.api.mon.StatStorage;

import java.util.List;
import java.util.Optional;

/**
 * (almost) all the information about a species. Separate due to the ability for transforms to modify info
 */
public record FragmentedSpeciesInfo(
        Optional<StatStorage> stats,
        Optional<List<ElementType>> typing,
        Optional<Integer> catchRate,
        Optional<Integer> genderRatio,
        Optional<XpInfo> xpInfo,
        Optional<RideInfo> rideInfo,
        Optional<Behaviour> behaviour,
        Optional<AbilityPool> abilityPool,
        Optional<EggInfo> eggInfo,
        Optional<BoundingBoxSize> boundingBox,
        Optional<List<EvolutionTarget>> evoTargets,
        Optional<MovePool> movePool
) {
    public static final Codec<FragmentedSpeciesInfo> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            StatStorage.CODEC.optionalFieldOf("stats").forGetter(FragmentedSpeciesInfo::stats),
            ExtraCodecs.enumCodec(ElementType.class).listOf().optionalFieldOf("typing").forGetter(FragmentedSpeciesInfo::typing),
            Codec.INT.optionalFieldOf("catchRate").forGetter(FragmentedSpeciesInfo::catchRate),
            Codec.INT.optionalFieldOf("genderRatio").forGetter(FragmentedSpeciesInfo::genderRatio),
            XpInfo.CODEC.optionalFieldOf("xpInfo").forGetter(FragmentedSpeciesInfo::xpInfo),
            RideInfo.TYPE_BASED_CODEC.optionalFieldOf("rideInfo").forGetter(FragmentedSpeciesInfo::rideInfo),
            Behaviour.CODEC.optionalFieldOf("behaviour").forGetter(FragmentedSpeciesInfo::behaviour),
            AbilityPool.CODEC.optionalFieldOf("abilityPool").forGetter(FragmentedSpeciesInfo::abilityPool),
            EggInfo.CODEC.optionalFieldOf("eggInfo").forGetter(FragmentedSpeciesInfo::eggInfo),
            BoundingBoxSize.CODEC.optionalFieldOf("boundingBox").forGetter(FragmentedSpeciesInfo::boundingBox),
            EvolutionTarget.CODEC.listOf().optionalFieldOf("evoTargets").forGetter(FragmentedSpeciesInfo::evoTargets),
            MovePool.CODEC.optionalFieldOf("movePool").forGetter(FragmentedSpeciesInfo::movePool)
    ).apply(instance, FragmentedSpeciesInfo::new));

    public FragmentedSpeciesInfo(StatStorage stats, List<ElementType> typing, int catchRate, int genderRatio, XpInfo xpInfo, RideInfo rideInfo, Behaviour behaviour, AbilityPool abilityPool, EggInfo eggInfo, BoundingBoxSize boundingBox, List<EvolutionTarget> evoTargets, MovePool movePool) {
        this(Optional.ofNullable(stats),
                Optional.ofNullable(typing),
                Optional.of(catchRate),
                Optional.of(genderRatio),
                Optional.ofNullable(xpInfo),
                Optional.ofNullable(rideInfo),
                Optional.ofNullable(behaviour),
                Optional.ofNullable(abilityPool),
                Optional.ofNullable(eggInfo),
                Optional.ofNullable(boundingBox),
                Optional.ofNullable(evoTargets),
                Optional.ofNullable(movePool)
        );
    }
}
