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

import com.thepokecraftmod.mimikyu.ability.Ability;
import com.thepokecraftmod.mimikyu.HeldItem;
import com.thepokecraftmod.mimikyu.util.ElementType;
import com.thepokecraftmod.mimikyu.util.FullNetworkable;
import com.thepokecraftmod.mimikyu.util.ReferenceNetworkable;
import com.thepokecraftmod.mimikyu.util.StatusCondition;
import net.minecraft.FieldsAreNonnullByDefault;
import net.minecraft.network.chat.Component;

import java.util.*;

/**
 * All the information the Mimikyu battle api has access to during a battle. For implementation, You will be able to cast this object to get extra values if needed. Ideally any value needed for a pokemon fight unless ridiculous like the amount of x move used will be stored here.
 */
@FieldsAreNonnullByDefault
public interface PokemonBattleData extends FullNetworkable, ReferenceNetworkable {

    /**
     * Allows you to store state on a pokemon until the turn ends
     */
    Map<Object, Object> getTurnValueMap();

    /**
     * Allows you to put state on a pokemon lasting until the end of the battle
     */
    Map<Object, Object> getLifetimeValueMap();

    /**
     * Called before a battle starts to remove any previous battle stuff.
     */
    default void resetForBattle() {
        getTurnValueMap().clear();
        getLifetimeValueMap().clear();
    }

    /**
     * Gets the display id of the pokemon
     */
    Component getDisplayName();

    /**
     * Gets the UUID associated with this {@link PokemonBattleData}
     */
    UUID getUuid();

    /**
     * Get elements of the pokemon. This is modifiable
     */
    List<ElementType> getTyping();

    /**
     * Gets the pokemons abilities
     */
    List<Ability> getAbilities();

    /**
     * Gets the move the pokemon is currently holding. It may not always be present
     */
    Optional<HeldItem> getItem();

    int getSpeed();

    void setSpeed(int value);

    int getEvasiveness();

    void setEvasiveness(int value);

    int getAccuracy();

    void setAccuracy(int value);

    int getHp();

    void setHp(int value);

    int getMaxHp();

    void setMaxHp(int value);

    int getAttack();

    void setAttack(int value);

    int getDefense();

    void setDefense(int value);

    int getSpecialAttack();

    void setSpecialAttack(int value);

    int getSpecialDefense();

    void setSpecialDefense(int value);

    int getLevel();

    StatusCondition getStatusCondition();

    void setStatusCondition(StatusCondition value);
}
