package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerLoadEvent;
import org.bukkit.event.server.ServiceEvent;

import java.util.ArrayList;
import java.util.List;

public interface ServiceListener {

    void onInvoke(final ServiceEvent event);

    class ServiceEventManager implements Listener {

        public final List<ServiceListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ServiceEvent event) {
            for (ServiceListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
