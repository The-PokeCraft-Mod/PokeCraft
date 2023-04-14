package com.thepokecraftmod.pokecraft.mixin.client.render;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.BufferUploader;
import com.mojang.blaze3d.vertex.PoseStack;
import com.thepokecraftmod.pokecraft.client.render.rks.PokeCraftRKSImpl;
import net.minecraft.client.Camera;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.client.renderer.LevelRenderer;
import net.minecraft.client.renderer.LightTexture;
import org.jetbrains.annotations.Nullable;
import org.joml.Matrix4f;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LevelRenderer.class)
public class LevelRendererMixin {

    @Shadow @Nullable
    private ClientLevel level;

    @Shadow @Final private static Logger LOGGER;

    @Inject(method = "renderLevel", at = @At(value = "INVOKE", target = "Lnet/minecraft/client/renderer/LevelRenderer;checkPoseStack(Lcom/mojang/blaze3d/vertex/PoseStack;)V", ordinal = 2, shift = At.Shift.BEFORE))
    private void pokecraft$rksRender(PoseStack poseStack, float partialTick, long finishNanoTime, boolean renderBlockOutline, Camera camera, GameRenderer gameRenderer, LightTexture lightTexture, Matrix4f projectionMatrix, CallbackInfo ci) {
        level.getProfiler().popPush("rks");
        var startTime = System.currentTimeMillis();
        RenderSystem.enableDepthTest();
        BufferUploader.reset();
        PokeCraftRKSImpl.getInstance().render();
        if (shouldRenderFpsPie()) LOGGER.warn("RareCandy render took " + (System.currentTimeMillis() - startTime) + "ms");
    }

    private boolean shouldRenderFpsPie() {
        return Minecraft.getInstance().options.renderDebug && Minecraft.getInstance().options.renderDebugCharts && !Minecraft.getInstance().options.hideGui;
    }
}
