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
    public static final Block ORANGE_SANDSTONE = blockItem("orange_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block ORANGE_CRACKED_SANDSTONE = blockItem("orange_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block ORANGE_SMOOTH_SANDSTONE = blockItem("orange_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block ORANGE_SAND = blockItem("orange_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block ORANGE_CHISELED_SANDSTONE = blockItem("orange_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block ORANGE_CUT_SANDSTONE = blockItem("orange_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block YELLOW_SANDSTONE = blockItem("yellow_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block YELLOW_CHISELED_SANDSTONE = blockItem("yellow_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block YELLOW_CUT_SANDSTONE = blockItem("yellow_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block YELLOW_CRACKED_SANDSTONE = blockItem("yellow_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block YELLOW_SMOOTH_SANDSTONE = blockItem("yellow_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block YELLOW_SAND = blockItem("yellow_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block LIME_SANDSTONE = blockItem("lime_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIME_CHISELED_SANDSTONE = blockItem("lime_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIME_CUT_SANDSTONE = blockItem("lime_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIME_CRACKED_SANDSTONE = blockItem("lime_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIME_SMOOTH_SANDSTONE = blockItem("lime_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIME_SAND = blockItem("lime_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block GREEN_SANDSTONE = blockItem("green_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block GREEN_CHISELED_SANDSTONE = blockItem("green_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block GREEN_CUT_SANDSTONE = blockItem("green_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block GREEN_CRACKED_SANDSTONE = blockItem("green_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block GREEN_SMOOTH_SANDSTONE = blockItem("green_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block GREEN_SAND = blockItem("green_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block LIGHT_BLUE_SANDSTONE = blockItem("light_blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIGHT_BLUE_CHISELED_SANDSTONE = blockItem("light_blue_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIGHT_BLUE_CUT_SANDSTONE = blockItem("light_blue_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIGHT_BLUE_CRACKED_SANDSTONE = blockItem("light_blue_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIGHT_BLUE_SMOOTH_SANDSTONE = blockItem("light_blue_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIGHT_BLUE_SAND = blockItem("light_blue_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block CYAN_SANDSTONE = blockItem("cyan_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block CYAN_CHISELED_SANDSTONE = blockItem("cyan_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block CYAN_CUT_SANDSTONE = blockItem("cyan_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block CYAN_CRACKED_SANDSTONE = blockItem("cyan_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block CYAN_SMOOTH_SANDSTONE = blockItem("cyan_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block CYAN_SAND = blockItem("cyan_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block BLUE_SANDSTONE = blockItem("blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BLUE_CHISELED_SANDSTONE = blockItem("blue_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BLUE_CUT_SANDSTONE = blockItem("blue_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BLUE_CRACKED_SANDSTONE = blockItem("blue_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BLUE_SMOOTH_SANDSTONE = blockItem("blue_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BLUE_SAND = blockItem("blue_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block MAGENTA_SANDSTONE = blockItem("magenta_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block MAGENTA_CHISELED_SANDSTONE = blockItem("magenta_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block MAGENTA_CUT_SANDSTONE = blockItem("magenta_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block MAGENTA_CRACKED_SANDSTONE = blockItem("magenta_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block MAGENTA_SMOOTH_SANDSTONE = blockItem("magenta_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block MAGENTA_SAND = blockItem("magenta_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block PURPLE_SANDSTONE = blockItem("purple_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block PURPLE_CHISELED_SANDSTONE = blockItem("purple_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block PURPLE_CUT_SANDSTONE = blockItem("purple_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block PURPLE_CRACKED_SANDSTONE = blockItem("purple_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block PURPLE_SMOOTH_SANDSTONE = blockItem("purple_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block PURPLE_SAND = blockItem("purple_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block PINK_SANDSTONE = blockItem("pink_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block PINK_CHISELED_SANDSTONE = blockItem("pink_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block PINK_CUT_SANDSTONE = blockItem("pink_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block PINK_CRACKED_SANDSTONE = blockItem("pink_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block PINK_SMOOTH_SANDSTONE = blockItem("pink_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block PINK_SAND = blockItem("pink_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block LIGHT_GRAY_SANDSTONE = blockItem("light_gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIGHT_GRAY_CHISELED_SANDSTONE = blockItem("light_gray_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIGHT_GRAY_CUT_SANDSTONE = blockItem("light_gray_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIGHT_GRAY_CRACKED_SANDSTONE = blockItem("light_gray_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIGHT_GRAY_SMOOTH_SANDSTONE = blockItem("light_gray_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block LIGHT_GRAY_SAND = blockItem("light_gray_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block GRAY_SANDSTONE = blockItem("gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block GRAY_CHISELED_SANDSTONE = blockItem("gray_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block GRAY_CUT_SANDSTONE = blockItem("gray_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block GRAY_CRACKED_SANDSTONE = blockItem("gray_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block GRAY_SMOOTH_SANDSTONE = blockItem("gray_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block GRAY_SAND = blockItem("gray_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block BLACK_SANDSTONE = blockItem("black_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BLACK_CHISELED_SANDSTONE = blockItem("black_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BLACK_CUT_SANDSTONE = blockItem("black_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BLACK_CRACKED_SANDSTONE = blockItem("black_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BLACK_SMOOTH_SANDSTONE = blockItem("black_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BLACK_SAND = blockItem("black_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block WHITE_SANDSTONE = blockItem("white_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block WHITE_CHISELED_SANDSTONE = blockItem("white_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block WHITE_CUT_SANDSTONE = blockItem("white_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block WHITE_CRACKED_SANDSTONE = blockItem("white_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block WHITE_SMOOTH_SANDSTONE = blockItem("white_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block WHITE_SAND = blockItem("white_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block BROWN_SANDSTONE = blockItem("brown_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BROWN_CHISELED_SANDSTONE = blockItem("brown_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BROWN_CUT_SANDSTONE = blockItem("brown_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BROWN_CRACKED_SANDSTONE = blockItem("brown_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BROWN_SMOOTH_SANDSTONE = blockItem("brown_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block BROWN_SAND = blockItem("brown_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)));
    public static final Block RED_CRACKED_SANDSTONE = blockItem("red_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));
    public static final Block CRACKED_SANDSTONE = blockItem("cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)));

    public static final Block BERRY_BUSH = blockItem("berry_bush", new Block(BlockBehaviour.Properties.of(Material.GRASS)));

    private static Block blockItem(String name, Block block) {
        REGISTRY.register(name, block);
        PokeCraftItems.REGISTRY.register(name, new BlockItem(block, new Item.Properties()));
        return block;
    }

    public static void onInitialize() {
    }
}
