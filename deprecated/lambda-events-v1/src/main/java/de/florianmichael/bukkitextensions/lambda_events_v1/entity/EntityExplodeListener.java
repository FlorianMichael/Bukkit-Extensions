package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityExplodeListener {

    void onInvoke(final EntityExplodeEvent event);

    class EntityExplodeEventManager implements Listener {

        public final List<EntityExplodeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityExplodeEvent event) {
            for (EntityExplodeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
