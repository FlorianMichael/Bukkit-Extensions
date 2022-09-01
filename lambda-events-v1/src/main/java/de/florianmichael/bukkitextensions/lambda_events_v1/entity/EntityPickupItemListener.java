package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.EntityPickupItemEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityPickupItemListener {

    void onInvoke(final EntityPickupItemEvent event);

    class EntityPickupItemEventManager implements Listener {

        public final List<EntityPickupItemListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityPickupItemEvent event) {
            for (EntityPickupItemListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
