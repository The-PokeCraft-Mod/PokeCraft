package com.thepokecraftmod.mimikyu.state;

public abstract class SimpleStateChange<T, V> implements StateChange<T, V> {

    private final Type type;
    protected final T target;
    protected final V value;

    public SimpleStateChange(Type type, T target, V value) {
        this.type = type;
        this.target = target;
        this.value = value;
    }

    @Override
    public Type getType() {
        return type;
    }

    @Override
    public T getTarget() {
        return target;
    }

    @Override
    public V getValue() {
        return value;
    }
}
