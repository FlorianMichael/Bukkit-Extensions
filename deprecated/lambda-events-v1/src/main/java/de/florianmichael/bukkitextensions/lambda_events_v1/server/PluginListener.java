package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginEvent;

import java.util.ArrayList;
import java.util.List;

public interface PluginListener {

    void onInvoke(final PluginEvent event);

    class PluginEventManager implements Listener {

        public final List<PluginListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PluginEvent event) {
            for (PluginListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
