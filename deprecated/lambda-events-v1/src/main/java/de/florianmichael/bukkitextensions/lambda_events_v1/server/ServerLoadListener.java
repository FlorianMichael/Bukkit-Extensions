package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerLoadEvent;

import java.util.ArrayList;
import java.util.List;

public interface ServerLoadListener {

    void onInvoke(final ServerLoadEvent event);

    class ServerLoadEventManager implements Listener {

        public final List<ServerLoadListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ServerLoadEvent event) {
            for (ServerLoadListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
