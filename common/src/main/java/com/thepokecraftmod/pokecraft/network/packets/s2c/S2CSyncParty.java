package com.thepokecraftmod.pokecraft.network.packets.s2c;

import com.thepokecraftmod.pokecraft.api.pokemon.PokemonParty;
import com.thepokecraftmod.pokecraft.network.handler.ClientPacketHandler;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.FriendlyByteBuf;

/**
 * Sent from inside of {@link PokemonParty#sync()}. Direct use is highly discouraged
 */
public class S2CSyncParty implements S2CPacket {

    private final CompoundTag partyTag;

    public S2CSyncParty(PokemonParty party) {
        this.partyTag = party.saveAdditionalData(new CompoundTag());
    }

    public S2CSyncParty(FriendlyByteBuf buf) {
        this.partyTag = buf.readNbt();
    }

    @Override
    public void encode(FriendlyByteBuf buf) {
        buf.writeNbt(partyTag);
    }

    @Override
    public void process() {
        ClientPacketHandler.handleSyncParty(partyTag);
    }
}
