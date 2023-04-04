package com.thepokecraftmod.pokecraft.mixin.client.sync;

import com.thepokecraftmod.pokecraft.network.PokeCraftNetworking;
import com.thepokecraftmod.pokecraft.network.packets.c2s.C2SRequestInitialSync;
import net.minecraft.client.multiplayer.ClientPacketListener;
import net.minecraft.network.protocol.game.ClientboundLoginPacket;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPacketListener.class)
public class ClientPacketListenerMixin {

    @Inject(method = "handleLogin", at = @At("TAIL"))
    private void unimon$requestServerParty(ClientboundLoginPacket packet, CallbackInfo ci) {
        PokeCraftNetworking.getInstance().sendPacket(new C2SRequestInitialSync());
    }
}
