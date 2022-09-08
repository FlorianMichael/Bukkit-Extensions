package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.ArrayList;
import java.util.List;

public interface AsyncPlayerChatListener {

    void onInvoke(final AsyncPlayerChatEvent event);

    class AsyncPlayerChatEventManager implements Listener {

        public final List<AsyncPlayerChatListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final AsyncPlayerChatEvent event) {
            for (AsyncPlayerChatListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
