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

package com.thepokecraftmod.pokecraft.mixin.party;

import com.thepokecraftmod.pokecraft.api.pokemon.PokemonParty;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerPlayer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ServerPlayer.class)
public class ServerPlayerMixin {

    @Inject(method = "readAdditionalSaveData", at = @At("TAIL"))
    private void unimon$readParty(CompoundTag tag, CallbackInfo ci) {
        if (tag.contains("party")) PokemonParty.readAdditionalData(tag.getCompound("party"), (ServerPlayer) (Object) this);
        else new PokemonParty((ServerPlayer) (Object) this);
    }

    @Inject(method = "addAdditionalSaveData", at = @At("TAIL"))
    private void unimon$writeParty(CompoundTag tag, CallbackInfo ci) {
        PokemonParty.ofPlayer((ServerPlayer) (Object) this).saveAdditionalData(tag);
    }
}
