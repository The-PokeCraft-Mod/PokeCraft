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

package com.thepokecraftmod.pokecraft.mixin.client.debug;

import com.google.common.collect.Lists;
import com.thepokecraftmod.pokecraft.PokeCraft;
import com.thepokecraftmod.pokecraft.client.PokeCraftClient;
import net.minecraft.SharedConstants;
import net.minecraft.client.gui.components.DebugScreenOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.ArrayList;

@Mixin(DebugScreenOverlay.class)
public class DebugScreenOverlayMixin {

    @Redirect(method = "getSystemInformation", at = @At(value = "INVOKE", target = "Lcom/google/common/collect/Lists;newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;"))
    private ArrayList<String> unimod$printSyncDebugInfo(Object[] elements) {
        if (PokeCraft.isDevelopmentEnvironment()) SharedConstants.IS_RUNNING_IN_IDE = true;
        var list = Lists.newArrayList((String[]) elements);
        list.add("");
        PokeCraftClient.populateDebugData(list);
        return list;
    }
}
