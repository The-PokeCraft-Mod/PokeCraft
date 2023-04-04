package com.thepokecraftmod.mimikyu.util;

@FunctionalInterface
public interface TriFunction<P1, P2, P3, R> {
    R apply(P1 object, P2 object2, P3 object3);
}
