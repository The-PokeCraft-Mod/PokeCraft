package com.thepokecraftmod.pokecraft.level.item;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class PokeCraftItems {
    public static final MojangRegistry<Item, Registry<Item>> REGISTRY = PokeCraft.getInstance().newRegistry(Registries.ITEM);

    public static void onInitialize() {
    }
}
