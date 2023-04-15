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

import com.thepokecraftmod.pokecraft.api.registry.DynamicLazySyncingRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.packs.resources.PreparableReloadListener;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.tags.TagLoader;
import net.minecraft.tags.TagManager;
import net.minecraft.util.profiling.ProfilerFiller;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.stream.Stream;

@Mixin(TagManager.class)
public class TagManagerMixin {

    @Shadow
    public static String getTagDir(ResourceKey<? extends Registry<?>> arg) {
        return null;
    }

    @Redirect(method = "reload", at = @At(value = "INVOKE", target = "Ljava/util/stream/Stream;toList()Ljava/util/List;"))
    private List<?> POKECRAFT$makeMutableList(Stream<?> stream) {
        return new ArrayList<>(stream.toList());
    }

    @Inject(method = "reload", at = @At(value = "INVOKE", target = "Ljava/util/concurrent/CompletableFuture;allOf([Ljava/util/concurrent/CompletableFuture;)Ljava/util/concurrent/CompletableFuture;", shift = At.Shift.BEFORE), locals = LocalCapture.CAPTURE_FAILEXCEPTION)
    private void POKECRAFT$reloadCustomRegistries(PreparableReloadListener.PreparationBarrier preparationBarrier, ResourceManager resourceManager, ProfilerFiller preparationsProfiler, ProfilerFiller reloadProfiler, Executor backgroundExecutor, Executor gameExecutor, CallbackInfoReturnable<CompletableFuture> cir, List list) {
        for (var registry : DynamicLazySyncingRegistry.REGISTRY_MAP.values())
            list.add(createPokeCraftTagLoader(resourceManager, backgroundExecutor, registry));
    }

    private <T> CompletableFuture<TagManager.LoadResult<T>> createPokeCraftTagLoader(ResourceManager resourceManager, Executor backgroundExecutor, DynamicLazySyncingRegistry<T> registry) {
        var tagloader = new TagLoader<>((id) -> Optional.ofNullable(registry.getHolder(id)), getTagDir(registry.registryKey()));
        return CompletableFuture.supplyAsync(() -> new TagManager.LoadResult<>(registry.registryKey(), tagloader.loadAndBuild(resourceManager)), backgroundExecutor);
    }
}
