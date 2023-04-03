package com.thepokecraftmod.pokecraft.network;

import com.thepokecraftmod.pokecraft.network.packets.s2c.S2CSyncRegistry;
import com.thepokecraftmod.unimon.api.event.SetupEvents;
import com.thepokecraftmod.unimon.network.UniMonNetworking;

public class PokeCraftNetworking {

    public static void onInitialize() {
        SetupEvents.REGISTER_PACKETS.listen(() -> {
            UniMonNetworking.getInstance().registerPacket(S2CSyncRegistry.class, S2CSyncRegistry::new);
        });
    }
}
