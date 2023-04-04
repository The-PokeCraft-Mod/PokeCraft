package com.thepokecraftmod.mimikyu.action;

import com.thepokecraftmod.mimikyu.action.actions.BattleAction;
import com.thepokecraftmod.mimikyu.participant.Participant;
import com.thepokecraftmod.mimikyu.state.StateChange;
import com.thepokecraftmod.mimikyu.state.ContextualizedStateChange;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * A personalised version of {@link ActionResult} which has different messages depending on the person receiving it. {@link StateChange}'s <b>CANNOT</b> be different per participant
 */
public class PersonalActionResult extends ActionResult {

    private Function<Participant<?>, String> suppliedHeader;
    private final List<Function<Participant<?>, ContextualizedStateChange>> suppliedChanges = new ArrayList<>();
    private Function<Participant<?>, String> suppliedExtraData;

    public PersonalActionResult(BattleAction action) {
        super(action);
    }

    public void pushStateChange(Function<Participant<?>, ContextualizedStateChange> change) {
        this.suppliedChanges.add(change);
    }

    public void setHeading(Function<Participant<?>, String> message) {
        this.suppliedHeader = message;
    }

    @Override
    public String getHeading(Participant<?> sendingTo) {
        return suppliedHeader.apply(sendingTo);
    }

    public void setExtraData(Function<Participant<?>, String> suppliedExtraData) {
        this.suppliedExtraData = suppliedExtraData;
    }

    @Override
    public String getExtraData(Participant<?> sendingTo) {
        return suppliedExtraData == null ? null : suppliedExtraData.apply(sendingTo);
    }

    @Override
    public List<ContextualizedStateChange> getStateChanges(Participant<?> sendingTo) {
        return suppliedChanges.stream()
                .map(func -> func.apply(sendingTo))
                .toList();
    }

    @Override
    public boolean shouldSendToClient() {
        return suppliedChanges.size() > 0 || suppliedHeader != null;
    }
}
