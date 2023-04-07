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
                case "icon_16x16.png" -> cir.setReturnValue(() -> Objects.requireNonNull(Minecraft.class.getResourceAsStream("/assets/pokecraft/textures/window/icon16.png")));
                case "icon_32x32.png" -> cir.setReturnValue(() -> Objects.requireNonNull(Minecraft.class.getResourceAsStream("/assets/pokecraft/textures/window/icon32.png")));
            }
        }
    }
}
