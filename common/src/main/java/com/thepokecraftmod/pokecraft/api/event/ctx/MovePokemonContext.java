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