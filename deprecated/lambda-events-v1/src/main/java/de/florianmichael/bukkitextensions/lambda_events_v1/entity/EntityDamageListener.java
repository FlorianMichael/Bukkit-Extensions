package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityDamageListener {

    void onInvoke(final EntityDamageEvent event);

    class EntityDamageEventManager implements Listener {

        public final List<EntityDamageListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityDamageEvent event) {
            for (EntityDamageListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
