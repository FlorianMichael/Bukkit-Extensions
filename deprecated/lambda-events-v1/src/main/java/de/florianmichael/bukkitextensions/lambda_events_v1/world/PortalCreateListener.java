package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.PortalCreateEvent;

import java.util.ArrayList;
import java.util.List;

public interface PortalCreateListener {

    void onInvoke(final PortalCreateEvent event);

    class PortalCreateEventManager implements Listener {

        public final List<PortalCreateListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PortalCreateEvent event) {
            for (PortalCreateListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
