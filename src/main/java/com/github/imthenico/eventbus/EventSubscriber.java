package com.github.imthenico.eventbus;

import com.github.imthenico.eventbus.result.PublishResult;
import java.util.Map;
import org.jetbrains.annotations.Nullable;
import com.github.imthenico.eventbus.priority.Priority;
import com.github.imthenico.eventbus.listener.EventHandler;
import org.jetbrains.annotations.NotNull;
import com.github.imthenico.eventbus.key.Key;

public interface EventSubscriber<E> {

    @NotNull Subscription<E> subscribe(
            @NotNull Key key, @NotNull EventHandler<E> p1, @NotNull Priority p2
    );
    
    @Nullable Subscription<E> unsubscribe(@NotNull Key p0);
    
    @Nullable Subscription<E> getSubscription(@NotNull Key p0);
    
    @NotNull Map<Key, Subscription<E>> getSubscriptions();
    
    boolean isSubscribed(@NotNull Key p0);
    
    @NotNull PublishResult callHandlers(@NotNull E p0);
}
