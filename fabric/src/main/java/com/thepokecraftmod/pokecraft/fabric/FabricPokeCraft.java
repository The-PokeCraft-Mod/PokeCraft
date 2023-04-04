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
import com.thepokecraftmod.unimon.UniMon;
import com.thepokecraftmod.unimon.fabric.FabricUniMon;
import com.thepokecraftmod.unimon.fabric.network.FabricUniMonNetworking;
import com.thepokecraftmod.unimon.network.UniMonNetworking;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.impl.datagen.FabricDataGenHelper;
import net.fabricmc.loader.api.FabricLoader;

public class FabricPokeCraft extends PokeCraft implements ModInitializer {

    public FabricPokeCraft() {
        FabricUniMon.onInitialize(FabricLoader.getInstance().isDevelopmentEnvironment());
        PokeCraft.onInitialize(this);
    }

    @Override
    public void onInitialize() {
        initializeNetworking();
        initializeRegistries();
    }
}
