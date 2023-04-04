package com.thepokecraftmod.mimikyu;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Mimikyu {
    public static final Logger LOGGER = LogManager.getLogger("Mimikyu Battle Engine");
    public static boolean THROW_INSTEAD_OF_ERROR = true;
    public static boolean WARN_AGAINST_BAD_PRACTICES = true;

    public static void onInitialize() {
        LOGGER.info("Mimikyu Initialized");
    }
}
