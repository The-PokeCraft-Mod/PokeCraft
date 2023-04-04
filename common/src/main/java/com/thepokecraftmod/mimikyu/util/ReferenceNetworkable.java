package com.thepokecraftmod.mimikyu.util;

import net.minecraft.network.FriendlyByteBuf;

/**
 * If the objects have already been synced, this version of {@link FullNetworkable} can be used to write a uuid or some other identifying value instead of syncing the entire object
 */
public interface ReferenceNetworkable {

    void writeAsReference(FriendlyByteBuf buffer);
}
