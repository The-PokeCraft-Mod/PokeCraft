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
import com.thepokecraftmod.pokecraft.forge.client.ForgePokeCraftClient;
import com.thepokecraftmod.unimon.platform.PlatformRegistry;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.RegisterEvent;

@Mod(PokeCraft.MOD_ID)
public class ForgePokeCraft extends PokeCraft {

    public ForgePokeCraft() {
        var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        PokeCraft.onInitialize(this);
        initializeNetworking();
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> new ForgePokeCraftClient(eventBus));

        eventBus.addListener(this::registerRegistries);
    }

    private void registerRegistries(RegisterEvent event) {
        initializeRegistries();

        PlatformRegistry.allRegistries(registry -> event.register(registry.registryKey, helper -> {
            for (var entry : registry)
                helper.register(entry.getKey(), entry.getValue());
        }));
    }
}
