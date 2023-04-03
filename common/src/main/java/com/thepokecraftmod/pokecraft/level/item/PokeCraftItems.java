package com.thepokecraftmod.pokecraft.level.item;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.level.block.PokeCraftBlocks;
import com.thepokecraftmod.unimon.platform.PlatformRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;

public class PokeCraftItems {
    private static final PlatformRegistry<Item, Registry<Item>> REGISTRY = new PlatformRegistry<>(PokeCraft::id, Registries.ITEM); // TODO: make it take PokeCraft::id (Function<String, ResourceLocation>)

    public static final Item GREGANACL = REGISTRY.register("greganacl", new BlockItem(PokeCraftBlocks.GREGANACL, new Item.Properties()));

    public static void onInitialize() {
    }
}
