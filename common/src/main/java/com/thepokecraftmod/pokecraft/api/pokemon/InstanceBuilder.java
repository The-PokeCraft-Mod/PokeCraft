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
