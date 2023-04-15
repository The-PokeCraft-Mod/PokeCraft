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

package com.thepokecraftmod.pokecraft.api.event;

import com.thepokecraftmod.pokecraft.api.event.ctx.MovePokemonContext;
import net.minecraft.server.level.ServerPlayer;

import java.util.function.Consumer;

/**
 * Events related to PokemonParties and Box Storage
 */
public class DataEvents {
    /**
     * Called when a {@link ServerPlayer} needs their data synced. This can be manually requested by the player, or gets done for all players on reloads
     */
    public static final Event<Consumer<ServerPlayer>> SYNC_PLAYER = new Event<Consumer<ServerPlayer>>(Event::consumerCallback, Consumer[]::new);

    /**
     * Called when a {@link com.thepokecraftmod.pokecraft.api.pokemon.PokemonInstance} is going to be added to a {@link com.thepokecraftmod.pokecraft.api.pokemon.PokemonParty}. The result can be configured through the event's context
     */
    public static final Event<Consumer<MovePokemonContext>> MOVE_MON_TO_PARTY = new Event<Consumer<MovePokemonContext>>(Event::consumerCallback, Consumer[]::new);
}
