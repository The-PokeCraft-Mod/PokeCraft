package com.thepokecraftmod.pokecraft.network.packets;

import net.minecraft.network.FriendlyByteBuf;

public interface GenericPacket {

    void encode(FriendlyByteBuf buf);
}
