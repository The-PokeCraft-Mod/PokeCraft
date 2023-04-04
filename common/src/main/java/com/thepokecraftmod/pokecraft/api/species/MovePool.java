package com.thepokecraftmod.pokecraft.api.species;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.resources.ResourceLocation;

import java.util.List;
import java.util.Map;

public record MovePool(
        Map<String, List<ResourceLocation>> levelMoves,
        List<ResourceLocation> discMoves,
        List<ResourceLocation> eggMoves,
        Map<ResourceLocation, List<ResourceLocation>> npcMoves
) {
    public static final Codec<MovePool> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.unboundedMap(Codec.STRING, ResourceLocation.CODEC.listOf()).fieldOf("levelMoves").forGetter(MovePool::levelMoves),
            ResourceLocation.CODEC.listOf().fieldOf("discMoves").forGetter(MovePool::discMoves),
            ResourceLocation.CODEC.listOf().fieldOf("eggMoves").forGetter(MovePool::eggMoves),
            Codec.unboundedMap(ResourceLocation.CODEC, ResourceLocation.CODEC.listOf()).fieldOf("npcMoves").forGetter(MovePool::npcMoves)
    ).apply(instance, MovePool::new));
}
