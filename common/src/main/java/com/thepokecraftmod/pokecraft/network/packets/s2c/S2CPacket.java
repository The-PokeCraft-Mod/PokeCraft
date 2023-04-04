package com.thepokecraftmod.pokecraft.network.packets.s2c;

import com.thepokecraftmod.pokecraft.network.packets.GenericPacket;

public interface S2CPacket extends GenericPacket {

    /**
     * Runs outside the network thread. Any logic should happen here to avoid putting load on the network thread. Make sure to safely call {@link net.minecraft.client.Minecraft#tell(Runnable)} to run rendering code
     */
    void process();
}
