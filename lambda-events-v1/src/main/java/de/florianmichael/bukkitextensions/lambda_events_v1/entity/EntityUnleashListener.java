package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTransformEvent;
import org.bukkit.event.entity.EntityUnleashEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityUnleashListener {

    void onInvoke(final EntityUnleashEvent event);

    class EntityUnleashEventManager implements Listener {

        public final List<EntityUnleashListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityUnleashEvent event) {
            for (EntityUnleashListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
