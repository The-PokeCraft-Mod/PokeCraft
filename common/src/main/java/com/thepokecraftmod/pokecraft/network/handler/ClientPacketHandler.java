package com.thepokecraftmod.pokecraft.network.handler;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.datafixers.util.Pair;
import com.thepokecraftmod.pokecraft.api.registry.DynamicLazySyncingRegistry;
import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.resources.MultiPackResourceManager;
import net.minecraft.server.packs.resources.Resource;

import java.io.IOException;
import java.util.Map;
import java.util.stream.Collectors;

public class ClientPacketHandler {

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
