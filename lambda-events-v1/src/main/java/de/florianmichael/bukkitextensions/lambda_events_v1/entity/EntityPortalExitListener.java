package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPortalEvent;
import org.bukkit.event.entity.EntityPortalExitEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityPortalExitListener {

    void onInvoke(final EntityPortalExitEvent event);

    class EntityPortalExitEventManager implements Listener {

        public final List<EntityPortalExitListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityPortalExitEvent event) {
            for (EntityPortalExitListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
