package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntitySpawnListener {

    void onInvoke(final EntitySpawnEvent event);

    class EntitySpawnEventManager implements Listener {

        public final List<EntitySpawnListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntitySpawnEvent event) {
            for (EntitySpawnListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
