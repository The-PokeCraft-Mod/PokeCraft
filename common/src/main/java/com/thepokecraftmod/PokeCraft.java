package com.thepokecraftmod;

import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PokeCraft {
    public static final Logger LOGGER = LogManager.getLogger("PokeCraft");
    public static final String MOD_ID = "pokecraft";
    private static PokeCraft INSTANCE;

    private static void onInitialize() {

    }

    public static PokeCraft getInstance() {
        if (INSTANCE == null)
            throw new RuntimeException("Platform has not defined UniMon instance. Maybe you are too early?");

        return INSTANCE;
    }

    public static void onInitialize(PokeCraft platformUniMon) {
        if (INSTANCE != null) throw new RuntimeException("Another platform has already been defined");
        INSTANCE = platformUniMon;
        onInitialize();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
