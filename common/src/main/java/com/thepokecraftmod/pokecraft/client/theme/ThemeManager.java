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
