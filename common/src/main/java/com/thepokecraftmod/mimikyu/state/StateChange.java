package com.thepokecraftmod.mimikyu.state;

public interface StateChange<T, V> {

    T getTarget();

    V getValue();

    void handle();

    Type getType();

    enum Type {
        NO_OP,
        FIELD,
        STATUS_CONDITION,
        TERRAIN,
        WEATHER,
        ACCURACY,
        EVASIVENESS,
        SPEED,
        MAX_HP,
        HP,
        ATTACK,
        DEFENCE,
        SPECIAL_ATTACK,
        SPECIAL_DEFENCE
    }
}
