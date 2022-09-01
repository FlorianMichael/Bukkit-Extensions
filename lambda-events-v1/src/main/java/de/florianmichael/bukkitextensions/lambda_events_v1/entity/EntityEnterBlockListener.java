package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDropItemEvent;
import org.bukkit.event.entity.EntityEnterBlockEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityEnterBlockListener {

    void onInvoke(final EntityEnterBlockEvent event);

    class EntityEnterBlockEventManager implements Listener {

        public final List<EntityEnterBlockListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityEnterBlockEvent event) {
            for (EntityEnterBlockListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
