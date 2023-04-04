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

package com.thepokecraftmod.pokecraft.forge.client;

import com.thepokecraftmod.pokecraft.api.event.client.ClientEvents;
import com.thepokecraftmod.pokecraft.client.PokeCraftClient;
import com.thepokecraftmod.pokecraft.client.input.KeyBind;
import com.thepokecraftmod.pokecraft.client.render.ScreenLikeInfo;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.client.event.RenderGuiOverlayEvent;
import net.minecraftforge.client.gui.overlay.VanillaGuiOverlay;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.apache.commons.lang3.ArrayUtils;
import org.lwjgl.glfw.GLFW;

public class ForgePokeCraftClient extends PokeCraftClient {

    public ForgePokeCraftClient(IEventBus eventBus) {
        PokeCraftClient.onInitialize(this);

        eventBus.addListener(this::registerEntityRenderers);
        eventBus.addListener(this::onClientSetup);
        MinecraftForge.EVENT_BUS.addListener(this::renderOverlays);
        MinecraftForge.EVENT_BUS.addListener(this::onKeyPress);
    }

    private void onClientSetup(FMLClientSetupEvent event) {
        registerKeyBindings();
    }

    private void onKeyPress(InputEvent.Key event) {
        if (event.getAction() == GLFW.GLFW_RELEASE) ClientEvents.KEY_PRESSED.getInvoker().accept(event.getKey());
    }

    private void renderOverlays(RenderGuiOverlayEvent.Post event) {
        if (event.getOverlay().id() == VanillaGuiOverlay.CHAT_PANEL.id()) {
            var client = Minecraft.getInstance();
            var window = client.getWindow();
            var info = new ScreenLikeInfo(
                    event.getPoseStack(),
                    window.getGuiScaledWidth(),
                    window.getGuiScaledHeight(),
                    client.getDeltaFrameTime()
            );
            ClientEvents.RENDER_OVERLAY.getInvoker().accept(info);
        }
    }

    private void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
        initializeEntityRenderers(event::registerEntityRenderer);
    }

    @Override
    public void registerKey(KeyBind keyBind) {
        keyBinds.add(keyBind);
        Minecraft.getInstance().options.keyMappings = ArrayUtils.add(Minecraft.getInstance().options.keyMappings, keyBind);
    }
}
