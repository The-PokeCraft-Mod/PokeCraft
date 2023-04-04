package com.thepokecraftmod.mimikyu.util;

import com.thepokecraftmod.mimikyu.action.ActionResult;
import com.thepokecraftmod.mimikyu.action.Turn;
import com.thepokecraftmod.mimikyu.action.actions.ActionTarget;
import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.Battle;
import com.thepokecraftmod.mimikyu.move.MoveInstance;
import com.thepokecraftmod.mimikyu.move.equation.EquationHandler;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;

/**
 * Supplier with battle context.
 * @param <T> the type to return
 */
@FunctionalInterface
public interface MoveContext<T> {

    T supply(@Nullable Context ctx);

    record Context(Battle battle, Turn turn, ActionResult result, EquationHandler equationHandler, MoveInstance move, Participant<?> sender, ActionTarget targets, Participant<?> target) {

        public String getConstant(ResourceLocation id) {
            return equationHandler.getConstant(this, id);
        }

        public double randomPercentage(int from) {
            return battle.random.nextInt(from, 100) / 100d;
        }
    }
}
