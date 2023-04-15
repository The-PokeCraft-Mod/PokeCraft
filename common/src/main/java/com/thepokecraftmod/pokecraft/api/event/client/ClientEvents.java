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

package com.thepokecraftmod.pokecraft.api.event.client;

import com.thepokecraftmod.pokecraft.api.event.Event;
import com.thepokecraftmod.pokecraft.client.render.screen.ScreenLikeInfo;

import java.util.function.Consumer;

/**
 * Client sided events which can be listened to in common to render stuff.
 */
public class ClientEvents {

    /**
     * Listen to if you want to render to the screen while the player is in game. (Like a HUD)
     */
    public static final Event<Consumer<ScreenLikeInfo>> RENDER_OVERLAY = new Event<Consumer<ScreenLikeInfo>>(Event::consumerCallback, Consumer[]::new);

    /**
     * Called when a key is pressed.
     */
    public static final Event<Consumer<Integer>> KEY_PRESSED = new Event<Consumer<Integer>>(Event::consumerCallback, Consumer[]::new);
}
