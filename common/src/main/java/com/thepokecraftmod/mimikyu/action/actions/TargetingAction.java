package com.thepokecraftmod.mimikyu.action.actions;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.Battle;
import com.thepokecraftmod.mimikyu.action.ActionResult;
import com.thepokecraftmod.mimikyu.action.SortPosition;
import org.jetbrains.annotations.Nullable;

/**
 * Anything which can happen during a turn
 */
public class TargetingAction extends BattleAction {

    protected final ActionTarget target;

    public TargetingAction(SortPosition sortingPosition, Participant<?> sender, ActionTarget target, TargetingRunMethod action) {
        super(sortingPosition, sender, action);
        this.target = target;
    }

    public ActionResult execute(Battle battle, @Nullable String defaultEffect) {
        var result = new ActionResult(this);
        ((TargetingRunMethod) this.action).execute(result, battle, sender, target);
        return result;
    }

    @FunctionalInterface
    public interface TargetingRunMethod extends RunMethod {
        @Override
        default void execute(ActionResult result, Battle battle, Participant<?> sender) {
            throw new RuntimeException("Tried Executing without Target on TargetingRunMethod");
        }

        void execute(ActionResult result, Battle battle, Participant<?> sender, ActionTarget target);
    }
}
