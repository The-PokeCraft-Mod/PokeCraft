package com.thepokecraftmod.pokecraft.fabric.registry;

import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;

public class FabricMojangRegistry<T> extends MojangRegistry<T, Registry<T>> {

    public FabricMojangRegistry(ResourceKey<Registry<T>> registryKey) {
        super(registryKey);
    }

    @Override
    public <S extends T> S register(String name, S value) {
        var id = locationFactory.apply(name);
        var registry = BuiltInRegistries.REGISTRY.get(registryKey.location());
        return Registry.register((Registry<Object>) registry, id, value);
    }
}
