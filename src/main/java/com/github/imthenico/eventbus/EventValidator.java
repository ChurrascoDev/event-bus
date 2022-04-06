package com.github.imthenico.eventbus;

public interface EventValidator<E> {
    Throwable validate(final E event) throws Throwable;
}
