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
import com.thepokecraftmod.pokecraft.api.species.behavior.Behavior;
import com.thepokecraftmod.pokecraft.api.species.egg.EggInfo;
import com.thepokecraftmod.pokecraft.api.species.evolution.Evolution;
import com.thepokecraftmod.pokecraft.api.species.riding.RideInfo;
import com.thepokecraftmod.pokecraft.api.species.transform.ModifySpeciesTransform;
import com.thepokecraftmod.pokecraft.api.species.transform.SpeciesTransform;
import com.thepokecraftmod.pokecraft.api.species.xp.XpInfo;
import com.thepokecraftmod.pokecraft.api.ExtraCodecs;
import com.thepokecraftmod.pokecraft.api.pokemon.StatStorage;

import java.util.List;
import java.util.Map;

public class PokemonSpecies {
    public static final Codec<PokemonSpecies> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            StatStorage.CODEC.fieldOf("stats").forGetter(PokemonSpecies::getStats),
            ExtraCodecs.enumCodec(ElementType.class).listOf().fieldOf("typing").forGetter(PokemonSpecies::getTyping),
            Codec.INT.fieldOf("catchRate").forGetter(PokemonSpecies::getCatchRate),
            Codec.INT.fieldOf("genderRatio").forGetter(PokemonSpecies::getGenderRatio),
            XpInfo.CODEC.fieldOf("xpInfo").forGetter(PokemonSpecies::getXpInfo),
            RideInfo.TYPE_BASED_CODEC.fieldOf("rideInfo").forGetter(PokemonSpecies::getRideInfo),
            Behavior.CODEC.fieldOf("behaviour").forGetter(PokemonSpecies::getBehaviour),
            AbilityPool.CODEC.fieldOf("abilityPool").forGetter(PokemonSpecies::getAbilityPool),
            EggInfo.CODEC.fieldOf("eggInfo").forGetter(PokemonSpecies::getEggInfo),
            BoundingBoxSize.CODEC.fieldOf("boundingBox").forGetter(PokemonSpecies::getBoundingBox),
            Evolution.CODEC.listOf().fieldOf("evolutions").forGetter(PokemonSpecies::getEvoTargets),
            MovePool.CODEC.fieldOf("movePool").forGetter(PokemonSpecies::getMovePool),
            Codec.unboundedMap(Codec.STRING, SpeciesTransform.TYPE_BASED_CODEC).fieldOf("transforms").forGetter(PokemonSpecies::getTransforms)
    ).apply(instance, PokemonSpecies::new));
    private final PartialSpeciesInfo info;
    private final Map<String, SpeciesTransform> transforms;

    public PokemonSpecies(StatStorage stats, List<ElementType> typing, int catchRate, int genderRatio, XpInfo xpInfo, RideInfo rideInfo, Behavior behavior, AbilityPool abilityPool, EggInfo eggInfo, BoundingBoxSize boundingBox, List<Evolution> evoTargets, MovePool movePool, Map<String, SpeciesTransform> transforms) {
        this.info = new PartialSpeciesInfo(
                stats,
                typing,
                catchRate,
                genderRatio,
                xpInfo,
                rideInfo,
                behavior,
                abilityPool,
                eggInfo,
                boundingBox,
                evoTargets,
                movePool
        );
        this.transforms = transforms;
    }

    public StatStorage getStats() {
        return info.stats().orElseThrow();
    }

    public StatStorage getStats(List<SpeciesTransform> transforms) {
        for (var transform : transforms) {
            if (transform instanceof ModifySpeciesTransform modifyingTransform && modifyingTransform.info().stats().isPresent())
                return modifyingTransform.info().stats().get();
        }

        return getStats();
    }

    public List<ElementType> getTyping() {
        return info.typing().orElseThrow();
    }

    public int getCatchRate() {
        return info.catchRate().orElseThrow();
    }

    public int getGenderRatio() {
        return info.genderRatio().orElseThrow();
    }

    public XpInfo getXpInfo() {
        return info.xpInfo().orElseThrow();
    }

    public RideInfo getRideInfo() {
        return info.rideInfo().orElseThrow();
    }

    public Behavior getBehaviour() {
        return info.behaviour().orElseThrow();
    }

    public AbilityPool getAbilityPool() {
        return info.abilityPool().orElseThrow();
    }

    public EggInfo getEggInfo() {
        return info.eggInfo().orElseThrow();
    }

    public BoundingBoxSize getBoundingBox() {
        return info.boundingBox().orElseThrow();
    }

    public List<Evolution> getEvoTargets() {
        return info.evoTargets().orElseThrow();
    }

    public MovePool getMovePool() {
        return info.movePool().orElseThrow();
    }

    public Map<String, SpeciesTransform> getTransforms() {
        return transforms;
    }
}
