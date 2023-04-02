package com.thepokecraftmod.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.GuiComponent;

/**
 * Mojang is incapable of writing UI Code, so we maintain our own version of theirs
 */
public class ScreenUtils {

    /**
     * Draws a texture to the screen. Can also be used to draw coloured squares.
     */
    public static void drawTexture(PoseStack matrices, int x, int y, int u, int v, int width, int height, int textureWidth, int textureHeight) {
        GuiComponent.blit(matrices, x, y, u, v, width, height, textureWidth, textureHeight);
    }
}
