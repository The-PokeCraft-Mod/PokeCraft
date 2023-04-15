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

package com.thepokecraftmod.pokecraft.api.pokemon;

import com.thepokecraftmod.pokecraft.PokeCraft;
import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.List;

public class InstanceBuilder {
    private final List<ResourceLocation> transforms = new ArrayList<>();
    private ResourceLocation species = PokeCraft.id("wooper");
    private int level;

    public InstanceBuilder species(ResourceLocation species) {
        if(species.getNamespace().equals(ResourceLocation.DEFAULT_NAMESPACE)) species = PokeCraft.id(species.getPath());
        this.species = species;
        return this;
    }

    public InstanceBuilder level(int level) {
        this.level = level;
        return this;
    }

    public InstanceBuilder shiny(boolean shiny) {
        if (shiny) transforms.add(PokeCraft.id("shiny"));
        return this;
    }

    public PokemonInstance create() {
        var instance = new PokemonInstance(this.species);
        if (this.level != 0) instance.levelInfo.level = this.level;
        instance.transforms.addAll(this.transforms);
        return instance;
    }
}
