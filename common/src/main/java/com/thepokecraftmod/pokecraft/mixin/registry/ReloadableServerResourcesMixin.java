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
