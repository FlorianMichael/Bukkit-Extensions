package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;

import java.util.ArrayList;
import java.util.List;

public interface AsyncPlayerPreLoginListener {

    void onInvoke(final AsyncPlayerPreLoginEvent event);

    class AsyncPlayerPreLoginEventManager implements Listener {

        public final List<AsyncPlayerPreLoginListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final AsyncPlayerPreLoginEvent event) {
            for (AsyncPlayerPreLoginListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
