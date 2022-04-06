package com.github.imthenico.eventbus.key;

import java.util.UUID;
import java.util.Objects;

public class Key {
    private final String name;
    
    private Key(final String name) {
        Objects.requireNonNull(this.name = name);
    }
    
    public String getName() {
        return this.name;
    }
    
    public Key namespace(final String value) {
        Objects.requireNonNull(value);
        return new Key(this.name + ":" + value);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Key)) {
            return false;
        }
        final Key key = (Key)o;
        return this.name.equals(key.name);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(this.name);
    }
    
    public static Key random() {
        return new Key(UUID.randomUUID().toString());
    }
    
    public static Key of(final String name) {
        return new Key(name);
    }
    
    public static Key namespace(final String namespace, final String value) {
        return of(namespace + ":" + value);
    }
}
