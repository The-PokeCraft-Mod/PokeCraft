package com.thepokecraftmod.mimikyu.field;

import com.thepokecraftmod.mimikyu.util.FullNetworkable;
import com.thepokecraftmod.mimikyu.util.ReferenceNetworkable;
import net.minecraft.network.FriendlyByteBuf;

public enum Terrain implements ReferenceNetworkable, FullNetworkable {
    ELECTRIC, GRASSY, MISTY, PSYCHIC;

    @Override
    public void writeAsFullObject(FriendlyByteBuf buffer) {
        writeAsReference(buffer);
    }

    @Override
    public void writeAsReference(FriendlyByteBuf buffer) {
        buffer.writeEnum(this);
    }
}
