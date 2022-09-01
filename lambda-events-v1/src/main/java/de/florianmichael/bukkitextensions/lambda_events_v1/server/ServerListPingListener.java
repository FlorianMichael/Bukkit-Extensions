package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerEvent;
import org.bukkit.event.server.ServerListPingEvent;

import java.util.ArrayList;
import java.util.List;

public interface ServerListPingListener {

    void onInvoke(final ServerListPingEvent event);

    class ServerListPingEventManager implements Listener {

        public final List<ServerListPingListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ServerListPingEvent event) {
            for (ServerListPingListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
