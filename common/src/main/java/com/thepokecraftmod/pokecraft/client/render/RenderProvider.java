package com.thepokecraftmod.pokecraft.client.render;

import com.mojang.blaze3d.vertex.PoseStack;
import com.thepokecraftmod.pokecraft.api.pokemon.PokemonInstance;
import com.thepokecraftmod.pokecraft.level.entity.BallEntity;
import com.thepokecraftmod.pokecraft.level.entity.PokemonEntity;
import net.minecraft.client.renderer.MultiBufferSource;

/**
 * Used to allow different types of pokemon mods to do their own rendering. Such as PokeMod compared to Cobblemon
 */
public interface RenderProvider {

    /**
     * Used for rendering a pokemon in the world.
     * @param pokemon the entity to render at
     * @param entityYaw the yaw of the entity
     * @param partialTicks the partial ticks which have passed
     * @param stack the current {@link PoseStack}
     * @param source a (slow) vertex buffer source
     * @param light the light for the entity
     */
    void renderMon(PokemonEntity pokemon, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource source, int light);

    /**
     * Renders a pokemon in the world but based on {@link PoseStack} and {@link PokemonInstance} instead. Minimally used for statues
     * @param instance the pokemon instance data
     * @param stack the current {@link PoseStack}
     */
    void renderMon(PokemonInstance instance, PoseStack stack);

    /**
     * Used for rendering a ball in the world.
     * @param ball the entity to render at
     * @param entityYaw the yaw of the entity
     * @param partialTicks the partial ticks which have passed
     * @param stack the current {@link PoseStack}
     * @param source a (slow) vertex buffer source
     * @param light the light for the entity
     */
    void renderBall(BallEntity ball, float entityYaw, float partialTicks, PoseStack stack, MultiBufferSource source, int light);
}
