package com.thepokecraftmod.forge;

import com.thepokecraftmod.PokeCraft;
import net.minecraftforge.fml.common.Mod;

@Mod(PokeCraft.MOD_ID)
public class ForgePokeCraft extends PokeCraft {

    public ForgePokeCraft() {
        PokeCraft.onInitialize(this);
    }
}
