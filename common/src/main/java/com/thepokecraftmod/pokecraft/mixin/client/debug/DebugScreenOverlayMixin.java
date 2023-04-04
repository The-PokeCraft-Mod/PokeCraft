package com.thepokecraftmod.pokecraft.mixin.client.debug;

import com.google.common.collect.Lists;
import com.thepokecraftmod.pokecraft.client.PokeCraftClient;
import net.minecraft.client.gui.components.DebugScreenOverlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import java.util.ArrayList;

@Mixin(DebugScreenOverlay.class)
public class DebugScreenOverlayMixin {

    @Redirect(method = "getSystemInformation", at = @At(value = "INVOKE", target = "Lcom/google/common/collect/Lists;newArrayList([Ljava/lang/Object;)Ljava/util/ArrayList;"))
    private ArrayList<String> unimod$printSyncDebugInfo(Object[] elements) {
        var list = Lists.newArrayList((String[]) elements);
        list.add("");
        PokeCraftClient.populateDebugData(list);
        return list;
    }
}
