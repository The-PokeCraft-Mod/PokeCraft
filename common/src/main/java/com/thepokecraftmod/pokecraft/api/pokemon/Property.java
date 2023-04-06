package com.thepokecraftmod.pokecraft.api.pokemon;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record Property(
        String property,
        String comparison,
        String value
) {
    public static final Codec<Property> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.STRING.fieldOf("property").forGetter(Property::property),
            Codec.STRING.fieldOf("comparison").forGetter(Property::comparison),
            Codec.STRING.fieldOf("value").forGetter(Property::value)
    ).apply(instance, Property::new));
}
