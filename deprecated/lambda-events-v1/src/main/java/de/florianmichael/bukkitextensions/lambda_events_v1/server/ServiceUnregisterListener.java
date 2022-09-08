package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServiceUnregisterEvent;

import java.util.ArrayList;
import java.util.List;

public interface ServiceUnregisterListener {

    void onInvoke(final ServiceUnregisterEvent event);

    class ServiceUnregisterEventManager implements Listener {

        public final List<ServiceUnregisterListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ServiceUnregisterEvent event) {
            for (ServiceUnregisterListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
