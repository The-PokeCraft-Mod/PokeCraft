/*
 * Copyright (C) 2023 ThePokeCraftMod
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

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