package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityCreatePortalEvent;
import org.bukkit.event.entity.EntityDamageByBlockEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityDamageByBlockListener {

    void onInvoke(final EntityDamageByBlockEvent event);

    class EntityDamageByBlockEventManager implements Listener {

        public final List<EntityDamageByBlockListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityDamageByBlockEvent event) {
            for (EntityDamageByBlockListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
