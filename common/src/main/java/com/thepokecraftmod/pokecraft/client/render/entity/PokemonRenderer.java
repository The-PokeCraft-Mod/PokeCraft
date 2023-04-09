package com.thepokecraftmod.pokecraft.client.render.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.thepokecraftmod.pokecraft.client.PokeCraftClient;
import com.thepokecraftmod.pokecraft.level.entity.PokemonEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class PokemonRenderer extends EntityRenderer<PokemonEntity> {

    public PokemonRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    public void render(@NotNull PokemonEntity pokemon, float entityYaw, float partialTicks, @NotNull PoseStack stack, @NotNull MultiBufferSource source, int light) {
        renderNameTag(pokemon, Component.literal("I need to put RKS in lol"), stack, source, light);
    }

    // Mojang annotated this a @NotNull, but it doesn't actually matter. Seriously wtf
    @SuppressWarnings("DataFlowIssue")
    @Override
    public @NotNull ResourceLocation getTextureLocation(@NotNull PokemonEntity entity) {
        return null;
    }
}
