package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTransformEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityTransformListener {

    void onInvoke(final EntityTransformEvent event);

    class EntityTransformEventManager implements Listener {

        public final List<EntityTransformListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityTransformEvent event) {
            for (EntityTransformListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
