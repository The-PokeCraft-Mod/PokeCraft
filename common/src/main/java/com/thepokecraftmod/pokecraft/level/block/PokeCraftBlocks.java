/*
 * Copyright (C) 2023 ThePokeCraftMod
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package com.thepokecraftmod.pokecraft.level.block;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import com.thepokecraftmod.pokecraft.level.item.PokeCraftItems;
import com.thepokecraftmod.pokecraft.level.item.tab.CreativeTab;
import com.thepokecraftmod.pokecraft.level.item.tab.PokeCraftCreativeTabs;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class PokeCraftBlocks {
    private static final MojangRegistry<Block, Registry<Block>> REGISTRY = PokeCraft.getInstance().newRegistry(Registries.BLOCK);

    private static final BlockBehaviour.Properties SAND = BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE)
            .strength(0.5f)
            .sound(SoundType.SAND);

    public static final Block GREGANACL = blockItem("greganacl", new Block(BlockBehaviour.Properties.of(Material.BAMBOO)), PokeCraftCreativeTabs.BLOCKS);
    //Sandstone
    public static final Block ORANGE_SANDSTONE = blockItem("orange_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block ORANGE_SANDSTONE_STAIRS = blockItem("orange_sandstone_stairs", new StairBlock(ORANGE_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(ORANGE_SANDSTONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block ORANGE_CRACKED_SANDSTONE = blockItem("orange_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block ORANGE_SMOOTH_SANDSTONE = blockItem("orange_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block ORANGE_SAND = blockItem("orange_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.BLOCKS);
    public static final Block ORANGE_CHISELED_SANDSTONE = blockItem("orange_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block ORANGE_CUT_SANDSTONE = blockItem("orange_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block YELLOW_SANDSTONE = blockItem("yellow_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block YELLOW_CHISELED_SANDSTONE = blockItem("yellow_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block YELLOW_CUT_SANDSTONE = blockItem("yellow_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block YELLOW_CRACKED_SANDSTONE = blockItem("yellow_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block YELLOW_SMOOTH_SANDSTONE = blockItem("yellow_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block YELLOW_SAND = blockItem("yellow_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIME_SANDSTONE = blockItem("lime_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIME_CHISELED_SANDSTONE = blockItem("lime_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIME_CUT_SANDSTONE = blockItem("lime_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIME_CRACKED_SANDSTONE = blockItem("lime_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIME_SMOOTH_SANDSTONE = blockItem("lime_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIME_SAND = blockItem("lime_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GREEN_SANDSTONE = blockItem("green_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GREEN_CHISELED_SANDSTONE = blockItem("green_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GREEN_CUT_SANDSTONE = blockItem("green_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GREEN_CRACKED_SANDSTONE = blockItem("green_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GREEN_SMOOTH_SANDSTONE = blockItem("green_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GREEN_SAND = blockItem("green_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_BLUE_SANDSTONE = blockItem("light_blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_BLUE_CHISELED_SANDSTONE = blockItem("light_blue_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_BLUE_CUT_SANDSTONE = blockItem("light_blue_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_BLUE_CRACKED_SANDSTONE = blockItem("light_blue_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_BLUE_SMOOTH_SANDSTONE = blockItem("light_blue_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_BLUE_SAND = blockItem("light_blue_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CYAN_SANDSTONE = blockItem("cyan_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CYAN_CHISELED_SANDSTONE = blockItem("cyan_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CYAN_CUT_SANDSTONE = blockItem("cyan_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CYAN_CRACKED_SANDSTONE = blockItem("cyan_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CYAN_SMOOTH_SANDSTONE = blockItem("cyan_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CYAN_SAND = blockItem("cyan_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLUE_SANDSTONE = blockItem("blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLUE_CHISELED_SANDSTONE = blockItem("blue_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLUE_CUT_SANDSTONE = blockItem("blue_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLUE_CRACKED_SANDSTONE = blockItem("blue_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLUE_SMOOTH_SANDSTONE = blockItem("blue_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLUE_SAND = blockItem("blue_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block MAGENTA_SANDSTONE = blockItem("magenta_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block MAGENTA_CHISELED_SANDSTONE = blockItem("magenta_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block MAGENTA_CUT_SANDSTONE = blockItem("magenta_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block MAGENTA_CRACKED_SANDSTONE = blockItem("magenta_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block MAGENTA_SMOOTH_SANDSTONE = blockItem("magenta_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block MAGENTA_SAND = blockItem("magenta_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PURPLE_SANDSTONE = blockItem("purple_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PURPLE_CHISELED_SANDSTONE = blockItem("purple_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PURPLE_CUT_SANDSTONE = blockItem("purple_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PURPLE_CRACKED_SANDSTONE = blockItem("purple_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PURPLE_SMOOTH_SANDSTONE = blockItem("purple_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PURPLE_SAND = blockItem("purple_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PINK_SANDSTONE = blockItem("pink_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PINK_CHISELED_SANDSTONE = blockItem("pink_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PINK_CUT_SANDSTONE = blockItem("pink_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PINK_CRACKED_SANDSTONE = blockItem("pink_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PINK_SMOOTH_SANDSTONE = blockItem("pink_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PINK_SAND = blockItem("pink_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_GRAY_SANDSTONE = blockItem("light_gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_GRAY_CHISELED_SANDSTONE = blockItem("light_gray_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_GRAY_CUT_SANDSTONE = blockItem("light_gray_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_GRAY_CRACKED_SANDSTONE = blockItem("light_gray_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_GRAY_SMOOTH_SANDSTONE = blockItem("light_gray_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_GRAY_SAND = blockItem("light_gray_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GRAY_SANDSTONE = blockItem("gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GRAY_CHISELED_SANDSTONE = blockItem("gray_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GRAY_CUT_SANDSTONE = blockItem("gray_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GRAY_CRACKED_SANDSTONE = blockItem("gray_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GRAY_SMOOTH_SANDSTONE = blockItem("gray_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GRAY_SAND = blockItem("gray_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLACK_SANDSTONE = blockItem("black_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLACK_CHISELED_SANDSTONE = blockItem("black_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLACK_CUT_SANDSTONE = blockItem("black_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLACK_CRACKED_SANDSTONE = blockItem("black_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLACK_SMOOTH_SANDSTONE = blockItem("black_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLACK_SAND = blockItem("black_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block WHITE_SANDSTONE = blockItem("white_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block WHITE_CHISELED_SANDSTONE = blockItem("white_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block WHITE_CUT_SANDSTONE = blockItem("white_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block WHITE_CRACKED_SANDSTONE = blockItem("white_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block WHITE_SMOOTH_SANDSTONE = blockItem("white_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block WHITE_SAND = blockItem("white_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BROWN_SANDSTONE = blockItem("brown_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BROWN_CHISELED_SANDSTONE = blockItem("brown_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BROWN_CUT_SANDSTONE = blockItem("brown_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BROWN_CRACKED_SANDSTONE = blockItem("brown_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BROWN_SMOOTH_SANDSTONE = blockItem("brown_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BROWN_SAND = blockItem("brown_sand", new Block(BlockBehaviour.Properties.of(Material.SAND)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block RED_CRACKED_SANDSTONE = blockItem("red_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CRACKED_SANDSTONE = blockItem("cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    //Ore/G, PokeCraftCreativeTabs.BLOCKSem
    public static final Block RUBY_ORE = blockItem("ruby_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block DEEPSLATE_RUBY_ORE = blockItem("deepslate_ruby_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block RUBY_BLOCK = blockItem("ruby_block", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block SAPPHIRE_ORE = blockItem("sapphire_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block DEEPSLATE_SAPPHIRE_ORE = blockItem("deepslate_sapphire_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block SAPPHIRE_BLOCK = blockItem("sapphire_block", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CHARGESTONE_ORE = blockItem("chargestone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block DEEPSLATE_CHARGESTONE_ORE = blockItem("deepslate_chargestone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    //Prismarine
    public static final Block RED_PRISMARINE_BRICKS = blockItem("red_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block ORANGE_PRISMARINE_BRICKS = blockItem("orange_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block YELLOW_PRISMARINE_BRICKS = blockItem("yellow_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIME_PRISMARINE_BRICKS = blockItem("lime_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GREEN_PRISMARINE_BRICKS = blockItem("green_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_BLUE_PRISMARINE_BRICKS = blockItem("light_blue_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CYAN_PRISMARINE_BRICKS = blockItem("cyan_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLUE_PRISMARINE_BRICKS = blockItem("blue_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PINK_PRISMARINE_BRICKS = blockItem("pink_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block MAGENTA_PRISMARINE_BRICKS = blockItem("magenta_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PURPLE_PRISMARINE_BRICKS = blockItem("purple_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block WHITE_PRISMARINE_BRICKS = blockItem("white_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_GRAY_PRISMARINE_BRICKS = blockItem("light_gray_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GRAY_PRISMARINE_BRICKS = blockItem("gray_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLACK_PRISMARINE_BRICKS = blockItem("black_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BROWN_PRISMARINE_BRICKS = blockItem("brown_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block RED_DARK_PRISMARINE = blockItem("red_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block ORANGE_DARK_PRISMARINE = blockItem("orange_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block YELLOW_DARK_PRISMARINE = blockItem("yellow_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIME_DARK_PRISMARINE = blockItem("lime_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GREEN_DARK_PRISMARINE = blockItem("green_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_BLUE_DARK_PRISMARINE = blockItem("light_blue_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CYAN_DARK_PRISMARINE = blockItem("cyan_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLUE_DARK_PRISMARINE = blockItem("blue_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PINK_DARK_PRISMARINE = blockItem("pink_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block MAGENTA_DARK_PRISMARINE = blockItem("magenta_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PURPLE_DARK_PRISMARINE = blockItem("purple_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block WHITE_DARK_PRISMARINE = blockItem("white_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_GRAY_DARK_PRISMARINE = blockItem("light_gray_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GRAY_DARK_PRISMARINE = blockItem("gray_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLACK_DARK_PRISMARINE = blockItem("black_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BROWN_DARK_PRISMARINE = blockItem("brown_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    //Bricks
    public static final Block RED_BRICKS = blockItem("red_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block ORANGE_BRICKS = blockItem("orange_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block YELLOW_BRICKS = blockItem("yellow_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIME_BRICKS = blockItem("lime_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GREEN_BRICKS = blockItem("green_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_BLUE_BRICKS = blockItem("light_blue_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CYAN_BRICKS = blockItem("cyan_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLUE_BRICKS = blockItem("blue_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PINK_BRICKS = blockItem("pink_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block MAGENTA_BRICKS = blockItem("magenta_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PURPLE_BRICKS = blockItem("purple_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block WHITE_BRICKS = blockItem("white_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_GRAY_BRICKS = blockItem("light_gray_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GRAY_BRICKS = blockItem("gray_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLACK_BRICKS = blockItem("black_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BROWN_BRICKS = blockItem("brown_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    //Crafting Table
    public static final Block BIRCH_CRAFTING_TABLE = blockItem("birch_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block SPRUCE_CRAFTING_TABLE = blockItem("spruce_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block JUNGLE_CRAFTING_TABLE = blockItem("jungle_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block ACACIA_CRAFTING_TABLE = blockItem("acacia_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block DARK_OAK_CRAFTING_TABLE = blockItem("dark_oak_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CRIMSON_CRAFTING_TABLE = blockItem("crimson_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block WARPED_CRAFTING_TABLE = blockItem("warped_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block MANGROVE_CRAFTING_TABLE = blockItem("mangrove_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CHERRY_CRAFTING_TABLE = blockItem("cherry_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    //Furnace
    public static final Block DEEPSLATE_FURNACE = blockItem("deepslate_furnace", new FurnaceBlock(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLACKSTONE_FURNACE = blockItem("blackstone_furnace", new FurnaceBlock(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    //Shingles
    public static final Block WHITE_SHINGLES = blockItem("white_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_GRAY_SHINGLES = blockItem("light_gray_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GRAY_SHINGLES = blockItem("gray_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLACK_SHINGLES = blockItem("black_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BROWN_SHINGLES = blockItem("brown_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block RED_SHINGLES = blockItem("red_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block ORANGE_SHINGLES = blockItem("orange_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block YELLOW_SHINGLES = blockItem("yellow_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIME_SHINGLES = blockItem("lime_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block GREEN_SHINGLES = blockItem("green_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CYAN_SHINGLES = blockItem("cyan_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block LIGHT_BLUE_SHINGLES = blockItem("light_blue_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block BLUE_SHINGLES = blockItem("blue_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PURPLE_SHINGLES = blockItem("purple_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block MAGENTA_SHINGLES = blockItem("magenta_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block PINK_SHINGLES = blockItem("pink_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block CHARGESTONE_BLOCK = blockItem("chargestone_block", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block WATER_STONE_BLOCK = blockItem("water_stone_block", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);
    public static final Block THUNDER_STONE_BLOCK = blockItem("thunder_stone_block", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.BLOCKS);

    public static final Block BERRY_BUSH = blockItem("berry_bush", new FlowerBlock(MobEffects.WEAKNESS, 0, BlockBehaviour.Properties.of(Material.PLANT)
            .noCollission()
            .instabreak()
            .sound(SoundType.GRASS)
            .offsetType(BlockBehaviour.OffsetType.XZ)
    ), PokeCraftCreativeTabs.BLOCKS);

    private static Block blockItem(String name, Block block, CreativeTab tab) {
        REGISTRY.register(name, block);
        var item = PokeCraftItems.REGISTRY.register(name, new BlockItem(block, new Item.Properties()));
        tab.items.add(() -> item);
        return block;
    }

    public static void onInitialize() {
    }
}
