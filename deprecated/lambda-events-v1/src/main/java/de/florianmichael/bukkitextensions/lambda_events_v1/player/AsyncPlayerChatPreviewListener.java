package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatPreviewEvent;

import java.util.ArrayList;
import java.util.List;

public interface AsyncPlayerChatPreviewListener {

    void onInvoke(final AsyncPlayerChatPreviewEvent event);

    class AsyncPlayerChatPreviewEventManager implements Listener {

        public final List<AsyncPlayerChatPreviewListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final AsyncPlayerChatPreviewEvent event) {
            for (AsyncPlayerChatPreviewListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
