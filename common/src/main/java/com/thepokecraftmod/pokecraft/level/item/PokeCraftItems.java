package com.thepokecraftmod.pokecraft.level.item;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class PokeCraftItems {
    public static final MojangRegistry<Item, Registry<Item>> REGISTRY = PokeCraft.getInstance().newRegistry(Registries.ITEM);

    // Available Properties
    private static final Item.Properties BALL_PROPERTIES = new Item.Properties().stacksTo(16);

    public static final Item POKE_BALL = register("poke_ball", new Item(BALL_PROPERTIES));

    public static void onInitialize() {
    }

    public static Item register(String name, Item item) {
        return REGISTRY.register(name, item);
    }
}
