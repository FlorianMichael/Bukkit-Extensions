package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityBreedListener {

    void onInvoke(final EntityBreedEvent event);

    class EntityBreedEventManager implements Listener {

        public final List<EntityBreedListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityBreedEvent event) {
            for (EntityBreedListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
