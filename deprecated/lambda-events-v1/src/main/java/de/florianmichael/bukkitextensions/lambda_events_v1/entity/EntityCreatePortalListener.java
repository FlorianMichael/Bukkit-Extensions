package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCreatePortalEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityCreatePortalListener {

    void onInvoke(final EntityCreatePortalEvent event);

    class EntityCreatePortalEventManager implements Listener {

        public final List<EntityCreatePortalListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityCreatePortalEvent event) {
            for (EntityCreatePortalListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
