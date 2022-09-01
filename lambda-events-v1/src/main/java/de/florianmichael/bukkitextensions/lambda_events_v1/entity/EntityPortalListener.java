package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEnterEvent;
import org.bukkit.event.entity.EntityPortalEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityPortalListener {

    void onInvoke(final EntityPortalEvent event);

    class EntityPortalEventManager implements Listener {

        public final List<EntityPortalListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityPortalEvent event) {
            for (EntityPortalListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
