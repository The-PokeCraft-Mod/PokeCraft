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

package com.thepokecraftmod.pokecraft.mixin.client.icon;

import com.thepokecraftmod.pokecraft.PokeCraft;
import net.minecraft.client.Minecraft;
import net.minecraft.server.packs.resources.IoSupplier;
import net.minecraft.server.packs.resources.ReloadableResourceManager;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.io.InputStream;
import java.util.Objects;

@Mixin(Minecraft.class)
public class MinecraftMixin {

    @Shadow
    @Final
    private ReloadableResourceManager resourceManager;

    @Inject(method = "getIconFile", at = @At("HEAD"), cancellable = true)
    private void pokecraft$useIconLogo(String[] strings, CallbackInfoReturnable<IoSupplier<InputStream>> cir) {
        if (strings[0].equals("icons")) {
            var vanillaIcon = strings[1];

            switch (vanillaIcon) {
                case "icon_16x16.png" -> cir.setReturnValue(() -> Objects.requireNonNull(PokeCraft.class.getResourceAsStream("/assets/pokecraft/textures/window/icon16.png")));
                case "icon_32x32.png" -> cir.setReturnValue(() -> Objects.requireNonNull(PokeCraft.class.getResourceAsStream("/assets/pokecraft/textures/window/icon32.png")));
            }
        }
    }
}
