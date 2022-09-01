package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;
import org.bukkit.event.entity.EntityToggleSwimEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityToggleSwimListener {

    void onInvoke(final EntityToggleSwimEvent event);

    class EntityToggleSwimEventManager implements Listener {

        public final List<EntityToggleSwimListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityToggleSwimEvent event) {
            for (EntityToggleSwimListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
