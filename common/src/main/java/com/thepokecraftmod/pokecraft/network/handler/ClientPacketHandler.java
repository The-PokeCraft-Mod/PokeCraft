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

package com.thepokecraftmod.pokecraft.network.handler;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import com.thepokecraftmod.pokecraft.api.pokemon.PokemonParty;
import com.thepokecraftmod.pokecraft.api.registry.DynamicLazySyncingRegistry;
import com.thepokecraftmod.pokecraft.client.PokeCraftClient;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.resources.MultiPackResourceManager;
import net.minecraft.server.packs.resources.Resource;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

public class ClientPacketHandler {

    public static void handleSyncParty(CompoundTag partyTag) {
        PokeCraftClient.getInstance().party = PokemonParty.readAdditionalData(partyTag, Minecraft.getInstance().player);
    }

    public static <T> void handleSyncRegistry(Map<ResourceLocation, T> syncingEntries, DynamicLazySyncingRegistry<T> registry) {
        if (Minecraft.getInstance().getSingleplayerServer() == null) {
            registry.clear();
            var list = Minecraft.getInstance().getResourcePackRepository().openAllSelected();

            try (var builtinServerResourceManager = new MultiPackResourceManager(PackType.SERVER_DATA, list)) {
                var builtinSpecies = builtinServerResourceManager.listResources(registry.path, e -> true).entrySet().stream()
                        .map(entry -> new Pair<>(fixLocation(entry.getKey()), getJson(entry.getValue())))
                        .collect(Collectors.toMap(Pair::getFirst, Pair::getSecond));
                registry.load(builtinSpecies, true);

                for (var entry : syncingEntries.entrySet())
                    registry.register(entry.getKey(), entry.getValue(), true);
            }
        }
    }

    private static ResourceLocation fixLocation(ResourceLocation id) {
        var namespace = id.getNamespace();
        var path = id.getPath();
        return new ResourceLocation(namespace, path.substring(path.lastIndexOf("/") + 1));
    }

    private static JsonElement getJson(Resource resource) {
        try {
            return DynamicLazySyncingRegistry.GSON.fromJson(new String(resource.open().readAllBytes()), JsonObject.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
