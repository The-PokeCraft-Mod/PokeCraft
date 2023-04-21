package com.thepokecraftmod.pokecraft.fabric.mixin.datagen;

import com.thepokecraftmod.pokecraft.PokeCraft;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.world.level.block.Block;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(BlockModelGenerators.BlockFamilyProvider.class)
public class BlockModelGenerators$BlockFamilyProviderMixin {

    @Inject(method = "fullBlock", at = @At("HEAD"), cancellable = true)
    private void dontUseOnPokeCraft(Block block, ModelTemplate modelTemplate, CallbackInfoReturnable<BlockModelGenerators.BlockFamilyProvider> cir) {
        if(BuiltInRegistries.BLOCK.getKey(block).getNamespace().equals(PokeCraft.MOD_ID)) cir.setReturnValue((BlockModelGenerators.BlockFamilyProvider) (Object) this);
    }
}
