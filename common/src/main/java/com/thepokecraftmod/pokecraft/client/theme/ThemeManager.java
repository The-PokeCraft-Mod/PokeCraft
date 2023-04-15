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

package com.thepokecraftmod.pokecraft.client.theme;

import net.minecraft.resources.ResourceLocation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Allows different themes to be used in UI's and discourages logic being put inside of UI's
 */
public class ThemeManager {
    private static final Map<ResourceLocation, Theme> AVAILABLE_THEMES = new HashMap<>();
    private static Theme activeTheme;

    /**
     * Gets the currently in use {@link Theme}
     */
    public static Theme getActiveTheme() {
        if (activeTheme == null && AVAILABLE_THEMES.values().size() > 0)
            activeTheme = new ArrayList<>(AVAILABLE_THEMES.values()).get(0);
        return activeTheme;
    }

    /**
     * Registers a {@link Theme} so that it can be enabled later
     */
    public static void registerTheme(ResourceLocation id, Theme theme) {
        AVAILABLE_THEMES.put(id, theme);
    }

    /**
     * Sets the active theme based on the id provided
     */
    public static void setTheme(ResourceLocation id) {
        if (!AVAILABLE_THEMES.containsKey(id)) throw new RuntimeException("No theme registered with the id " + id);
        activeTheme = AVAILABLE_THEMES.get(id);
    }
}
