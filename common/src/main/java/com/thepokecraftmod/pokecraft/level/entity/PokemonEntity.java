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

/**
 * A pokemon. Generic name for a reason I think you can guess.
 */
public class PokemonEntity extends PathfinderMob {
    public static final EntityDataAccessor<PokemonInstance> DATA = SynchedEntityData.defineId(PokemonEntity.class, PokeCraftEntityDataSerializers.POKEMON_INSTANCE);
    private static final String DATA_NBT = "PokemonData";

    protected PokemonEntity(EntityType<? extends PathfinderMob> type, Level level) {
        super(type, level);
    }

    @Override
    protected void defineSynchedData() {
        super.defineSynchedData();
        getEntityData().define(DATA, new PokemonInstance());
    }

    @Override
    public void addAdditionalSaveData(CompoundTag tag) {
        super.addAdditionalSaveData(tag);
        tag.put(DATA_NBT, getEntityData().get(DATA).serializeToNbt());
    }

    @Override
    public void readAdditionalSaveData(CompoundTag tag) {
        super.readAdditionalSaveData(tag);
        PokemonInstance.CODEC.decode(NbtOps.INSTANCE, tag.get(DATA_NBT));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MAX_HEALTH, 10.0).add(Attributes.MOVEMENT_SPEED, 0.20000000298023224);
    }
}
