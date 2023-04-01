package com.thepokecraftmod.fabric.client;

import com.thepokecraftmod.client.PokeCraftClient;
import net.fabricmc.api.ClientModInitializer;

public class FabricPokeCraftClient extends PokeCraftClient implements ClientModInitializer {

    public FabricPokeCraftClient() {
        PokeCraftClient.onInitialize(this);
    }

    @Override
    public void onInitializeClient() {
    }
}
