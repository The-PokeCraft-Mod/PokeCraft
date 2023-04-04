package com.thepokecraftmod.mimikyu.field;

import com.thepokecraftmod.mimikyu.util.FullNetworkable;
import com.thepokecraftmod.mimikyu.util.ReferenceNetworkable;
import net.minecraft.network.FriendlyByteBuf;

public enum Weather implements ReferenceNetworkable, FullNetworkable {
    CLEAR_SKIES, HARSH_SUNLIGHT, EXTREMELY_HARSH_SUNLIGHT, RAIN, HEAVY_RAIN, SANDSTORM, HAIL, SHADOWY_AURA, FOG, STRONG_WINDS;

    @Override
    public void writeAsFullObject(FriendlyByteBuf buffer) {
        writeAsReference(buffer);
    }

    @Override
    public void writeAsReference(FriendlyByteBuf buffer) {
        buffer.writeEnum(this);
    }
}
