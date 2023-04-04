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
