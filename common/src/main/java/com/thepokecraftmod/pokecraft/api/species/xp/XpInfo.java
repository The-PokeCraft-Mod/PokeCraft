package com.thepokecraftmod.pokecraft.api.species.xp;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import com.thepokecraftmod.pokecraft.api.ExtraCodecs;

public class XpInfo {
    public static final Codec<XpInfo> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.INT.fieldOf("baseAmount").forGetter(XpInfo::getBaseAmount),
            ExtraCodecs.enumCodec(GainSpeed.class).fieldOf("gainSpeed").forGetter(XpInfo::getGainSpeed)
    ).apply(instance, XpInfo::new));
    private int baseAmount;
    private GainSpeed gainSpeed;

    public XpInfo(int baseAmount, GainSpeed gainSpeed) {
        this.baseAmount = baseAmount;
        this.gainSpeed = gainSpeed;
    }

    public int getBaseAmount() {
        return baseAmount;
    }

    public GainSpeed getGainSpeed() {
        return gainSpeed;
    }
}
