package com.thepokecraftmod.client;

import com.thepokecraftmod.PokeCraft;
import com.thepokecraftmod.client.themes.DefaultTheme;
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
