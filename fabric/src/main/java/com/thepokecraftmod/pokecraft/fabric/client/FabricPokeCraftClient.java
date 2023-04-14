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

package com.thepokecraftmod.pokecraft.fabric.client;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.client.PokeCraftClient;
import com.thepokecraftmod.pokecraft.client.input.KeyBind;
import com.thepokecraftmod.pokecraft.fabric.network.FabricPokeCraftNetworking;
import com.thepokecraftmod.pokecraft.network.PokeCraftNetworking;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.resource.IdentifiableResourceReloadListener;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.SimpleSynchronousResourceReloadListener;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.resources.ReloadableResourceManager;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.ResourceManagerReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class FabricPokeCraftClient extends PokeCraftClient implements ClientModInitializer {

    public FabricPokeCraftClient() {
        ClientPlayNetworking.registerGlobalReceiver(PokeCraftNetworking.ID, (client, handler, buf, responseSender) -> ((FabricPokeCraftNetworking) FabricPokeCraftNetworking.getInstance()).handleClient(client, buf));
        PokeCraftClient.onInitialize(this);
        registerKeyBindings();
    }

    @Override
    public void onInitializeClient() {
        initializeEntityRenderers(EntityRendererRegistry::register);
        ResourceManagerHelper.get(PackType.CLIENT_RESOURCES).registerReloadListener(new SimpleSynchronousResourceReloadListener() {
            @Override
            public ResourceLocation getFabricId() {
                return PokeCraft.id("resource_reloaders");
            }

            @Override
            public void onResourceManagerReload(@NotNull ResourceManager resourceManager) {
                for (var onReload : getResourceReloadListeners()) {
                    onReload.run();
                }
            }
        });
    }

    @Override
    public void registerKey(KeyBind keyBind) {
        keyBinds.add(keyBind);
        KeyBindingHelper.registerKeyBinding(keyBind);
    }
}
