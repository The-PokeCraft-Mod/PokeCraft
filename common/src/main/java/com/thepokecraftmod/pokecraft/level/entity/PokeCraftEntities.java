/*
 * Copyright (C) 2023 ThePokeCraftMod
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

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
