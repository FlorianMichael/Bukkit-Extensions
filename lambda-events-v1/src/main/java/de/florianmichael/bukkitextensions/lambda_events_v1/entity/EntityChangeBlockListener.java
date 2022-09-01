package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityBreedEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityChangeBlockListener {

    void onInvoke(final EntityChangeBlockEvent event);

    class EntityChangeBlockEventManager implements Listener {

        public final List<EntityChangeBlockListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityChangeBlockEvent event) {
            for (EntityChangeBlockListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
