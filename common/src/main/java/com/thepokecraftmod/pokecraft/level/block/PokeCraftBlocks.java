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
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.grower.CherryTreeGrower;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;

import static net.minecraft.world.level.block.Blocks.AMETHYST_CLUSTER;

public class PokeCraftBlocks {
    private static final MojangRegistry<Block, Registry<Block>> REGISTRY = PokeCraft.getInstance().newRegistry(Registries.BLOCK);

    private static final BlockBehaviour.Properties SAND = BlockBehaviour.Properties.of(Material.SAND, MaterialColor.COLOR_ORANGE)
            .strength(0.5f)
            .sound(SoundType.SAND);

    //          Building Blocks
    //Wood Types
    public static final Block DREAD_LOG = blockItem("dread_log", Blocks.log(MaterialColor.WOOD, MaterialColor.PODZOL), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block DREAD_WOOD = blockItem("dread_wood", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_GRAY).strength(2.0f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block STRIPPED_DREAD_LOG = blockItem("stripped_dread_log", Blocks.log(MaterialColor.WOOD, MaterialColor.TERRACOTTA_GRAY), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block STRIPPED_DREAD_WOOD = blockItem("stripped_dread_wood", new RotatedPillarBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_BLACK).strength(2.0f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block DREAD_PLANKS = blockItem("dread_planks", new Block(BlockBehaviour.Properties.of(Material.WOOD)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block DREAD_DOOR = blockItem("dread_door", new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD, DREAD_PLANKS.defaultMaterialColor()).strength(3.0f).noOcclusion(), BlockSetType.CHERRY), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block DREAD_TRAPDOOR = blockItem("dread_trapdoor", new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD, MaterialColor.TERRACOTTA_GRAY).strength(3.0f).noOcclusion(), BlockSetType.CHERRY), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    //Other
    public static final Block SILK_BLOCK = blockItem("silk_block", new Block(BlockBehaviour.Properties.of(Material.WOOL)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    //Brick Blocks
    //Scripted Sandstone
    // Gem Blocks
    public static final Block RUBY_BLOCK = blockItem("ruby_block", new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.EMERALD).requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL)), PokeCraftCreativeTabs.BUILDING_BLOCKS);
    public static final Block SAPPHIRE_BLOCK = blockItem("sapphire_block", new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.EMERALD).requiresCorrectToolForDrops().strength(5.0f, 6.0f).sound(SoundType.METAL)),PokeCraftCreativeTabs.BUILDING_BLOCKS);
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
    public static final Block CRACKED_SANDSTONE = blockItem("cracked_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_RED_SANDSTONE = blockItem("cracked_red_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block WHITE_SANDSTONE = blockItem("white_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_WHITE_SANDSTONE = blockItem("chiseled_white_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_WHITE_SANDSTONE = blockItem("smooth_white_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_WHITE_SANDSTONE = blockItem("cut_white_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block WHITE_SAND = blockItem("white_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_WHITE_SANDSTONE = blockItem("cracked_white_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_SANDSTONE = blockItem("light_gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_LIGHT_GRAY_SANDSTONE = blockItem("chiseled_light_gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_LIGHT_GRAY_SANDSTONE = blockItem("smooth_light_gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_LIGHT_GRAY_SANDSTONE = blockItem("cut_light_gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_SAND = blockItem("light_gray_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_LIGHT_GRAY_SANDSTONE = blockItem("cracked_light_gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_SANDSTONE = blockItem("gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_GRAY_SANDSTONE = blockItem("chiseled_gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_GRAY_SANDSTONE = blockItem("smooth_gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_GRAY_SANDSTONE = blockItem("cut_gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_SAND = blockItem("gray_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_GRAY_SANDSTONE = blockItem("cracked_gray_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_SANDSTONE = blockItem("black_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_BLACK_SANDSTONE = blockItem("chiseled_black_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_BLACK_SANDSTONE = blockItem("smooth_black_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_BLACK_SANDSTONE = blockItem("cut_black_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_SAND = blockItem("black_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_BLACK_SANDSTONE = blockItem("cracked_black_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_SANDSTONE = blockItem("brown_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_BROWN_SANDSTONE = blockItem("chiseled_brown_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_BROWN_SANDSTONE = blockItem("smooth_brown_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_BROWN_SANDSTONE = blockItem("cut_brown_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_SAND = blockItem("brown_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_BROWN_SANDSTONE = blockItem("cracked_brown_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_SANDSTONE = blockItem("orange_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_SANDSTONE_STAIRS = blockItem("orange_sandstone_stairs", new StairBlock(ORANGE_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(ORANGE_SANDSTONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_SANDSTONE_SLAB = blockItem("orange_sandstone_slab", new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(2.0f, 6.0f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_SANDSTONE_WALL = blockItem("orange_sandstone_wall", new WallBlock(BlockBehaviour.Properties.copy(ORANGE_SANDSTONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_ORANGE_SANDSTONE = blockItem("chiseled_orange_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_ORANGE_SANDSTONE = blockItem("smooth_orange_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_ORANGE_SANDSTONE_STAIRS = blockItem("smooth_orange_sandstone_stairs", new StairBlock(SMOOTH_ORANGE_SANDSTONE.defaultBlockState(), BlockBehaviour.Properties.copy(SMOOTH_ORANGE_SANDSTONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_ORANGE_SANDSTONE_SLAB = blockItem("smooth_orange_sandstone_slab", new SlabBlock(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(2.0f, 6.0f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_ORANGE_SANDSTONE_WALL = blockItem("smooth_orange_sandstone_wall", new WallBlock(BlockBehaviour.Properties.copy(SMOOTH_ORANGE_SANDSTONE)), PokeCraftCreativeTabs.COLORED_BLOCKS);    public static final Block CUT_ORANGE_SANDSTONE = blockItem("cut_orange_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_SAND = blockItem("orange_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_ORANGE_SANDSTONE = blockItem("cracked_orange_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_SANDSTONE = blockItem("yellow_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_YELLOW_SANDSTONE = blockItem("chiseled_yellow_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_YELLOW_SANDSTONE = blockItem("smooth_yellow_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_YELLOW_SANDSTONE = blockItem("cut_yellow_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_SAND = blockItem("yellow_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_YELLOW_SANDSTONE = blockItem("cracked_yellow_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_SANDSTONE = blockItem("lime_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_LIME_SANDSTONE = blockItem("chiseled_lime_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_LIME_SANDSTONE = blockItem("smooth_lime_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_LIME_SANDSTONE = blockItem("cut_lime_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_SAND = blockItem("lime_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_LIME_SANDSTONE = blockItem("cracked_lime_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_SANDSTONE = blockItem("green_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_GREEN_SANDSTONE = blockItem("chiseled_green_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_GREEN_SANDSTONE = blockItem("smooth_green_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_GREEN_SANDSTONE = blockItem("cut_green_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_SAND = blockItem("green_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_GREEN_SANDSTONE = blockItem("cracked_green_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_SANDSTONE = blockItem("cyan_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_CYAN_SANDSTONE = blockItem("chiseled_cyan_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_CYAN_SANDSTONE = blockItem("smooth_cyan_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_CYAN_SANDSTONE = blockItem("cut_cyan_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_SAND = blockItem("cyan_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_CYAN_SANDSTONE = blockItem("cracked_cyan_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_SANDSTONE = blockItem("light_blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_LIGHT_BLUE_SANDSTONE = blockItem("chiseled_light_blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_LIGHT_BLUE_SANDSTONE = blockItem("smooth_light_blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_LIGHT_BLUE_SANDSTONE = blockItem("cut_light_blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_SAND = blockItem("light_blue_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_LIGHT_BLUE_SANDSTONE = blockItem("cracked_light_blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_SANDSTONE = blockItem("blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_BLUE_SANDSTONE = blockItem("chiseled_blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_BLUE_SANDSTONE = blockItem("smooth_blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_BLUE_SANDSTONE = blockItem("cut_blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_SAND = blockItem("blue_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_BLUE_SANDSTONE = blockItem("cracked_blue_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_SANDSTONE = blockItem("purple_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_PURPLE_SANDSTONE = blockItem("chiseled_purple_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_PURPLE_SANDSTONE = blockItem("smooth_purple_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_PURPLE_SANDSTONE = blockItem("cut_purple_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_SAND = blockItem("purple_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_PURPLE_SANDSTONE = blockItem("cracked_purple_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_SANDSTONE = blockItem("magenta_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_MAGENTA_SANDSTONE = blockItem("chiseled_magenta_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_MAGENTA_SANDSTONE = blockItem("smooth_magenta_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_MAGENTA_SANDSTONE = blockItem("cut_magenta_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_SAND = blockItem("magenta_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_MAGENTA_SANDSTONE = blockItem("cracked_magenta_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_SANDSTONE = blockItem("pink_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CHISELED_PINK_SANDSTONE = blockItem("chiseled_pink_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block SMOOTH_PINK_SANDSTONE = blockItem("smooth_pink_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CUT_PINK_SANDSTONE = blockItem("cut_pink_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_SAND = blockItem("pink_sand", new SandBlock(0xA95821, BlockBehaviour.Properties.of(Material.SAND, MaterialColor.SAND).strength(0.5f).sound(SoundType.SAND)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CRACKED_PINK_SANDSTONE = blockItem("cracked_pink_sandstone", new Block(BlockBehaviour.Properties.of(Material.STONE, MaterialColor.SAND).requiresCorrectToolForDrops().strength(0.8f)), PokeCraftCreativeTabs.COLORED_BLOCKS);
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
    public static final Block WHITE_LIGHT = blockItem("white_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_GRAY_LIGHT = blockItem("light_gray_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GRAY_LIGHT = blockItem("gray_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLACK_LIGHT = blockItem("black_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BROWN_LIGHT = blockItem("brown_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block RED_LIGHT = blockItem("red_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block ORANGE_LIGHT = blockItem("orange_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block YELLOW_LIGHT = blockItem("yellow_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIME_LIGHT = blockItem("lime_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block GREEN_LIGHT = blockItem("green_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block CYAN_LIGHT = blockItem("cyan_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block LIGHT_BLUE_LIGHT = blockItem("light_blue_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block BLUE_LIGHT = blockItem("blue_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PURPLE_LIGHT = blockItem("purple_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block MAGENTA_LIGHT = blockItem("magenta_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);
    public static final Block PINK_LIGHT = blockItem("pink_light", new Block(BlockBehaviour.Properties.of(Material.GLASS, MaterialColor.SAND).strength(0.3f).sound(SoundType.GLASS).lightLevel(blockState -> 25)), PokeCraftCreativeTabs.COLORED_BLOCKS);



    //          Natural Blocks
    //Misc
    public static final Block WET_PACKED_MUD = blockItem("wet_packed_mud", new Block(BlockBehaviour.Properties.copy(Blocks.DIRT).strength(1.0f, 3.0f).sound(SoundType.PACKED_MUD)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    //Stone/Ore
    public static final Block PINK_AMETHYST_BLOCK = blockItem("pink_amethyst_block", new AmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PINK).strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block BUDDING_PINK_AMETHYST = blockItem("budding_pink_amethyst", new BuddingAmethystBlock(BlockBehaviour.Properties.of(Material.AMETHYST).randomTicks().strength(1.5f).sound(SoundType.AMETHYST).requiresCorrectToolForDrops()), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block SMALL_PINK_AMETHYST_BUD = blockItem("small_pink_amethyst_bud", new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.SMALL_AMETHYST_BUD).lightLevel(blockState -> 1)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block MEDIUM_PINK_AMETHYST_BUD = blockItem("medium_pink_amethyst_bud", new AmethystClusterBlock(4, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.MEDIUM_AMETHYST_BUD).lightLevel(blockState -> 2)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block LARGE_PINK_AMETHYST_BUD = blockItem("large_pink_amethyst_bud", new AmethystClusterBlock(5, 3, BlockBehaviour.Properties.copy(AMETHYST_CLUSTER).sound(SoundType.LARGE_AMETHYST_BUD).lightLevel(blockState -> 4)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block PINK_AMETHYST_CLUSTER = blockItem("pink_amethyst_cluster", new AmethystClusterBlock(3, 4, BlockBehaviour.Properties.copy(PINK_AMETHYST_BLOCK).sound(SoundType.AMETHYST_CLUSTER).lightLevel(blockState -> 1)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
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
    public static final Block SHORT_GRASS = blockItem("short_grass", new TallGrassBlock(BlockBehaviour.Properties.of(Material.REPLACEABLE_PLANT).noCollission().instabreak().sound(SoundType.GRASS).offsetType(BlockBehaviour.OffsetType.XYZ)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    public static final Block DREAD_SAPLING = blockItem("dread_sapling", new SaplingBlock(new CherryTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_GRAY).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    //public static final Block WEB_STRING = blockItem("web_string", new SaplingBlock(new CherryTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_GRAY).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    //public static final Block FRAYED_WEB_STRING = blockItem("frayed_web_string", new SaplingBlock(new CherryTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_GRAY).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING)), PokeCraftCreativeTabs.NATURAL_BLOCKS);
    //public static final Block SMALL_COBWEB = blockItem("small_cobweb", new SaplingBlock(new CherryTreeGrower(), BlockBehaviour.Properties.of(Material.PLANT, MaterialColor.COLOR_GRAY).noCollission().randomTicks().instabreak().sound(SoundType.CHERRY_SAPLING)), PokeCraftCreativeTabs.NATURAL_BLOCKS);



    //          Utility Blocks
    //Crafting
    public static final Block SPRUCE_CRAFTING_TABLE = blockItem("spruce_crafting_table", new CraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block BIRCH_CRAFTING_TABLE = blockItem("birch_crafting_table", new CraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block JUNGLE_CRAFTING_TABLE = blockItem("jungle_crafting_table", new CraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block ACACIA_CRAFTING_TABLE = blockItem("acacia_crafting_table", new CraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block DARK_OAK_CRAFTING_TABLE = blockItem("dark_oak_crafting_table", new CraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block MANGROVE_CRAFTING_TABLE = blockItem("mangrove_crafting_table", new CraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block CHERRY_CRAFTING_TABLE = blockItem("cherry_crafting_table", new CraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block BAMBOO_CRAFTING_TABLE = blockItem("bamboo_crafting_table", new CraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block CRIMSON_CRAFTING_TABLE = blockItem("crimson_crafting_table", new CraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block WARPED_CRAFTING_TABLE = blockItem("warped_crafting_table", new CraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
    public static final Block DREAD_CRAFTING_TABLE = blockItem("dread_crafting_table", new CraftingTableBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.5f).sound(SoundType.WOOD)), PokeCraftCreativeTabs.UTILITY_BLOCKS);
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
    ), PokeCraftCreativeTabs.DECORATION_BLOCKS);

    private static Block blockItem(String name, Block block, CreativeTab tab) {
        REGISTRY.register(name, block);
        var item = PokeCraftItems.REGISTRY.register(name, new BlockItem(block, new Item.Properties()));
        tab.items.add(() -> item);
        return block;
    }

    public static void onInitialize() {
    }
}
