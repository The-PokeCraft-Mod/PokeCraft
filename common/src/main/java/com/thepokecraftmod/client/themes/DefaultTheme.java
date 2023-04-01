package com.thepokecraftmod.client.themes;

import com.mojang.blaze3d.systems.RenderSystem;
import com.thepokecraftmod.unimon.client.render.ScreenLikeInfo;
import com.thepokecraftmod.unimon.client.theme.Theme;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.TitleScreen;
import net.minecraft.client.renderer.GameRenderer;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class DefaultTheme implements Theme {

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
        System.out.println(info.screenWidth());
        RenderSystem.setShader(GameRenderer::getPositionColorShader);
        RenderSystem.enableBlend();
        RenderSystem.setShaderColor(1, 1, 1, 1f);
        GuiComponent.blit(info.stack(), 0, info.screenHeight() / 2, 100, 100, 100, 100);
        Minecraft.getInstance().font.draw(info.stack(), "Greg Cringe", 10, 10, 0xFFFFFFFF);
        RenderSystem.disableBlend();
    }
}
