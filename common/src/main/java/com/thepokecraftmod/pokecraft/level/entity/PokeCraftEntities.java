package com.thepokecraftmod.pokecraft.level.entity;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;

import java.util.function.BiConsumer;

public class PokeCraftEntities {
    private static final MojangRegistry<EntityType<?>, Registry<EntityType<?>>> REGISTRY = PokeCraft.getInstance().newRegistry(Registries.ENTITY_TYPE);
    public static final ResourceLocation POKEMON_ID = PokeCraft.id("pokemon");
    public static final EntityType<PokemonEntity> POKEMON = REGISTRY.register(
            POKEMON_ID.getPath(),
            EntityType.Builder.of(PokemonEntity::new, MobCategory.CREATURE).build(POKEMON_ID.toString())
    );

    public static void onInitializeConsumers(BiConsumer<EntityType<? extends LivingEntity>, AttributeSupplier.Builder> consumer) {
        consumer.accept(POKEMON, PokemonEntity.createAttributes());
    }

    public static void onInitialize() {
    }
}
