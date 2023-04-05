package com.thepokecraftmod.pokecraft.fabric.datagen.resources;

import com.thepokecraftmod.pokecraft.level.block.PokeCraftBlocks;
import com.thepokecraftmod.pokecraft.level.item.PokeCraftItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TexturedModel;

public class BlockItemModels extends FabricModelProvider {

    public BlockItemModels(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        generator.createTrivialBlock(PokeCraftBlocks.GREGANACL, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.ORANGE_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.ORANGE_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.ORANGE_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.ORANGE_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.ORANGE_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.YELLOW_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.YELLOW_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.YELLOW_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.YELLOW_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.YELLOW_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.LIME_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.LIME_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.LIME_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.LIME_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.LIME_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.GREEN_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.GREEN_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.GREEN_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.GREEN_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.GREEN_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.LIGHT_BLUE_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.LIGHT_BLUE_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.LIGHT_BLUE_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.LIGHT_BLUE_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.LIGHT_BLUE_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.CYAN_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.CYAN_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.CYAN_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.CYAN_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.CYAN_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.BLUE_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.BLUE_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.BLUE_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.BLUE_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.BLUE_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.MAGENTA_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.MAGENTA_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.MAGENTA_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.MAGENTA_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.MAGENTA_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.PURPLE_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.PURPLE_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.PURPLE_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.PURPLE_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.PURPLE_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.PINK_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.PINK_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.PINK_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.PINK_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.PINK_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.WHITE_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.WHITE_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.WHITE_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.WHITE_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.WHITE_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.LIGHT_GRAY_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.LIGHT_GRAY_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.LIGHT_GRAY_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.LIGHT_GRAY_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.LIGHT_GRAY_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.GRAY_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.GRAY_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.GRAY_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.GRAY_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.GRAY_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.BLACK_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.BLACK_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.BLACK_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.BLACK_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.BLACK_CRACKED_SANDSTONE);
        generator.createTrivialBlock(PokeCraftBlocks.BROWN_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.BROWN_CUT_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialBlock(PokeCraftBlocks.BROWN_CHISELED_SANDSTONE, TexturedModel.CUBE_TOP_BOTTOM);
        generator.createTrivialCube(PokeCraftBlocks.BROWN_SMOOTH_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.BROWN_CRACKED_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.RED_CRACKED_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.CRACKED_SANDSTONE);
        generator.createTrivialCube(PokeCraftBlocks.ORANGE_SAND);
        generator.createTrivialCube(PokeCraftBlocks.YELLOW_SAND);
        generator.createTrivialCube(PokeCraftBlocks.LIME_SAND);
        generator.createTrivialCube(PokeCraftBlocks.GREEN_SAND);
        generator.createTrivialCube(PokeCraftBlocks.LIGHT_BLUE_SAND);
        generator.createTrivialCube(PokeCraftBlocks.CYAN_SAND);
        generator.createTrivialCube(PokeCraftBlocks.BLUE_SAND);
        generator.createTrivialCube(PokeCraftBlocks.MAGENTA_SAND);
        generator.createTrivialCube(PokeCraftBlocks.PURPLE_SAND);
        generator.createTrivialCube(PokeCraftBlocks.PINK_SAND);
        generator.createTrivialCube(PokeCraftBlocks.WHITE_SAND);
        generator.createTrivialCube(PokeCraftBlocks.LIGHT_GRAY_SAND);
        generator.createTrivialCube(PokeCraftBlocks.GRAY_SAND);
        generator.createTrivialCube(PokeCraftBlocks.BLACK_SAND);
        generator.createTrivialCube(PokeCraftBlocks.BROWN_SAND);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(PokeCraftItems.BEAST_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.CHERISH_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.DIVE_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.DREAM_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.DUSK_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.FAST_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.FRIEND_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.GREAT_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.ANCIENT_GREAT_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.HEAL_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.HEAVY_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.LEADEN_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.LEVEL_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.LOVE_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.LURE_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.LUXURY_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.MASTER_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.MOON_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.NEST_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.NET_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.ORIGIN_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.PARK_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.POKE_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.ANCIENT_POKE_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.PREMIER_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.QUICK_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.REPEAT_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.SAFARI_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.SPORT_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.STRANGE_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.TIMER_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.ULTRA_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.ANCIENT_ULTRA_BALL, ModelTemplates.FLAT_ITEM);
        generator.generateFlatItem(PokeCraftItems.WING_BALL, ModelTemplates.FLAT_ITEM);
    }
}
