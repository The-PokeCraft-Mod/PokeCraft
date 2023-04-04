package com.thepokecraftmod.pokecraft.api.event;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;

/**
 * Base class for Event implementations.
 * <p>
 * Example Usage:<pre> {@code Event<Runnable> objectEvent = new Event<>(runnables -> () -> {
 * 	for (Runnable runnable : runnables) {
 * 		runnable.run();
 *     }
 * }, Runnable[]::new);
 * } </pre>
 */
public class Event<T> {
    final Function<T[], T> combiner;
    final IntFunction<T[]> create;
    T[] listeners;
    T listener;

    public Event(Function<T[], T> combiner, IntFunction<T[]> create) {
        this.combiner = combiner;
        this.create = create;
        this.listeners = create.apply(0);
        this.recompile();
    }

    public static <T> Consumer<T> consumerCallback(Consumer<T>[] listeners) {
        return (consumed) -> {
            for (var consumer : listeners)
                consumer.accept(consumed);
        };
    }

    public static <T, R> BiConsumer<T, R> biConsumerCallback(BiConsumer<T, R>[] listeners) {
        return (a, b) -> {
            for (var consumer : listeners)
                consumer.accept(a, b);
        };
    }

    void recompile() {
        this.listener = this.combiner.apply(this.listeners);
    }

    public void listen(T listener) {
        T[] old = this.listeners;
        T[] _new = this.listeners = Arrays.copyOf(old, old.length + 1);
        _new[old.length] = listener;
        this.recompile();
    }

    public T getInvoker() {
        return this.listener;
    }
}