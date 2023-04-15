/*
 * Copyright (C) 2023 ThePokeCraftMod
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

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
