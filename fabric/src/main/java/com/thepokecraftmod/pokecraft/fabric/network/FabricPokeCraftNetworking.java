package com.thepokecraftmod.pokecraft.fabric.network;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.pokecraft.network.PokeCraftNetworking;
import com.thepokecraftmod.pokecraft.network.packets.GenericPacket;
import com.thepokecraftmod.pokecraft.network.packets.c2s.C2SPacket;
import com.thepokecraftmod.pokecraft.network.packets.s2c.S2CPacket;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.network.ServerGamePacketListenerImpl;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class FabricPokeCraftNetworking extends PokeCraftNetworking {

    public FabricPokeCraftNetworking() {
        ServerPlayNetworking.registerGlobalReceiver(ID, this::handleServer);
    }

    private void handleServer(MinecraftServer server, ServerPlayer playerSender, ServerGamePacketListenerImpl listener, FriendlyByteBuf buf, PacketSender channelOrigin) {
        var id = buf.readUtf();
        var packetFactory = PACKETS.get(id);
        if (packetFactory == null)
            throw new RuntimeException("Unregistered packet " + id + ". Is it going the right direction?");

        try {
            var packet = packetFactory.apply(buf);

            server.execute(() -> {
                try {
                    if (packet instanceof S2CPacket)
                        throw new RuntimeException("Packet Going Wrong Direction. Server was trying to handle " + packet);
                    if (packet instanceof C2SPacket c2SPacket) c2SPacket.process(playerSender);
                } catch (Throwable e) {
                    LOGGER.error("Exception thrown when handling packet");
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            LOGGER.error("Exception caught while handling " + packetFactory.getClass().getSimpleName());
            e.printStackTrace();
        }
    }

    @Environment(EnvType.CLIENT)
    public void handleClient(Minecraft client, FriendlyByteBuf buf) {
        var id = buf.readUtf();
        var packetFactory = PACKETS.get(id);
        if (packetFactory == null)
            throw new RuntimeException("Unregistered packet " + id + ". Is it going the right direction?");

        try {
            var packet = packetFactory.apply(buf);

            client.execute(() -> {
                try {
                    if (packet instanceof S2CPacket s2cPacket) s2cPacket.process();
                    if (packet instanceof C2SPacket)
                        throw new RuntimeException("Packet Going Wrong Direction. Client was trying to handle " + packet);
                } catch (Throwable e) {
                    LOGGER.error("Exception thrown when handling packetFactory");
                    e.printStackTrace();
                }
            });
        } catch (Exception e) {
            LOGGER.error("Exception caught while handling " + packetFactory.getClass().getSimpleName());
            e.printStackTrace();
        }
    }

    public FriendlyByteBuf encodePacket(GenericPacket packet) {
        var buf = PacketByteBufs.create();
        buf.writeUtf(packet.getClass().getName());
        packet.encode(buf);
        return buf;
    }

    @Override
    public void sendPacket(S2CPacket packet, ServerPlayer player) {
        ServerPlayNetworking.send(player, ID, encodePacket(packet));
    }

    @Override
    public void sendPacket(S2CPacket packet, Participant<Player> player) {
        ServerPlayNetworking.send((ServerPlayer) player.getHolder(), ID, encodePacket(packet));
    }

    @Override
    public void sendPacket(C2SPacket packet) {
        ClientPlayNetworking.send(ID, encodePacket(packet));
    }

    @Override
    public void sendToAllTracking(S2CPacket packet, LivingEntity trackedEntity) {
        throw new RuntimeException("Unimplemented"); // FIXME :( unsure of fabric version
    }
}
