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

import com.mojang.blaze3d.platform.Lighting;
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
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

public class PokeCraftBlocks {
    private static final MojangRegistry<Block, Registry<Block>> REGISTRY = PokeCraft.getInstance().newRegistry(Registries.BLOCK);

    private static final BlockBehaviour.Properties SAND = BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE)
            .strength(0.5f)
            .sound(SoundType.SAND);

    public static final Block GREGANACL = blockItem("greganacl", new Block(BlockBehaviour.Properties.of(Material.BAMBOO)), PokeCraftCreativeTabs.BLOCKS);

    //          Building Blocks
    //Wood Types
    public static final Block DREAD_LOG = blockItem("dread_log", Blocks.log(MaterialColor.WOOD, MaterialColor.PODZOL), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block DREAD_WOOD = blockItem("dread_wood", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block STRIPPED_DREAD_LOG = blockItem("stripped_dread_log", Blocks.log(MaterialColor.WOOD, MaterialColor.PODZOL), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block STRIPPED_DREAD_WOOD = blockItem("stripped_dread_wood", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block DREAD_PLANKS = blockItem("dread_planks", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block DREAD_DOOR = blockItem("dread_door", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block DREAD_TRAPDOOR = blockItem("dread_trapdoor", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    //Brick Blocks
    //Scripted Sandstone
    // Gem Blocks
    public static final Block RUBY_BLOCK = blockItem("ruby_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block SAPPHIRE_BLOCK = blockItem("sapphire_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block CHARGESTONE_BLOCK = blockItem("chargestone_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block FIRE_STONE_BLOCK = blockItem("fire_stone_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block WATER_STONE_BLOCK = blockItem("water_stone_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block THUNDER_STONE_BLOCK = blockItem("thunder_stone_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block LEAF_STONE_BLOCK = blockItem("leaf_stone_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block MOON_STONE_BLOCK = blockItem("moon_stone_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block SUN_STONE_BLOCK = blockItem("sun_stone_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block SHINY_STONE_BLOCK = blockItem("shiny_stone_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block DUSK_STONE_BLOCK = blockItem("dusk_stone_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block DAWN_STONE_BLOCK = blockItem("dawn_stone_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block ICE_STONE_BLOCK = blockItem("ice_stone_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block OVAL_STONE_BLOCK = blockItem("oval_stone_block", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);



    //          Colored Blocks
    //Bricks
    public static final Block WHITE_BRICKS = blockItem("white_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_BRICKS = blockItem("light_gray_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_BRICKS = blockItem("gray_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_BRICKS = blockItem("black_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_BRICKS = blockItem("brown_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block RED_BRICKS = blockItem("red_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_BRICKS = blockItem("orange_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_BRICKS = blockItem("yellow_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_BRICKS = blockItem("lime_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_BRICKS = blockItem("green_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_BRICKS = blockItem("cyan_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_BRICKS = blockItem("light_blue_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_BRICKS = blockItem("blue_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_BRICKS = blockItem("purple_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_BRICKS = blockItem("magenta_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_BRICKS = blockItem("pink_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    //Shingles
    public static final Block WHITE_SHINGLES = blockItem("white_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_SHINGLES = blockItem("light_gray_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_SHINGLES = blockItem("gray_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_SHINGLES = blockItem("black_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_SHINGLES = blockItem("brown_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block RED_SHINGLES = blockItem("red_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_SHINGLES = blockItem("orange_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_SHINGLES = blockItem("yellow_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_SHINGLES = blockItem("lime_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_SHINGLES = blockItem("green_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_SHINGLES = blockItem("cyan_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_SHINGLES = blockItem("light_blue_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_SHINGLES = blockItem("blue_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_SHINGLES = blockItem("purple_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_SHINGLES = blockItem("magenta_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_SHINGLES = blockItem("pink_shingles", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    //Sandstone
    public static final Block CRACKED_SANDSTONE = blockItem("cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block RED_CRACKED_SANDSTONE = blockItem("red_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block WHITE_SANDSTONE = blockItem("white_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block WHITE_CHISELED_SANDSTONE = blockItem("white_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block WHITE_SMOOTH_SANDSTONE = blockItem("white_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block WHITE_CUT_SANDSTONE = blockItem("white_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block WHITE_SAND = blockItem("white_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block WHITE_CRACKED_SANDSTONE = blockItem("white_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_SANDSTONE = blockItem("light_gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_CHISELED_SANDSTONE = blockItem("light_gray_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_SMOOTH_SANDSTONE = blockItem("light_gray_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_CUT_SANDSTONE = blockItem("light_gray_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_SAND = blockItem("light_gray_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_CRACKED_SANDSTONE = blockItem("light_gray_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_SANDSTONE = blockItem("gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_CHISELED_SANDSTONE = blockItem("gray_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_SMOOTH_SANDSTONE = blockItem("gray_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_CUT_SANDSTONE = blockItem("gray_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_SAND = blockItem("gray_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_CRACKED_SANDSTONE = blockItem("gray_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_SANDSTONE = blockItem("black_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_CHISELED_SANDSTONE = blockItem("black_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_SMOOTH_SANDSTONE = blockItem("black_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_CUT_SANDSTONE = blockItem("black_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_SAND = blockItem("black_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_CRACKED_SANDSTONE = blockItem("black_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_SANDSTONE = blockItem("brown_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_CHISELED_SANDSTONE = blockItem("brown_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_SMOOTH_SANDSTONE = blockItem("brown_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_CUT_SANDSTONE = blockItem("brown_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_SAND = blockItem("brown_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_CRACKED_SANDSTONE = blockItem("brown_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_SANDSTONE = blockItem("orange_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_SANDSTONE_STAIRS = blockItem("orange_sandstone_stairs", new StairBlock(ORANGE_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(ORANGE_SANDSTONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_CHISELED_SANDSTONE = blockItem("orange_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_SMOOTH_SANDSTONE = blockItem("orange_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_CUT_SANDSTONE = blockItem("orange_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_SAND = blockItem("orange_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_CRACKED_SANDSTONE = blockItem("orange_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_SANDSTONE = blockItem("yellow_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_CHISELED_SANDSTONE = blockItem("yellow_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_SMOOTH_SANDSTONE = blockItem("yellow_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_CUT_SANDSTONE = blockItem("yellow_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_SAND = blockItem("yellow_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_CRACKED_SANDSTONE = blockItem("yellow_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_SANDSTONE = blockItem("lime_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_CHISELED_SANDSTONE = blockItem("lime_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_SMOOTH_SANDSTONE = blockItem("lime_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_CUT_SANDSTONE = blockItem("lime_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_SAND = blockItem("lime_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_CRACKED_SANDSTONE = blockItem("lime_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_SANDSTONE = blockItem("green_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_CHISELED_SANDSTONE = blockItem("green_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_SMOOTH_SANDSTONE = blockItem("green_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_CUT_SANDSTONE = blockItem("green_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_SAND = blockItem("green_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_CRACKED_SANDSTONE = blockItem("green_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_SANDSTONE = blockItem("cyan_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_CHISELED_SANDSTONE = blockItem("cyan_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_SMOOTH_SANDSTONE = blockItem("cyan_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_CUT_SANDSTONE = blockItem("cyan_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_SAND = blockItem("cyan_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_CRACKED_SANDSTONE = blockItem("cyan_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_SANDSTONE = blockItem("light_blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_CHISELED_SANDSTONE = blockItem("light_blue_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_SMOOTH_SANDSTONE = blockItem("light_blue_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_CUT_SANDSTONE = blockItem("light_blue_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_SAND = blockItem("light_blue_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_CRACKED_SANDSTONE = blockItem("light_blue_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_SANDSTONE = blockItem("blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_CHISELED_SANDSTONE = blockItem("blue_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_SMOOTH_SANDSTONE = blockItem("blue_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_CUT_SANDSTONE = blockItem("blue_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_SAND = blockItem("blue_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_CRACKED_SANDSTONE = blockItem("blue_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_SANDSTONE = blockItem("purple_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_CHISELED_SANDSTONE = blockItem("purple_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_SMOOTH_SANDSTONE = blockItem("purple_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_CUT_SANDSTONE = blockItem("purple_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_SAND = blockItem("purple_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_CRACKED_SANDSTONE = blockItem("purple_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_SANDSTONE = blockItem("magenta_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_CHISELED_SANDSTONE = blockItem("magenta_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_SMOOTH_SANDSTONE = blockItem("magenta_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_CUT_SANDSTONE = blockItem("magenta_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_SAND = blockItem("magenta_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_CRACKED_SANDSTONE = blockItem("magenta_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_SANDSTONE = blockItem("pink_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_CHISELED_SANDSTONE = blockItem("pink_chiseled_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_SMOOTH_SANDSTONE = blockItem("pink_smooth_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_CUT_SANDSTONE = blockItem("pink_cut_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_SAND = blockItem("pink_sand", new SandBlock(0xA95821, SAND), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_CRACKED_SANDSTONE = blockItem("pink_cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    //Prismarine
    public static final Block WHITE_PRISMARINE = blockItem("white_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block WHITE_PRISMARINE_BRICKS = blockItem("white_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block WHITE_DARK_PRISMARINE = blockItem("white_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_PRISMARINE = blockItem("light_gray_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_PRISMARINE_BRICKS = blockItem("light_gray_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_DARK_PRISMARINE = blockItem("light_gray_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_PRISMARINE = blockItem("gray_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_PRISMARINE_BRICKS = blockItem("gray_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_DARK_PRISMARINE = blockItem("gray_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_PRISMARINE = blockItem("black_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_PRISMARINE_BRICKS = blockItem("black_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_DARK_PRISMARINE = blockItem("black_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_PRISMARINE = blockItem("brown_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_PRISMARINE_BRICKS = blockItem("brown_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_DARK_PRISMARINE = blockItem("brown_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block RED_PRISMARINE = blockItem("red_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block RED_PRISMARINE_BRICKS = blockItem("red_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block RED_DARK_PRISMARINE = blockItem("red_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_PRISMARINE = blockItem("orange_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_PRISMARINE_BRICKS = blockItem("orange_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_DARK_PRISMARINE = blockItem("orange_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_PRISMARINE = blockItem("yellow_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_PRISMARINE_BRICKS = blockItem("yellow_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_DARK_PRISMARINE = blockItem("yellow_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_PRISMARINE = blockItem("lime_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_PRISMARINE_BRICKS = blockItem("lime_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_DARK_PRISMARINE = blockItem("lime_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_PRISMARINE = blockItem("green_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_PRISMARINE_BRICKS = blockItem("green_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_DARK_PRISMARINE = blockItem("green_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_PRISMARINE = blockItem("cyan_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_PRISMARINE_BRICKS = blockItem("cyan_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_DARK_PRISMARINE = blockItem("cyan_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_PRISMARINE = blockItem("light_blue_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_PRISMARINE_BRICKS = blockItem("light_blue_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_DARK_PRISMARINE = blockItem("light_blue_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_PRISMARINE = blockItem("blue_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_PRISMARINE_BRICKS = blockItem("blue_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_DARK_PRISMARINE = blockItem("blue_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_PRISMARINE = blockItem("purple_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_PRISMARINE_BRICKS = blockItem("purple_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_DARK_PRISMARINE = blockItem("purple_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_PRISMARINE = blockItem("magenta_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_PRISMARINE_BRICKS = blockItem("magenta_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_DARK_PRISMARINE = blockItem("magenta_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_PRISMARINE = blockItem("pink_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_PRISMARINE_BRICKS = blockItem("pink_prismarine_bricks", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_DARK_PRISMARINE = blockItem("pink_dark_prismarine", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    //RedstoneLamp
    public static final Block WHITE_REDSTONE_LAMP = blockItem("white_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_REDSTONE_LAMP = blockItem("light_gray_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_REDSTONE_LAMP = blockItem("gray_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_REDSTONE_LAMP = blockItem("black_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_REDSTONE_LAMP = blockItem("brown_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block RED_REDSTONE_LAMP = blockItem("red_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_REDSTONE_LAMP = blockItem("orange_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_REDSTONE_LAMP = blockItem("yellow_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_REDSTONE_LAMP = blockItem("lime_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_REDSTONE_LAMP = blockItem("green_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_REDSTONE_LAMP = blockItem("cyan_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_REDSTONE_LAMP = blockItem("light_blue_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_REDSTONE_LAMP = blockItem("blue_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_REDSTONE_LAMP = blockItem("purple_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_REDSTONE_LAMP = blockItem("magenta_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_REDSTONE_LAMP = blockItem("pink_redstone_lamp", new RedstoneLampBlock(BlockBehaviour.Properties.of(Material.BUILDABLE_GLASS).lightLevel(Blocks.litBlockEmission(15)).strength(0.3f).sound(SoundType.GLASS)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    //Glowstone
    public static final Block WHITE_GLOWSTONE = blockItem("white_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_GLOWSTONE = blockItem("light_gray_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_GLOWSTONE = blockItem("gray_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_GLOWSTONE = blockItem("black_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_GLOWSTONE = blockItem("brown_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block RED_GLOWSTONE = blockItem("red_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_GLOWSTONE = blockItem("orange_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_GLOWSTONE = blockItem("yellow_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_GLOWSTONE = blockItem("lime_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_GLOWSTONE = blockItem("green_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_GLOWSTONE = blockItem("cyan_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_GLOWSTONE = blockItem("light_blue_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_GLOWSTONE = blockItem("blue_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_GLOWSTONE = blockItem("purple_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_GLOWSTONE = blockItem("magenta_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_GLOWSTONE = blockItem("pink_glowstone", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 15)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    //UltraLight
    public static final Block WHITE_ULTRA_LIGHT = blockItem("white_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_ULTRA_LIGHT = blockItem("light_gray_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_ULTRA_LIGHT = blockItem("gray_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_ULTRA_LIGHT = blockItem("black_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_ULTRA_LIGHT = blockItem("brown_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block RED_ULTRA_LIGHT = blockItem("red_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_ULTRA_LIGHT = blockItem("orange_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_ULTRA_LIGHT = blockItem("yellow_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_ULTRA_LIGHT = blockItem("lime_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_ULTRA_LIGHT = blockItem("green_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_ULTRA_LIGHT = blockItem("cyan_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_ULTRA_LIGHT = blockItem("light_blue_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_ULTRA_LIGHT = blockItem("blue_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_ULTRA_LIGHT = blockItem("purple_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_ULTRA_LIGHT = blockItem("magenta_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_ULTRA_LIGHT = blockItem("pink_ultra_light", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);



    //          Natural Blocks
    //Misc
    //Stone/Ore
    public static final Block RUBY_ORE = blockItem("ruby_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_RUBY_ORE = blockItem("deepslate_ruby_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block SAPPHIRE_ORE = blockItem("sapphire_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_SAPPHIRE_ORE = blockItem("deepslate_sapphire_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block CHARGESTONE_ORE = blockItem("chargestone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_CHARGESTONE_ORE = blockItem("deepslate_chargestone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block FOSSIL_ORE = blockItem("fossil_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_FOSSIL_ORE = blockItem("deepslate_fossil_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block Z_CRYSTAL_ORE = blockItem("z_crystal_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_Z_CRYSTAL_ORE = blockItem("deepslate_z_crystal_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block ORIGIN_ORE = blockItem("origin_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_ORIGIN_ORE = blockItem("deepslate_origin_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block FIRE_STONE_ORE = blockItem("fire_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_FIRE_STONE_ORE = blockItem("deepslate_fire_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block WATER_STONE_ORE = blockItem("water_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_WATER_STONE_ORE = blockItem("deepslate_water_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block THUNDER_STONE_ORE = blockItem("thunder_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_THUNDER_STONE_ORE = blockItem("deepslate_thunder_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block LEAF_STONE_ORE = blockItem("leaf_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_LEAF_STONE_ORE = blockItem("deepslate_leaf_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block MOON_STONE_ORE = blockItem("moon_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_MOON_STONE_ORE = blockItem("deepslate_moon_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block SUN_STONE_ORE = blockItem("sun_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_SUN_STONE_ORE = blockItem("deepslate_sun_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block SHINY_STONE_ORE = blockItem("shiny_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_SHINY_STONE_ORE = blockItem("deepslate_shiny_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DUSK_STONE_ORE = blockItem("dusk_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_DUSK_STONE_ORE = blockItem("deepslate_dusk_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DAWN_STONE_ORE = blockItem("dawn_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_DAWN_STONE_ORE = blockItem("deepslate_dawn_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block ICE_STONE_ORE = blockItem("ice_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_ICE_STONE_ORE = blockItem("deepslate_ice_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block OVAL_STONE_ORE = blockItem("oval_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DEEPSLATE_OVAL_STONE_ORE = blockItem("deepslate_oval_stone_ore", new Block(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    // Plants
    public static final Block SHORT_GRASS = blockItem("short_grass", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DREAD_SAPLING = blockItem("dread_sapling", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.NATURAL_BLOCKS);



    //          Utility Blocks
    //Crafting
    public static final Block SPRUCE_CRAFTING_TABLE = blockItem("spruce_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block BIRCH_CRAFTING_TABLE = blockItem("birch_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block JUNGLE_CRAFTING_TABLE = blockItem("jungle_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block ACACIA_CRAFTING_TABLE = blockItem("acacia_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block DARK_OAK_CRAFTING_TABLE = blockItem("dark_oak_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block MANGROVE_CRAFTING_TABLE = blockItem("mangrove_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block CHERRY_CRAFTING_TABLE = blockItem("cherry_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block BAMBOO_CRAFTING_TABLE = blockItem("bamboo_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block CRIMSON_CRAFTING_TABLE = blockItem("crimson_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block WARPED_CRAFTING_TABLE = blockItem("warped_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block DREAD_CRAFTING_TABLE = blockItem("dread_crafting_table", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block DEEPSLATE_FURNACE = blockItem("deepslate_furnace", new FurnaceBlock(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block BLACKSTONE_FURNACE = blockItem("blackstone_furnace", new FurnaceBlock(BlockBehaviour.Properties.of(Material.STONE)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    //Other
    //PixelmonTech
    //Containers



    //          Decoration
    //Rugs
    //Paintings
    //Umbrellas
    //Pillars

    //          Models
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
