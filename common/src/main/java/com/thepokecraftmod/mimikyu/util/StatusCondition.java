package com.thepokecraftmod.mimikyu.util;

import net.minecraft.network.FriendlyByteBuf;

public enum StatusCondition implements FullNetworkable, ReferenceNetworkable {
    BURNED, FROZEN, PARALYZED, POISONED, BADLY_POISONED, ASLEEP;

    @Override
    public void writeAsFullObject(FriendlyByteBuf buffer) {
        writeAsReference(buffer);
    }

    @Override
    public void writeAsReference(FriendlyByteBuf buffer) {
        buffer.writeEnum(this);
    }
}
