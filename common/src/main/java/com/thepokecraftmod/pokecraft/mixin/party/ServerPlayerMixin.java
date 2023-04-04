package com.thepokecraftmod.pokecraft.mixin.party;

import com.thepokecraftmod.pokecraft.api.mon.PokemonParty;
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
