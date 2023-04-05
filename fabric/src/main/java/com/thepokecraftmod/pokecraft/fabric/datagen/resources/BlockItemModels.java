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
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
        generator.generateFlatItem(PokeCraftItems.POKE_BALL, ModelTemplates.FLAT_ITEM);
    }
}
