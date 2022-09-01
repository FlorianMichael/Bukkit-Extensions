package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityEnterLoveModeEvent;
import org.bukkit.event.entity.EntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityListener {

    void onInvoke(final EntityEvent event);

    class EntityEventManager implements Listener {

        public final List<EntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityEvent event) {
            for (EntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
