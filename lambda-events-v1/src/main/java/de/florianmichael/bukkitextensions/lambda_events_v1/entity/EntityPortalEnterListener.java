package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPlaceEvent;
import org.bukkit.event.entity.EntityPortalEnterEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityPortalEnterListener {

    void onInvoke(final EntityPortalEnterEvent event);

    class EntityPortalEnterEventManager implements Listener {

        public final List<EntityPortalEnterListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityPortalEnterEvent event) {
            for (EntityPortalEnterListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
