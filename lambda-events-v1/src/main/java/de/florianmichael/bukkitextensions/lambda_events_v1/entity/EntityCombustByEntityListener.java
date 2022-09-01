package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustByBlockEvent;
import org.bukkit.event.entity.EntityCombustByEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityCombustByEntityListener {

    void onInvoke(final EntityCombustByEntityEvent event);

    class EntityCombustByEntityEventManager implements Listener {

        public final List<EntityCombustByEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityCombustByEntityEvent event) {
            for (EntityCombustByEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
