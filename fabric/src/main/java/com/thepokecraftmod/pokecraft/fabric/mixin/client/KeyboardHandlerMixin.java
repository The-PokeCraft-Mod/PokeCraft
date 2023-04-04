package com.thepokecraftmod.pokecraft.fabric.mixin.client;

import com.thepokecraftmod.pokecraft.api.event.client.ClientEvents;
import net.minecraft.client.KeyboardHandler;
import org.lwjgl.glfw.GLFW;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyboardHandler.class)
public class KeyboardHandlerMixin {

    @Inject(method = "keyPress", at = @At("TAIL"))
    private void unimon$keyPress(long windowPointer, int key, int scanCode, int action, int modifiers, CallbackInfo ci) {
        if (action == GLFW.GLFW_RELEASE) ClientEvents.KEY_PRESSED.getInvoker().accept(key);
    }
}
