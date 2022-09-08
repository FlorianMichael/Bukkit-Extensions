package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.BroadcastMessageEvent;

import java.util.ArrayList;
import java.util.List;

public interface BroadcastMessageListener {

    void onInvoke(final BroadcastMessageEvent event);

    class BroadcastMessageEventManager implements Listener {

        public final List<BroadcastMessageListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BroadcastMessageEvent event) {
            for (BroadcastMessageListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
