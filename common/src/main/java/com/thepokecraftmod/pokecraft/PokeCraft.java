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

package com.thepokecraftmod.pokecraft;

import com.mojang.brigadier.CommandDispatcher;
import com.thepokecraftmod.mimikyu.Mimikyu;
import com.thepokecraftmod.pokecraft.api.event.SetupEvents;
import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import com.thepokecraftmod.pokecraft.api.registry.builtin.PokeCraftRegistries;
import com.thepokecraftmod.pokecraft.command.GivePokemonCommand;
import com.thepokecraftmod.pokecraft.command.SummonPokemonCommand;
import com.thepokecraftmod.pokecraft.level.block.PokeCraftBlocks;
import com.thepokecraftmod.pokecraft.level.entity.PokeCraftEntities;
import com.thepokecraftmod.pokecraft.level.entity.PokeCraftEntityDataSerializers;
import com.thepokecraftmod.pokecraft.level.item.PokeCraftItems;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;
import java.util.function.BiConsumer;

public abstract class PokeCraft {
    public static final Logger LOGGER = LogManager.getLogger("PokeCraft");
    public static final Random RANDOM = new Random();
    public static final String MOD_ID = "pokecraft";
    private static PokeCraft INSTANCE;
    private static boolean isDevEnv;

    private void onInitialize() {
        Mimikyu.onInitialize();
        PokeCraftEntityDataSerializers.onInitialize();
        SetupEvents.REGISTER_COMMANDS.listen(INSTANCE::registerCommands);
        PokeCraftRegistries.onInitialize();
    }

    protected void initializeRegistries() {
        PokeCraftEntities.onInitialize();
        PokeCraftItems.onInitialize();
        PokeCraftBlocks.onInitialize();
    }

    protected void initializeEntityAttribs(BiConsumer<EntityType<? extends LivingEntity>, AttributeSupplier.Builder> consumer) {
        PokeCraftEntities.onInitializeConsumers(consumer);
    }

    private void registerCommands(CommandDispatcher<CommandSourceStack> dispatcher) {
        dispatcher.register(SummonPokemonCommand.command());
        dispatcher.register(GivePokemonCommand.command());
    }

    /**
     * Creates a new abstracted registry.
     *
     * @param registryKey the key for the registry you are using
     */
    public abstract <T> MojangRegistry<T, Registry<T>> newRegistry(ResourceKey<Registry<T>> registryKey);

    public static PokeCraft getInstance() {
        if (INSTANCE == null)
            throw new RuntimeException("Platform has not defined PokeCraft instance. Maybe you are too early?");

        return INSTANCE;
    }

    public static void onInitialize(PokeCraft platformPokeCraft, boolean isDevEnv) {
        PokeCraft.isDevEnv = isDevEnv;
        if (INSTANCE != null) throw new RuntimeException("Another platform has already been defined");
        INSTANCE = platformPokeCraft;
        INSTANCE.onInitialize();
    }

    public static String translate(Component component) {
        return component.getString();
    }

    public static boolean isDevelopmentEnvironment() {
        return isDevEnv;
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
