package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServiceRegisterEvent;

import java.util.ArrayList;
import java.util.List;

public interface ServiceRegisterListener {

    void onInvoke(final ServiceRegisterEvent event);

    class ServiceRegisterEventManager implements Listener {

        public final List<ServiceRegisterListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ServiceRegisterEvent event) {
            for (ServiceRegisterListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
