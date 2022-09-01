package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.event.entity.EntityInteractEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityInteractListener {

    void onInvoke(final EntityInteractEvent event);

    class EntityInteractEventManager implements Listener {

        public final List<EntityInteractListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityInteractEvent event) {
            for (EntityInteractListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
