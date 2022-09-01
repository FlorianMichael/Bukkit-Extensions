package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.MapInitializeEvent;
import org.bukkit.event.server.PluginDisableEvent;

import java.util.ArrayList;
import java.util.List;

public interface PluginDisableListener {

    void onInvoke(final PluginDisableEvent event);

    class PluginDisableEventManager implements Listener {

        public final List<PluginDisableListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PluginDisableEvent event) {
            for (PluginDisableListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
