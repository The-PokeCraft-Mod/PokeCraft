package com.thepokecraftmod.fabric;

import com.thepokecraftmod.PokeCraft;
import net.fabricmc.api.ModInitializer;

public class FabricPokeCraft extends PokeCraft implements ModInitializer {

    public FabricPokeCraft() {
        PokeCraft.onInitialize(this);
    }

    @Override
    public void onInitialize() {

    }
}
