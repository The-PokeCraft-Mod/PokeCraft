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

import com.thepokecraftmod.pokecraft.api.pokemon.PokemonInstance;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtOps;
import net.minecraft.network.syncher.EntityDataAccessor;
import net.minecraft.network.syncher.SynchedEntityData;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.Level;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * A pokemon. Generic name for a reason I think you can guess.
 */
public class PokemonEntity extends PathfinderMob {
    public static final EntityDataAccessor<PokemonInstance> INSTANCE = SynchedEntityData.defineId(PokemonEntity.class, PokeCraftEntityDataSerializers.POKEMON_INSTANCE);

    public PokemonEntity(EntityType<? extends PathfinderMob> type, Level level) {
        super(type, level);
    }

    /**
     * Will write the instance back to the entity to ensure everything is synced ok. If you aren't doing anything complex
     * @param consumer supplies the {@link PokemonInstance} associated with this entity
     */
    public void safeModifyData(Consumer<PokemonInstance> consumer) {
        var instance = getEntityData().get(INSTANCE);
        consumer.accept(instance);
        getEntityData().set(INSTANCE, instance);
    }

    /**
     * Completely overwrites existing data about the instance on this entity
     */
    public void setInstance(PokemonInstance instance) {
        getEntityData().set(INSTANCE, instance);
    }

    /**
     * gets the {@link PokemonInstance} associated with this entity
     */
    public PokemonInstance getInstanceData() {
        return getEntityData().get(INSTANCE);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        getEntityData().define(INSTANCE, new PokemonInstance());
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.put("pokemonData", getEntityData().get(INSTANCE).serializeToNbt());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        PokemonInstance.CODEC.decode(NbtOps.INSTANCE, tag.get("pokemonData"));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0).add(Attributes.MOVEMENT_SPEED, 0.20000000298023224);
    }
}
