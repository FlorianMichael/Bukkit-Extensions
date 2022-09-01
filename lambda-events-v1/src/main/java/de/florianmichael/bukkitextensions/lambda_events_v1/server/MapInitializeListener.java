package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.BroadcastMessageEvent;
import org.bukkit.event.server.MapInitializeEvent;

import java.util.ArrayList;
import java.util.List;

public interface MapInitializeListener {

    void onInvoke(final MapInitializeEvent event);

    class MapInitializeEventManager implements Listener {

        public final List<MapInitializeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final MapInitializeEvent event) {
            for (MapInitializeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
