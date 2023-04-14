package com.thepokecraftmod.pokecraft.network;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.network.packets.GenericPacket;
import com.thepokecraftmod.pokecraft.network.packets.c2s.C2SPacket;
import com.thepokecraftmod.pokecraft.network.packets.c2s.C2SRequestInitialSync;
import com.thepokecraftmod.pokecraft.network.packets.s2c.S2CPacket;
import com.thepokecraftmod.pokecraft.network.packets.s2c.S2CSyncParty;
import com.thepokecraftmod.pokecraft.network.packets.s2c.S2CSyncRegistry;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public abstract class PokeCraftNetworking {
    protected static final Logger LOGGER = LoggerFactory.getLogger("UniMon Networking");
    public static final ResourceLocation ID = PokeCraft.id("packets");
    private static PokeCraftNetworking INSTANCE;
    protected final Map<String, Function<FriendlyByteBuf, ? extends GenericPacket>> PACKETS = new HashMap<>();

    private static void onInitialize() {
        // Client 2 Server
        INSTANCE.registerPacket(C2SRequestInitialSync.class, C2SRequestInitialSync::new);
        
        // Server 2 Client
        INSTANCE.registerPacket(S2CSyncParty.class, S2CSyncParty::new);
        INSTANCE.registerPacket(S2CSyncRegistry.class, S2CSyncRegistry::new);
    }

    /**
     * Registers a packet. Needed if you plan to send a packet later on.
     * @param packetClass the class of the packet
     * @param packet the constructor taking a {@link FriendlyByteBuf} to decode the packet
     * @param <T> the packet's type
     */
    public <T extends GenericPacket> void registerPacket(Class<T> packetClass, Function<FriendlyByteBuf, T> packet) {
        PACKETS.put(packetClass.getName(), packet);
    }

    /**
     * Sends a S2C Packet (Server 2 Client)
     */
    public abstract void sendPacket(S2CPacket packet, ServerPlayer player);

    /**
     * Sends a S2C Packet (Server 2 Client)
     */
    public abstract void sendPacket(S2CPacket packet, Participant<Player> player);

    /**
     * Sends a S2C Packet (Server 2 Client) to all players tracking the entity
     */
    public abstract void sendToAllTracking(S2CPacket packet, LivingEntity trackedEntity);

    /**
     * Sends a C2S Packet (Client 2 Server)
     */
    public abstract void sendPacket(C2SPacket packet);

    public static PokeCraftNetworking getInstance() {
        if (INSTANCE == null)
            throw new RuntimeException("Platform has not defined UniMonNetworking instance. Maybe you are too early?");

        return INSTANCE;
    }

    public static void onInitialize(PokeCraftNetworking platformUniMon) {
        if (INSTANCE != null) throw new RuntimeException("Another platform has already been defined");
        INSTANCE = platformUniMon;
        onInitialize();
    }
}