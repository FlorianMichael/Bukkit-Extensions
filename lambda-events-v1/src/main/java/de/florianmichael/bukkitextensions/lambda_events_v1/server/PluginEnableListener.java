package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.PluginEnableEvent;

import java.util.ArrayList;
import java.util.List;

public interface PluginEnableListener {

    void onInvoke(final PluginEnableEvent event);

    class PluginEnableEventManager implements Listener {

        public final List<PluginEnableListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PluginEnableEvent event) {
            for (PluginEnableListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
