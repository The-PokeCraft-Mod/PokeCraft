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

package com.thepokecraftmod.forge;

import com.thepokecraftmod.PokeCraft;
import com.thepokecraftmod.forge.client.ForgePokeCraftClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PokeCraft.MOD_ID)
public class ForgePokeCraft extends PokeCraft {

    public ForgePokeCraft() {
        var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        PokeCraft.onInitialize(this);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> new ForgePokeCraftClient(eventBus));
    }
}
