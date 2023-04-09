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
