package com.github.imthenico.eventbus.listener;

import org.jetbrains.annotations.NotNull;

public interface EventHandler<E> {
    void handleEvent(@NotNull final E event) throws Throwable;
}
