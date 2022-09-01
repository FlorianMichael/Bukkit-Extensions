package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.entity.EntityPlaceEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityPlaceListener {

    void onInvoke(final EntityPlaceEvent event);

    class EntityPlaceEventManager implements Listener {

        public final List<EntityPlaceListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityPlaceEvent event) {
            for (EntityPlaceListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
