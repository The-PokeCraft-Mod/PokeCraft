package com.thepokecraftmod.pokecraft.network.packets.c2s;

import com.thepokecraftmod.pokecraft.network.packets.GenericPacket;
import net.minecraft.server.level.ServerPlayer;

public interface C2SPacket extends GenericPacket {

    /**
     * Runs outside the network thread. Any logic should happen here to avoid putting load on the network thread. Make sure to safely call {@link net.minecraft.client.Minecraft#tell(Runnable)} to run rendering code
     */
    void process(ServerPlayer sender);
}
