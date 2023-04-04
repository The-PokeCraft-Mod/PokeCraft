package com.thepokecraftmod.pokecraft.level.block;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import com.thepokecraftmod.pokecraft.level.item.PokeCraftItems;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class PokeCraftBlocks {
    private static final MojangRegistry<Block, Registry<Block>> REGISTRY = PokeCraft.getInstance().newRegistry(Registries.BLOCK);

    public static final Block GREGANACL = blockItem("greganacl", new Block(BlockBehaviour.Properties.of(Material.BAMBOO)));

    private static Block blockItem(String name, Block block) {
        REGISTRY.register(name, block);
        PokeCraftItems.REGISTRY.register(name, new BlockItem(block, new Item.Properties()));
        return block;
    }

    public static void onInitialize() {
    }
}
