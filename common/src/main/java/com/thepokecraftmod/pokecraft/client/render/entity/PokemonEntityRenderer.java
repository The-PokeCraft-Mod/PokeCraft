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

package com.thepokecraftmod.pokecraft.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.thepokecraftmod.pokecraft.client.render.rks.*;
import com.thepokecraftmod.pokecraft.level.entity.PokemonEntity;
import com.thepokecraftmod.rks.storage.AnimatedObjectInstance;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

import java.util.HashMap;
import java.util.Map;

public class PokemonEntityRenderer extends EntityRenderer<PokemonEntity> {
    private static final Map<PokemonEntity, AnimatedObjectInstance> INSTANCE_DATA = new HashMap<>();

    public PokemonEntityRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public void render(@NotNull PokemonEntity pokemon, float entityYaw, float partialTicks, @NotNull PoseStack stack, @NotNull MultiBufferSource source, int light) {
        var optionalModel = ModelLoader.getPokemon(pokemon.getInstanceData().species);

        if (optionalModel.isPresent()) {
            var model = optionalModel.get();

            renderNameTag(pokemon, Component.literal("Lv. " + pokemon.getInstanceData().getLevel()), stack, source, light);
            var instance = INSTANCE_DATA.computeIfAbsent(pokemon, pokemonEntity -> {
                var uniformUploader = new PokemonUniformUploader(model.uploader());
                var newInstance = new AnimatedObjectInstance(220, new Matrix4f(), uniformUploader::upload);
                newInstance.link(model.renderObject());
                uniformUploader.setInstance(newInstance);
                return newInstance;
            });

            instance.transformationMatrix.set(stack.last().pose());
            PokeCraftRKSImpl.getInstance().addToFrame(instance);
        }
    }

    protected void renderNameTag(@NotNull PokemonEntity entity, @NotNull Component displayName, @NotNull PoseStack pose, @NotNull MultiBufferSource buffer, int packedLight) {
        var distance = this.entityRenderDispatcher.distanceToSqr(entity);
        if (distance > 4096.0) return;
        float height = entity.getBbHeight() + 0.5f;

        pose.pushPose();
        pose.translate(0.0f, height, 0.0f);
        pose.mulPose(this.entityRenderDispatcher.cameraOrientation());
        pose.scale(-0.025f, -0.025f, 0.025f);
        var stack = pose.last().pose();
        var opacity = Minecraft.getInstance().options.getBackgroundOpacity(0.25f);
        var bgColor = (int) (opacity * 255.0f) << 24;
        var font = this.getFont();
        var halfWidth = (float) -font.width(displayName) / 2;
        font.drawInBatch(displayName, halfWidth, 0, 0x20FFFFFF, false, stack, buffer, Font.DisplayMode.NORMAL, bgColor, packedLight);
        font.drawInBatch(displayName, halfWidth, 0, -1, false, stack, buffer, Font.DisplayMode.NORMAL, 0, packedLight);
        pose.popPose();
    }

    // Mojang annotated this a @NotNull, but it doesn't actually matter. Seriously wtf
    @SuppressWarnings("DataFlowIssue")
    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull PokemonEntity entity) {
        return null;
    }
}
