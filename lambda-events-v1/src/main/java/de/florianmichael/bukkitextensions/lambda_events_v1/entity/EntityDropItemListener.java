package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntityDropItemEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityDropItemListener {

    void onInvoke(final EntityDropItemEvent event);

    class EntityDropItemEventManager implements Listener {

        public final List<EntityDropItemListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityDropItemEvent event) {
            for (EntityDropItemListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
