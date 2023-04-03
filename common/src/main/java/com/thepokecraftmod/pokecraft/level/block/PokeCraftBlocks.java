package com.thepokecraftmod.pokecraft.level.block;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.unimon.platform.PlatformRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class PokeCraftBlocks {
    private static final PlatformRegistry<Block, Registry<Block>> REGISTRY = new PlatformRegistry<>(PokeCraft::id, Registries.BLOCK); // TODO: make it take PokeCraft::id (Function<String, ResourceLocation>)

    public static final Block GREGANACL = REGISTRY.register("greganacl", new Block(BlockBehaviour.Properties.of(Material.BAMBOO)));

    public static void onInitialize() {

    }
}
