package com.thepokecraftmod.pokecraft.fabric.datagen.resources;

import com.thepokecraftmod.pokecraft.level.block.PokeCraftBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

public class EnUsLang extends FabricLanguageProvider {

    public EnUsLang(FabricDataOutput dataOutput) {
        super(dataOutput, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder builder) {
        builder.add(PokeCraftBlocks.GREGANACL, "greganacl");
    }
}
