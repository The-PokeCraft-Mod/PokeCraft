package com.thepokecraftmod.pokecraft.api.species;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.mimikyu.util.ElementType;
import com.thepokecraftmod.pokecraft.api.species.behaviour.Behaviour;
import com.thepokecraftmod.pokecraft.api.species.egg.EggInfo;
import com.thepokecraftmod.pokecraft.api.species.evolution.EvolutionTarget;
import com.thepokecraftmod.pokecraft.api.species.riding.RideInfo;
import com.thepokecraftmod.pokecraft.api.species.xp.XpInfo;
import com.thepokecraftmod.unimon.api.ExtraCodecs;
import com.thepokecraftmod.unimon.api.mon.Species;
import com.thepokecraftmod.unimon.api.mon.StatStorage;

import java.util.List;

public class PokemonSpecies implements Species {
    public static final Codec<PokemonSpecies> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            StatStorage.CODEC.fieldOf("stats").forGetter(PokemonSpecies::getStats),
            ExtraCodecs.enumCodec(ElementType.class).listOf().fieldOf("typing").forGetter(PokemonSpecies::getTyping),
            Codec.INT.fieldOf("catchRate").forGetter(PokemonSpecies::getCatchRate),
            Codec.INT.fieldOf("genderRatio").forGetter(PokemonSpecies::getGenderRatio),
            XpInfo.CODEC.fieldOf("xpInfo").forGetter(PokemonSpecies::getXpInfo),
            RideInfo.TYPE_BASED_CODEC.fieldOf("rideInfo").forGetter(PokemonSpecies::getRideInfo),
            Behaviour.CODEC.fieldOf("behaviour").forGetter(PokemonSpecies::getBehaviour),
            AbilityPool.CODEC.fieldOf("abilityPool").forGetter(PokemonSpecies::getAbilityPool),
            EggInfo.CODEC.fieldOf("eggInfo").forGetter(PokemonSpecies::getEggInfo),
            BoundingBoxSize.CODEC.fieldOf("boundingBox").forGetter(PokemonSpecies::getBoundingBox),
            EvolutionTarget.CODEC.listOf().fieldOf("evoTargets").forGetter(PokemonSpecies::getEvoTargets),
            MovePool.CODEC.fieldOf("movePool").forGetter(PokemonSpecies::getMovePool)
    ).apply(instance, PokemonSpecies::new));
    public final FragmentedSpeciesInfo info;

    public PokemonSpecies(StatStorage stats, List<ElementType> typing, int catchRate, int genderRatio, XpInfo xpInfo, RideInfo rideInfo, Behaviour behaviour, AbilityPool abilityPool, EggInfo eggInfo, BoundingBoxSize boundingBox, List<EvolutionTarget> evoTargets, MovePool movePool) {
        this.info = new FragmentedSpeciesInfo(
                stats,
                typing,
                catchRate,
                genderRatio,
                xpInfo,
                rideInfo,
                behaviour,
                abilityPool,
                eggInfo,
                boundingBox,
                evoTargets,
                movePool
        );
    }

    @Override
    public StatStorage getStats() {
        return info.stats();
    }

    public List<ElementType> getTyping() {
        return info.typing();
    }

    public int getCatchRate() {
        return info.catchRate();
    }

    public int getGenderRatio() {
        return info.genderRatio();
    }

    public XpInfo getXpInfo() {
        return info.xpInfo();
    }

    public RideInfo getRideInfo() {
        return info.rideInfo();
    }

    public Behaviour getBehaviour() {
        return info.behaviour();
    }

    public AbilityPool getAbilityPool() {
        return info.abilityPool();
    }

    public EggInfo getEggInfo(){
        return info.eggInfo();
    }

    public BoundingBoxSize getBoundingBox() {
        return info.boundingBox();
    }

    public List<EvolutionTarget> getEvoTargets() {
        return info.evoTargets();
    }

    public MovePool getMovePool() {
        return info.movePool();
    }
}
