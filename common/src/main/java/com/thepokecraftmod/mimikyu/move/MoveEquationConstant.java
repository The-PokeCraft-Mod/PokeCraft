package com.thepokecraftmod.mimikyu.move;

import com.thepokecraftmod.mimikyu.util.MoveContext;
import net.minecraft.resources.ResourceLocation;

public record MoveEquationConstant<T>(CanSupplySupplier canSupply, MoveContext<T> supplier) {

    public MoveEquationConstant(String match, MoveContext<T> supplier) {
        this(new ResourceLocation(match), supplier);
    }

    public MoveEquationConstant(ResourceLocation match, MoveContext<T> supplier) {
        this((ctx, id) -> id.equals(match), supplier);
    }

    boolean canSupply(MoveContext.Context ctx, ResourceLocation id) {
        return canSupply.supply(ctx, id);
    }

    @FunctionalInterface
    public interface CanSupplySupplier {

        boolean supply(MoveContext.Context ctx, ResourceLocation id);
    }
}
