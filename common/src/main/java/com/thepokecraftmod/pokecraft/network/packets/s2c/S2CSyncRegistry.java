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

package com.thepokecraftmod.pokecraft.network.packets.s2c;

import com.mojang.serialization.Codec;
import com.thepokecraftmod.pokecraft.api.registry.DynamicLazySyncingRegistry;
import com.thepokecraftmod.pokecraft.network.handler.ClientPacketHandler;
import com.thepokecraftmod.pokecraft.network.packets.s2c.S2CPacket;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("unchecked")
public class S2CSyncRegistry<T> implements S2CPacket {

    private final ResourceKey<Registry<T>> key;
    private final Codec<T> codec;
    private final Map<ResourceLocation, T> syncingEntries;

    public S2CSyncRegistry(DynamicLazySyncingRegistry<T> registry) {
        this.key = registry.registryKey();
        this.codec = registry.codec();
        this.syncingEntries = registry.getSyncingEntries();
    }

    public S2CSyncRegistry(FriendlyByteBuf buf) {
        this.syncingEntries = new HashMap<>();
        this.key = buf.readResourceKey(ResourceKey.createRegistryKey(BuiltInRegistries.ROOT_REGISTRY_NAME));
        var count = buf.readVarInt();
        var registry = (DynamicLazySyncingRegistry<T>) DynamicLazySyncingRegistry.REGISTRY_MAP.get(key);
        this.codec = registry.codec();

        for (int i = 0; i < count; i++) {
            var id = buf.readResourceLocation();
            var object = (T) buf.readWithCodec(NbtOps.INSTANCE, registry.codec());
            syncingEntries.put(id, object);
        }

        ClientPacketHandler.handleSyncRegistry(syncingEntries, registry);
    }

    @Override
    public void encode(FriendlyByteBuf buf) {
        buf.writeResourceKey(key);
        buf.writeVarInt(syncingEntries.size());

        for (var entry : syncingEntries.entrySet()) {
            buf.writeResourceLocation(entry.getKey());
            buf.writeWithCodec(NbtOps.INSTANCE, codec, entry.getValue());
        }
    }

    @Override
    public void process() {
    }
}
