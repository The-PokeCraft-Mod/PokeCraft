package com.thepokecraftmod.pokecraft.forge.network;

import com.thepokecraftmod.pokecraft.network.packets.GenericPacket;

public record PacketInfo(String packetClassName, GenericPacket packet) {}
