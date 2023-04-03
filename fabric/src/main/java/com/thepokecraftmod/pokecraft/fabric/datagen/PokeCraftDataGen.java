package com.thepokecraftmod.pokecraft.fabric.datagen;

import com.thepokecraftmod.pokecraft.fabric.datagen.resources.BlockModels;
import com.thepokecraftmod.pokecraft.fabric.datagen.resources.EnUsLang;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class PokeCraftDataGen implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        var pack = fabricDataGenerator.createPack();
        pack.addProvider(EnUsLang::new);
        pack.addProvider(BlockModels::new);
    }
}
