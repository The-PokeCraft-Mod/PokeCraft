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

package com.thepokecraftmod.pokecraft.api.pokemon;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.event.DataEvents;
import com.thepokecraftmod.pokecraft.api.event.ctx.MovePokemonContext;
import com.thepokecraftmod.pokecraft.network.PokeCraftNetworking;
import com.thepokecraftmod.pokecraft.network.packets.s2c.S2CSyncParty;
import it.unimi.dsi.fastutil.objects.Object2ObjectArrayMap;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Represents a party of pokemons. Stores a list of {@link PokemonInstance}
 */
public class PokemonParty {
    private static final Map<ServerPlayer, PokemonParty> PLAYER_PARTY_CACHE = new Object2ObjectArrayMap<>();
    private final LivingEntity owner;
    private final List<PokemonInstance> pokemons;

    /**
     * Creates a brand-new {@link PokemonParty}
     *
     * @param owner the owner of the party
     */
    public PokemonParty(@NotNull LivingEntity owner) {
        this.owner = owner;
        this.pokemons = new ArrayList<>();

        if (owner instanceof ServerPlayer player) {
            if (PLAYER_PARTY_CACHE.containsKey(player))
                throw new RuntimeException("Tried overwriting " + player.getDisplayName().getString() + "'s party");
            PLAYER_PARTY_CACHE.put(player, this);
        }
    }

    /**
     * Returns the party of pokemon that the owner has. This party can be greater or less than 6 depending on the implementation. <b>DO NOT ADD POKEMON DIRECTLY TO THIS LIST. USE {@link PokemonParty#addPokemon(PokemonInstance)}</b> however, if you break this rule make sure to call {@link PokemonParty#sync()} afterward
     */
    public List<PokemonInstance> getParty() {
        return pokemons;
    }

    /**
     * Safely a new pokemon to the party.
     */
    public void addPokemon(PokemonInstance pokemon) {
        var ctx = new MovePokemonContext(pokemon, MovePokemonContext.Origin.NEW, getParty().size() >= 6 ? MovePokemonContext.Target.BOX_STORAGE : MovePokemonContext.Target.PARTY);
        DataEvents.MOVE_MON_TO_PARTY.getInvoker().accept(ctx);

        switch (ctx.target) {
            case PARTY -> getParty().add(ctx.pokemon);
            case BOX_STORAGE -> throw new RuntimeException("BOX_STORAGE is not Implemented");
        }

        sync();
    }

    public void sync() {
        if (owner instanceof ServerPlayer serverPlayer)
            PokeCraftNetworking.getInstance().sendPacket(new S2CSyncParty(this), serverPlayer);
    }

    /**
     * If the owner of this party is a {@link ServerPlayer}, it will return them. If they are not, then a {@link RuntimeException} will be thrown
     */
    public ServerPlayer getServerPlayer() {
        if (owner instanceof ServerPlayer serverPlayer) return serverPlayer;
        throw new RuntimeException("Party is not owned by a ServerPlayer");
    }

    /**
     * If the owner of this party is a {@link Player}, it will return them. If they are not, then a {@link RuntimeException} will be thrown
     */
    public Player getPlayer() {
        if (owner instanceof Player player) return player;
        throw new RuntimeException("Party is not owned by a ServerPlayer");
    }

    /**
     * Returns the owner of the party.
     */
    public LivingEntity getOwner() {
        return owner;
    }

    public CompoundTag saveAdditionalData(CompoundTag tag) {
        var party = new CompoundTag();
        party.putInt("size", pokemons.size());
        for (int i = 0; i < pokemons.size(); i++) party.put("slot" + i, pokemons.get(i).serializeToNbt());
        tag.put("party", party);
        return party;
    }

    public static PokemonParty readAdditionalData(CompoundTag tag, LivingEntity owner) {
        var party = new PokemonParty(owner);
        var size = tag.getInt("size");
        for (int i = 0; i < size; i++) {
            var pokemonNbt = tag.get("slot" + i);
            var decodeResult = PokemonInstance.CODEC.decode(NbtOps.INSTANCE, pokemonNbt).resultOrPartial(PokeCraft.LOGGER::error);
            decodeResult.ifPresentOrElse(
                    pair -> party.getParty().add(pair.getFirst()),
                    () -> PokeCraft.LOGGER.error("PokemonInstance in the party of " + owner + " is corrupt. Pokemon will be missing :(")
            );
        }

        return party;
    }

    public static PokemonParty ofPlayer(ServerPlayer player) {
        if (PLAYER_PARTY_CACHE.containsKey(player)) return PLAYER_PARTY_CACHE.get(player);
        return new PokemonParty(player);
    }
}
