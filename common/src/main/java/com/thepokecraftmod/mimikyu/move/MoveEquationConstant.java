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
