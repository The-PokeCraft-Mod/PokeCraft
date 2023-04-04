package com.thepokecraftmod.pokecraft.api.event;

import com.thepokecraftmod.pokecraft.api.registry.DynamicLazySyncingRegistry;
import com.thepokecraftmod.pokecraft.api.event.Event;
import net.minecraft.server.packs.resources.PreparableReloadListener;

import java.util.List;
import java.util.function.Consumer;

/**
 * Events related to {@link DynamicLazySyncingRegistry}'s
 */
public class RegistryEvents {
    /**
     * Adds a resource reloader. Used for loading data from the data folder
     */
    public static final Event<Consumer<List<PreparableReloadListener>>> ADD_RESOURCE_RELOADERS = new Event<Consumer<List<PreparableReloadListener>>>(Event::consumerCallback, Consumer[]::new);
}
