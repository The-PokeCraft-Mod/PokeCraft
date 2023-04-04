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

package com.thepokecraftmod.pokecraft.fabric;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.event.SetupEvents;
import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import com.thepokecraftmod.pokecraft.fabric.network.FabricPokeCraftNetworking;
import com.thepokecraftmod.pokecraft.fabric.registry.FabricMojangRegistry;
import com.thepokecraftmod.pokecraft.network.PokeCraftNetworking;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;

public class FabricPokeCraft extends PokeCraft implements ModInitializer {

    public FabricPokeCraft() {
        PokeCraft.onInitialize(this, FabricLoader.getInstance().isDevelopmentEnvironment());
        PokeCraftNetworking.onInitialize(new FabricPokeCraftNetworking());
    }

    @Override
    public void onInitialize() {
        initializeRegistries();
        initializeEntityAttribs(FabricDefaultAttributeRegistry::register);
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> SetupEvents.REGISTER_COMMANDS.getInvoker().accept(dispatcher));
    }

    @Override
    public <T> MojangRegistry<T, Registry<T>> newRegistry(ResourceKey<Registry<T>> registryKey) {
        return new FabricMojangRegistry<>(registryKey);
    }
}
