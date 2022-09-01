package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityEvent;
import org.bukkit.event.entity.EntityExhaustionEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityExhaustionListener {

    void onInvoke(final EntityExhaustionEvent event);

    class EntityExhaustionEventManager implements Listener {

        public final List<EntityExhaustionListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityExhaustionEvent event) {
            for (EntityExhaustionListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
