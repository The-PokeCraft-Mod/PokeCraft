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

package com.thepokecraftmod.pokecraft.fabric.mixin.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.thepokecraftmod.pokecraft.api.event.client.ClientEvents;
import com.thepokecraftmod.pokecraft.client.render.screen.ScreenLikeInfo;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Gui.class)
public class GuiMixin {

    @Inject(method = "renderCrosshair", at = @At("TAIL"))
    private void unimon$renderOverlay(PoseStack stack, CallbackInfo ci) {
        var client = Minecraft.getInstance();
        var window = client.getWindow();
        ClientEvents.RENDER_OVERLAY.getInvoker().accept(new ScreenLikeInfo(
                stack,
                window.getGuiScaledWidth(),
                window.getGuiScaledHeight(),
                client.getDeltaFrameTime()
        ));
    }
}
