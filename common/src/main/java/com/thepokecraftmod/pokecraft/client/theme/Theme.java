package com.thepokecraftmod.pokecraft.client.theme;

import com.thepokecraftmod.pokecraft.client.render.ScreenLikeInfo;
import net.minecraft.client.gui.screens.Screen;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Represents a UI theme
 */
public interface Theme {

    /**
     * The theme used in the battle system
     */
    Supplier<Screen> getBattleTheme();

    /**
     * The theme used in the PC
     */
    Supplier<Screen> getPcTheme();

    /**
     * The theme used as an in game overlay
     */
    Consumer<ScreenLikeInfo> getPartyTheme();
}
