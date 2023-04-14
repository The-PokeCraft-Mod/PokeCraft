package com.thepokecraftmod.pokecraft.fabric.mixin.client;

import com.mojang.blaze3d.platform.DisplayData;
import com.mojang.blaze3d.platform.ScreenManager;
import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.platform.WindowEventHandler;
import com.thepokecraftmod.pokecraft.PokeCraft;
import org.lwjgl.opengl.*;
import org.lwjgl.system.MemoryUtil;
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
        LOGGER.warn("OpenGL 4.6 and OpenGL Debugging will be enabled.");
        if (PokeCraft.isDevelopmentEnvironment()) return 4;
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
