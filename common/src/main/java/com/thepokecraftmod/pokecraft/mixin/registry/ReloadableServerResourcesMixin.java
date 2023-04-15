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

package com.thepokecraftmod.pokecraft.mixin.registry;

import com.thepokecraftmod.pokecraft.api.event.RegistryEvents;
import com.thepokecraftmod.pokecraft.api.registry.DynamicLazySyncingRegistry;
import net.minecraft.core.RegistryAccess;
import net.minecraft.server.ReloadableServerResources;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.tags.TagKey;
import net.minecraft.tags.TagManager;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Mixin(ReloadableServerResources.class)
public class ReloadableServerResourcesMixin {

    @Redirect(method = "loadResources", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/ReloadableServerResources;listeners()Ljava/util/List;"))
    private static List<PreparableReloadListener> pokecraft$injectRegistryReloaders(ReloadableServerResources instance) {
        var listeners = new ArrayList<>(instance.listeners());
        RegistryEvents.ADD_RESOURCE_RELOADERS.getInvoker().accept(listeners);
        return listeners;
    }

    @Inject(method = "updateRegistryTags(Lnet/minecraft/core/RegistryAccess;Lnet/minecraft/tags/TagManager$LoadResult;)V" , at = @At("HEAD"), cancellable = true)
    private static <T> void pokecraft$redirectCustomLoading(RegistryAccess registryAccess, TagManager.LoadResult<T> loadResult, CallbackInfo ci) {
        var resourcekey = loadResult.key();

        if (DynamicLazySyncingRegistry.REGISTRY_MAP.containsKey(resourcekey)) {
            ci.cancel();
            var map = loadResult.tags().entrySet().stream().collect(Collectors.toUnmodifiableMap((entry) -> TagKey.create(resourcekey, entry.getKey()), (entry) -> List.copyOf(entry.getValue())));
            DynamicLazySyncingRegistry.REGISTRY_MAP.get(resourcekey).bindTags(map);
        }
    }
}
