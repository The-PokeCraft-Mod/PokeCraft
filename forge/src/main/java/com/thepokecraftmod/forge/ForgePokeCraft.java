package com.thepokecraftmod.forge;

import com.thepokecraftmod.PokeCraft;
import com.thepokecraftmod.forge.client.ForgePokeCraftClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(PokeCraft.MOD_ID)
public class ForgePokeCraft extends PokeCraft {

    public ForgePokeCraft() {
        var eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        PokeCraft.onInitialize(this);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> new ForgePokeCraftClient(eventBus));
    }
}
