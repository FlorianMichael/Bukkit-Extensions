package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityDamageByEntityListener {

    void onInvoke(final EntityDamageByEntityEvent event);

    class EntityDamageByEntityEventManager implements Listener {

        public final List<EntityDamageByEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityDamageByEntityEvent event) {
            for (EntityDamageByEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
