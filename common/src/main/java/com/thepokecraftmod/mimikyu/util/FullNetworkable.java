package com.thepokecraftmod.mimikyu.util;

import net.minecraft.network.FriendlyByteBuf;

/**
 * Used to sync every part of an object. Used in implementations to send initial stuff to clients or just objects which the client has no idea about yet.
 */
public interface FullNetworkable {

    void writeAsFullObject(FriendlyByteBuf buffer);
}
