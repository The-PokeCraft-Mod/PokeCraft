package com.thepokecraftmod.pokecraft.fabric.datagen.resources;

import com.thepokecraftmod.pokecraft.level.block.PokeCraftBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;

public class BlockModels extends FabricModelProvider {

    public BlockModels(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
        generator.createTrivialCube(PokeCraftBlocks.GREGANACL);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {

    }
}
