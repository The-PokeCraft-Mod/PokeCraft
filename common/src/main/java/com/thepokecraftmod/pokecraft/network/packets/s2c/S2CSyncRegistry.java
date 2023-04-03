package com.thepokecraftmod.pokecraft.network.packets.s2c;

import com.mojang.serialization.Codec;
import com.thepokecraftmod.pokecraft.api.registry.DynamicLazySyncingRegistry;
import com.thepokecraftmod.pokecraft.network.handler.ClientPacketHandler;
import com.thepokecraftmod.unimon.network.packets.s2c.S2CPacket;
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
