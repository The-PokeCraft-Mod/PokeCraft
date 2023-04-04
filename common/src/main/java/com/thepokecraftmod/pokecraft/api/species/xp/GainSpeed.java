package com.thepokecraftmod.pokecraft.api.species.xp;

public enum GainSpeed {
        ERRATIC(600000),
        FAST(800000),
        MEDIUM_FAST(1000000),
        MEDIUM_SLOW(1059860),
        SLOW(1250000),
        FLUCTUATING(1640000);

        public final int xpGain;

        GainSpeed(int xpGain) {
            this.xpGain = xpGain;
        }
    }