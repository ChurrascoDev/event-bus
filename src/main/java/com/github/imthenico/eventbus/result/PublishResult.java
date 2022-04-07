package com.github.imthenico.eventbus.result;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.List;

public class PublishResult {
    private final List<Throwable> exceptions;
    private final boolean consumed;
    
    public PublishResult(List<Throwable> exceptions, boolean consumed) {
        this.exceptions = Collections.unmodifiableList(Objects.requireNonNull(exceptions));
        this.consumed = consumed;
    }
    
    public boolean isSuccess() {
        return this.exceptions.isEmpty();
    }
    
    public boolean isConsumed() {
        return this.consumed;
    }
    
    public List<Throwable> getExceptions() {
        return new ArrayList<Throwable>(this.exceptions);
    }
}
