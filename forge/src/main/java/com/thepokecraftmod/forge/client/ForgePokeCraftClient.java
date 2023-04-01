package com.thepokecraftmod.forge.client;

import com.thepokecraftmod.client.PokeCraftClient;
import net.minecraftforge.eventbus.api.IEventBus;

public class ForgePokeCraftClient extends PokeCraftClient {

    public ForgePokeCraftClient(IEventBus eventBus) {
        PokeCraftClient.onInitialize(this);
    }
}
