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

package com.thepokecraftmod.mimikyu.participant.party;

import com.thepokecraftmod.mimikyu.BattleAssertions;
import com.thepokecraftmod.mimikyu.util.FullNetworkable;
import net.minecraft.network.FriendlyByteBuf;

import java.util.Collections;
import java.util.List;

/**
 * The Party of pokemon that can be picked from to go on the field.
 */
public class BattleParty implements FullNetworkable {

    public final List<PokemonBattleData> party;
    public PokemonBattleData fieldPokemon;

    /**
     * @param firstPokemon the first Pokemon to be sent onto the field
     * @param availablePokemon the Pokemon that are also in the party and can be used in the battle. This cannot be modified during a battle.
     */
    public BattleParty(PokemonBattleData firstPokemon, List<PokemonBattleData> availablePokemon) {
        this.fieldPokemon = firstPokemon;
        this.party = Collections.unmodifiableList(availablePokemon);
        BattleAssertions.assertTrue(party.contains(fieldPokemon));
    }

    @Override
    public void writeAsFullObject(FriendlyByteBuf buffer) {
        var partyOffset = party.indexOf(fieldPokemon);
        buffer.writeInt(partyOffset);

        for (var pokemonBattleData : party) {
            pokemonBattleData.writeAsFullObject(buffer);
        }
    }
}
