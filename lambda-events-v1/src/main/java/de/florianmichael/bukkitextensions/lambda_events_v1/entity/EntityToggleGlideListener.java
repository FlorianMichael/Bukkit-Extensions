package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTeleportEvent;
import org.bukkit.event.entity.EntityToggleGlideEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityToggleGlideListener {

    void onInvoke(final EntityToggleGlideEvent event);

    class EntityToggleGlideEventManager implements Listener {

        public final List<EntityToggleGlideListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityToggleGlideEvent event) {
            for (EntityToggleGlideListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
