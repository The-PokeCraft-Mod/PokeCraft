package com.thepokecraftmod.pokecraft.network.packets.c2s;

import com.thepokecraftmod.pokecraft.api.event.DataEvents;
import com.thepokecraftmod.pokecraft.api.pokemon.PokemonParty;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;

/**
 * The client will send this when it is ready to receive the initial registry modifications, their party, and their boxes
 */
public class C2SRequestInitialSync implements C2SPacket {

    public C2SRequestInitialSync() {
    }

    public C2SRequestInitialSync(FriendlyByteBuf buf) {
    }

    @Override
    public void process(ServerPlayer sender) {
        DataEvents.SYNC_PLAYER.getInvoker().accept(sender);
        PokemonParty.ofPlayer(sender).sync();
    }

    @Override
    public void encode(FriendlyByteBuf buf) {
    }
}
