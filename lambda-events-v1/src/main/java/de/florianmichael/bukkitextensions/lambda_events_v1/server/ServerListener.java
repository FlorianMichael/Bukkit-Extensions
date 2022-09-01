package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerCommandEvent;
import org.bukkit.event.server.ServerEvent;

import java.util.ArrayList;
import java.util.List;

public interface ServerListener {

    void onInvoke(final ServerEvent event);

    class ServerEventManager implements Listener {

        public final List<ServerListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ServerEvent event) {
            for (ServerListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
