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

package com.thepokecraftmod.pokecraft.client.themes;

import com.mojang.blaze3d.systems.RenderSystem;
import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.client.ScreenUtils;
import com.thepokecraftmod.unimon.client.UniMonClient;
import com.thepokecraftmod.unimon.client.render.ScreenLikeInfo;
import com.thepokecraftmod.unimon.client.theme.Theme;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * The default theme used in PokeCraft
 */
public class DefaultTheme implements Theme {
    private static final ResourceLocation SLICE_TEX = PokeCraft.id("textures/gui/party/slice.png");

    @Override
    public Supplier<Screen> getBattleTheme() {
        return TitleScreen::new;
    }

    @Override
    public Supplier<Screen> getPcTheme() {
        return TitleScreen::new;
    }

    @Override
    public Consumer<ScreenLikeInfo> getPartyTheme() {
        return this::renderParty;
    }

    private void renderParty(ScreenLikeInfo info) {
        if (UniMonClient.getInstance().party != null) {
            var stack = info.stack();
            var client = Minecraft.getInstance();
            var font = Minecraft.getInstance().font;
            var window = client.getWindow();
            var height = window.getGuiScaledHeight();
            var party = UniMonClient.getInstance().party.getParty();
            var sliceSpacing = 6;
            var sliceHeight = 24;
            var fullSliceHeight = sliceHeight + sliceSpacing;
            var currentY = height / 2 - (((party.size() - 1) * fullSliceHeight) / 2);

            stack.pushPose();
            RenderSystem.setShader(GameRenderer::getPositionTexShader);
            RenderSystem.setShaderColor(1, 1, 1, 1f);

            for (var mon : party) {
                RenderSystem.enableBlend();
                RenderSystem.setShaderTexture(0, SLICE_TEX);
                ScreenUtils.drawTexture(stack, 0, currentY - sliceHeight / 2 + 3, 0, 0, 90, sliceHeight, 90, sliceHeight);
                font.draw(stack, mon.getDisplayName(), 4, currentY, 0xFFFFFFFF);
                currentY += fullSliceHeight;
            }

            RenderSystem.disableBlend();
            stack.popPose();
        }
    }
}
