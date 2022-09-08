package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCombustByBlockEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityCombustByBlockListener {

    void onInvoke(final EntityCombustByBlockEvent event);

    class EntityCombustByBlockEventManager implements Listener {

        public final List<EntityCombustByBlockListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityCombustByBlockEvent event) {
            for (EntityCombustByBlockListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
