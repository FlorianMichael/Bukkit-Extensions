package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginEvent;
import org.bukkit.event.server.RemoteServerCommandEvent;

import java.util.ArrayList;
import java.util.List;

public interface RemoteServerCommandListener {

    void onInvoke(final RemoteServerCommandEvent event);

    class RemoteServerCommandEventManager implements Listener {

        public final List<RemoteServerCommandListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final RemoteServerCommandEvent event) {
            for (RemoteServerCommandListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
