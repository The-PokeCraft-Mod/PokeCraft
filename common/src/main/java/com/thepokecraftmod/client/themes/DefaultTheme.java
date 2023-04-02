package com.thepokecraftmod.client.themes;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.thepokecraftmod.PokeCraft;
import com.thepokecraftmod.client.ScreenUtils;
import com.thepokecraftmod.unimon.api.mon.MonInstance;
import com.thepokecraftmod.unimon.client.UniMonClient;
import com.thepokecraftmod.unimon.client.render.ScreenLikeInfo;
import com.thepokecraftmod.unimon.client.theme.Theme;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
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
            font.draw(stack, mon.species.toString(), 4, currentY, 0xFFFFFFFF);
            currentY += fullSliceHeight;
        }

        RenderSystem.disableBlend();
        stack.popPose();
    }
}
