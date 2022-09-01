package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.RemoteServerCommandEvent;
import org.bukkit.event.server.ServerCommandEvent;

import java.util.ArrayList;
import java.util.List;

public interface ServerCommandListener {

    void onInvoke(final ServerCommandEvent event);

    class ServerCommandEventManager implements Listener {

        public final List<ServerCommandListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ServerCommandEvent event) {
            for (ServerCommandListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
