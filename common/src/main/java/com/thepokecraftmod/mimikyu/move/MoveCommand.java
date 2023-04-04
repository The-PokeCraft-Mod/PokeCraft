package com.thepokecraftmod.mimikyu.move;

import com.thepokecraftmod.mimikyu.action.ActionResult;
import com.thepokecraftmod.mimikyu.action.Turn;
import com.thepokecraftmod.mimikyu.action.actions.ActionTarget;
import com.thepokecraftmod.mimikyu.move.equation.EquationHandler;
import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.util.MoveContext;
import com.thepokecraftmod.mimikyu.Battle;

/**
 * Allows moves to do things. This class is used to modify state of a battle such as changing weather, Damaging Pokemon, Changing Stats, etc.
 */
@FunctionalInterface
public interface MoveCommand {

    void execute(ExecutionContext ctx, Object[] args);

    record ExecutionContext(Battle battle, Turn turn, ActionResult result, MoveInstance move, Participant<?> sender, ActionTarget targets) {

        public MoveContext.Context convert(EquationHandler equationHandler, Participant<?> target) {
            return new MoveContext.Context(battle, turn, result, equationHandler, move, sender, targets, target);
        }
    }
}
