package com.thepokecraftmod.pokecraft.api.registry;

import net.minecraft.resources.ResourceLocation;

/**
 * Represents classes which can act like registries
 * @param <T> the type of object stored
 */
public interface RegistryLike<T> extends Iterable<T> {

    T get(ResourceLocation id);

    ResourceLocation getId(T obj);
}
