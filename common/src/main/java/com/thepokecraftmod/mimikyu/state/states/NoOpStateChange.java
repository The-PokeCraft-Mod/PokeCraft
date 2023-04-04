package com.thepokecraftmod.mimikyu.state.states;

import com.thepokecraftmod.mimikyu.state.StateChange;

public class NoOpStateChange implements StateChange<Object, Object> {

    @Override
    public Object getTarget() {
        return null;
    }

    @Override
    public Object getValue() {
        return null;
    }

    @Override
    public void handle() {

    }

    @Override
    public Type getType() {
        return Type.NO_OP;
    }
}
