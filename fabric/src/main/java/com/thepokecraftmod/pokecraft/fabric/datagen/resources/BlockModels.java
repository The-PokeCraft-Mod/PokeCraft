package com.thepokecraftmod.pokecraft.fabric.datagen.resources;

import com.thepokecraftmod.pokecraft.level.block.PokeCraftBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.model.TexturedModel;

import javax.swing.table.TableModel;

public class BlockModels extends FabricModelProvider {

    public BlockModels(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        generator.createTrivialBlock(PokeCraftBlocks.GREGANACL, TexturedModel.CUBE_TOP_BOTTOM);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {

    }
}
