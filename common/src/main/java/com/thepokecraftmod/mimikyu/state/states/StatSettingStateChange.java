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

package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.participant.party.PokemonBattleData;
import com.thepokecraftmod.mimikyu.state.SimpleStateChange;

public abstract class StatSettingStateChange extends SimpleStateChange<PokemonBattleData, Integer> {

    public StatSettingStateChange(Type type, Participant<?> target, Integer value) {
        this(type, target.getParty().fieldPokemon, value);
    }

    public StatSettingStateChange(Type type, PokemonBattleData target, Integer value) {
        super(type, target, value);
    }
}
