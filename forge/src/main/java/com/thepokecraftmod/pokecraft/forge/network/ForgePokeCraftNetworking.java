package com.thepokecraftmod.pokecraft.forge.network;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.network.PokeCraftNetworking;
import com.thepokecraftmod.pokecraft.network.packets.c2s.C2SPacket;
import com.thepokecraftmod.pokecraft.network.packets.s2c.S2CPacket;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.simple.SimpleChannel;

import java.util.Optional;
import java.util.function.Supplier;

/**
 * The final solution to the Network API Question. Don't think the external API can get any better than it currently is. Feel free to prove me wrong
 *
 * @author hydos
 * @version 0.2.1
 */
@SuppressWarnings("unchecked")
public class ForgePokeCraftNetworking extends PokeCraftNetworking {
    private static final String PROTOCOL_VERSION = "1";
    private static final SimpleChannel CHANNEL = NetworkRegistry.newSimpleChannel(ID, () -> PROTOCOL_VERSION, PROTOCOL_VERSION::equals, PROTOCOL_VERSION::equals);

    public ForgePokeCraftNetworking() {
        CHANNEL.registerMessage(1, PacketInfo.class, this::encode, this::decode, this::handle, Optional.empty());
    }

    private void encode(PacketInfo msg, FriendlyByteBuf byteBuf) {
        byteBuf.writeUtf(msg.packetClassName());
        msg.packet().encode(byteBuf);
    }

    private <MSG> MSG decode(FriendlyByteBuf buf) {
        var id = buf.readUtf();
        var packet = PACKETS.get(id);
        if (packet == null)
            throw new RuntimeException("Unregistered packet " + id + ". Is it going the right direction?");
        return (MSG) new PacketInfo(id, packet.apply(buf));
    }

    private void handle(PacketInfo msg, Supplier<NetworkEvent.Context> contextSupplier) {
        var packet = msg.packet();
        if (packet != null) {
            try {
                contextSupplier.get().enqueueWork(() -> {
                    try {
                        if (packet instanceof S2CPacket s2cPacket)
                            s2cPacket.process();
                        if (packet instanceof C2SPacket c2SPacket)
                            c2SPacket.process(contextSupplier.get().getSender());
                    } catch (Throwable e) {
                        LOGGER.error("Exception thrown when handling packet");
                        e.printStackTrace();
                    }
                });
                contextSupplier.get().setPacketHandled(true);
            } catch (Exception e) {
                LOGGER.error("Exception caught while handling " + packet.getClass().getSimpleName());
                e.printStackTrace();
            }
        } else PokeCraft.LOGGER.debug("Skipping Packet Processing due to null packet.");
    }

    /**
     * Sends a S2C Packet (Server 2 Client)
     */
    @Override
    public void sendPacket(S2CPacket packet, ServerPlayer player) {
        CHANNEL.send(PacketDistributor.PLAYER.with(() -> player), new PacketInfo(packet.getClass().getName(), packet));
    }

    /**
     * Sends a S2C Packet (Server 2 Client)
     */
    @Override
    public void sendPacket(S2CPacket packet, Participant<Player> player) {
        CHANNEL.send(PacketDistributor.PLAYER.with(() -> (ServerPlayer) player.getHolder()), new PacketInfo(packet.getClass().getName(), packet));
    }

    /**
     * Sends a S2C Packet (Server 2 Client) to all players tracking the entity
     */
    @Override
    public void sendToAllTracking(S2CPacket packet, LivingEntity trackedEntity) {
        CHANNEL.send(PacketDistributor.TRACKING_ENTITY.with(() -> trackedEntity), new PacketInfo(packet.getClass().getName(), packet));
    }

    /**
     * Sends a C2S Packet (Client 2 Server)
     */
    @Override
    public void sendPacket(C2SPacket packet) {
        CHANNEL.sendToServer(new PacketInfo(packet.getClass().getName(), packet));
    }
}
