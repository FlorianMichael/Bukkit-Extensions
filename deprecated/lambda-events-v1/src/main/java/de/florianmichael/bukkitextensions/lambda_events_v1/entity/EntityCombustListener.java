package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityCombustListener {

    void onInvoke(final EntityCombustEvent event);

    class EntityCombustEventManager implements Listener {

        public final List<EntityCombustListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityCombustEvent event) {
            for (EntityCombustListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
