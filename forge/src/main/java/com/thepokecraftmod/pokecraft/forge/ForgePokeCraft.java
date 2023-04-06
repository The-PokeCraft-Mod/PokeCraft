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

package com.thepokecraftmod.pokecraft.forge;

import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.api.event.SetupEvents;
import com.thepokecraftmod.pokecraft.api.registry.MojangRegistry;
import com.thepokecraftmod.pokecraft.forge.client.ForgePokeCraftClient;
import com.thepokecraftmod.pokecraft.forge.level.item.tab.ForgeTabHandler;
import com.thepokecraftmod.pokecraft.forge.network.ForgePokeCraftNetworking;
import com.thepokecraftmod.pokecraft.level.item.tab.CreativeTab;
import com.thepokecraftmod.pokecraft.network.PokeCraftNetworking;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.RegisterEvent;

import java.util.function.Supplier;

@Mod(PokeCraft.MOD_ID)
public class ForgePokeCraft extends PokeCraft {

    public ForgePokeCraft() {
        var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        PokeCraft.onInitialize(this, !FMLEnvironment.production);
        PokeCraftNetworking.onInitialize(new ForgePokeCraftNetworking());
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> new ForgePokeCraftClient(eventBus));

        eventBus.addListener(this::registerRegistries);
        eventBus.addListener(this::registerEntityAttribs);
        ForgeTabHandler.onInitialize(eventBus);
        MinecraftForge.EVENT_BUS.addListener(this::registerCommands);
    }

    private void registerCommands(RegisterCommandsEvent event) {
        SetupEvents.REGISTER_COMMANDS.getInvoker().accept(event.getDispatcher());
    }

    private void registerEntityAttribs(EntityAttributeCreationEvent event) {
        initializeEntityAttribs((type, builder) -> event.put(type, builder
                .add(ForgeMod.ENTITY_GRAVITY.get())
                .add(ForgeMod.NAMETAG_DISTANCE.get())
                .add(ForgeMod.SWIM_SPEED.get())
                .build()));
    }

    private void registerRegistries(RegisterEvent event) {
        initializeRegistries();

        MojangRegistry.allRegistries(registry -> event.register(registry.registryKey, helper -> {
            for (var entry : registry)
                helper.register(entry.getKey(), entry.getValue());
        }));
    }

    @Override
    public <T> MojangRegistry<T, Registry<T>> newRegistry(ResourceKey<Registry<T>> registryKey) {
        return new MojangRegistry<>(registryKey);
    }

    @Override
    public CreativeTab newCreativeTab(String name, Supplier<Item> icon) {
        var tab = new CreativeTab(name, icon);
        ForgeTabHandler.register(tab);
        return tab;
    }
}
