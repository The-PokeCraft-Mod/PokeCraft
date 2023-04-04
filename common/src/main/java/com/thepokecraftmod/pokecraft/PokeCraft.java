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

import com.thepokecraftmod.pokecraft.api.registry.builtin.PokeCraftRegistries;
import com.thepokecraftmod.pokecraft.level.block.PokeCraftBlocks;
import com.thepokecraftmod.pokecraft.level.item.PokeCraftItems;
import com.thepokecraftmod.pokecraft.network.PokeCraftNetworking;
import net.minecraft.resources.ResourceLocation;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PokeCraft {
    public static final Logger LOGGER = LogManager.getLogger("PokeCraft");
    public static final String MOD_ID = "pokecraft";
    private static PokeCraft INSTANCE;

    private void onInitialize() {
        PokeCraftRegistries.onInitialize();
    }

    protected void initializeNetworking() {
        PokeCraftNetworking.onInitialize();
    }

    protected void initializeRegistries() {
        PokeCraftBlocks.onInitialize();
        PokeCraftItems.onInitialize();
    }

    public static PokeCraft getInstance() {
        if (INSTANCE == null)
            throw new RuntimeException("Platform has not defined UniMon instance. Maybe you are too early?");

        return INSTANCE;
    }

    public static void onInitialize(PokeCraft platformUniMon) {
        if (INSTANCE != null) throw new RuntimeException("Another platform has already been defined");
        INSTANCE = platformUniMon;
        INSTANCE.onInitialize();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
