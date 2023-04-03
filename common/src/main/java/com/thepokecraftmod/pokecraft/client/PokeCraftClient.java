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

package com.thepokecraftmod.pokecraft.client;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.client.themes.DefaultTheme;
import com.thepokecraftmod.unimon.client.theme.ThemeManager;

public class PokeCraftClient {
    private static PokeCraftClient INSTANCE;

    private void onInitialize() {
        ThemeManager.registerTheme(PokeCraft.id("default"), new DefaultTheme());
    }

    public static PokeCraftClient getInstance() {
        if (INSTANCE == null)
            throw new RuntimeException("Platform has not defined PokeCraftClient instance. Maybe you are too early?");

        return INSTANCE;
    }

    public static void onInitialize(PokeCraftClient platformImpl) {
        if (INSTANCE != null) throw new RuntimeException("Another mod platform has already been defined");
        INSTANCE = platformImpl;
        INSTANCE.onInitialize();
    }
}
