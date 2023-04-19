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

import com.mojang.blaze3d.platform.DisplayData;
import com.mojang.blaze3d.platform.ScreenManager;
import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.platform.WindowEventHandler;
import com.thepokecraftmod.pokecraft.PokeCraft;
import org.lwjgl.opengl.GL11C;
import org.lwjgl.opengl.GLUtil;
import org.lwjgl.opengl.KHRDebug;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyConstant;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(Window.class)
public class WindowMixin {

    @Shadow @Final private static Logger LOGGER;

    @ModifyConstant(method = "<init>", constant = @Constant(intValue = 3))
    private int pokecraft$changeGlMajor(int constant) {
        if (PokeCraft.isDevelopmentEnvironment()) {
            LOGGER.warn("OpenGL 4.6, OpenGL Debugging, and RenderDoc will be enabled.");

            try {
                System.loadLibrary("renderdoc");
            } catch (Throwable t) {
                LOGGER.error("Unable to load RenderDoc");
            }

            return 4;
        }
        return constant;
    }

    @ModifyConstant(method = "<init>", constant = @Constant(intValue = 2))
    private int pokecraft$changeGlMinor(int constant) {
        if (PokeCraft.isDevelopmentEnvironment()) return 6;
        return constant;
    }

    @Inject(method = "<init>", at = @At(value = "INVOKE", target = "Lcom/mojang/blaze3d/platform/Window;setMode()V"))
    private void pokecraft$postCapabilitiesInject(WindowEventHandler windowEventHandler, ScreenManager screenManager, DisplayData displayData, String string, String string2, CallbackInfo ci) {
        if (PokeCraft.isDevelopmentEnvironment()) {
            GLUtil.setupDebugMessageCallback();
            GL11C.glEnable(KHRDebug.GL_DEBUG_OUTPUT_SYNCHRONOUS);
        }
    }
}
