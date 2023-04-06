package com.thepokecraftmod.pokecraft.api.event.ctx;

import com.thepokecraftmod.pokecraft.api.pokemon.PokemonInstance;
import org.jetbrains.annotations.ApiStatus;

public class MovePokemonContext {

    public final PokemonInstance pokemon;
    public Origin origin;
    public Target target;

    @ApiStatus.Internal
    public MovePokemonContext(PokemonInstance pokemon, Origin origin, Target target) {
        this.pokemon = pokemon;
        this.origin = origin;
        this.target = target;
    }

    public enum Origin {
        NEW, BOX_STORAGE, PARTY, NONE
    }

    public enum Target {
        BOX_STORAGE, PARTY, NONE
    }
}