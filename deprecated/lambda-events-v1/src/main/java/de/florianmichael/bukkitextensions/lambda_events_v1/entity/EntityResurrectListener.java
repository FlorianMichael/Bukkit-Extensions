package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityResurrectEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityResurrectListener {

    void onInvoke(final EntityResurrectEvent event);

    class EntityResurrectEventManager implements Listener {

        public final List<EntityResurrectListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityResurrectEvent event) {
            for (EntityResurrectListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
