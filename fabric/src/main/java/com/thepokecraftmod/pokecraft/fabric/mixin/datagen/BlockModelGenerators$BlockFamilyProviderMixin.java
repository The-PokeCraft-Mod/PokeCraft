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
