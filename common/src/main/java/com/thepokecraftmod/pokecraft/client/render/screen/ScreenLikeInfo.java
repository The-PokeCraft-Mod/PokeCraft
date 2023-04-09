package com.thepokecraftmod.pokecraft.client.render.screen;

import com.mojang.blaze3d.vertex.PoseStack;

/**
 * Contains values that would usually be in a {@link net.minecraft.client.gui.screens.Screen} for usage outside of Screen's
 */
public record ScreenLikeInfo(
        PoseStack stack,
        int screenWidth,
        int screenHeight,
        float tickDelta
) {}
