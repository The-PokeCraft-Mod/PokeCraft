package com.thepokecraftmod.mimikyu.action.actions;

import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.Battle;
import com.thepokecraftmod.mimikyu.action.ActionResult;
import com.thepokecraftmod.mimikyu.action.SortPosition;
import org.jetbrains.annotations.Nullable;

import java.util.Collections;
import java.util.List;

public class BattleAction {

    public final SortPosition sortingPosition;
    public final Participant<?> sender;
    public final RunMethod action;

    public BattleAction(SortPosition sortingPosition, Participant<?> sender, RunMethod action) {
        this.sortingPosition = sortingPosition;
        this.sender = sender;
        this.action = action;
    }

    public ActionResult execute(Battle battle, @Nullable String defaultEffect) {
        var result = new ActionResult(this);
        this.action.execute(result, battle, sender);
        return result;
    }

    /**
     * Add actions which carry onto the next turn
     */
    public List<BattleAction> addCarryOnActions() {
        return Collections.emptyList();
    }

    @FunctionalInterface
    public interface RunMethod {
        void execute(ActionResult result, Battle battle, Participant<?> sender);
    }
}
