package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPotionEffectEvent;
import org.bukkit.event.entity.EntityRegainHealthEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityRegainHealthListener {

    void onInvoke(final EntityRegainHealthEvent event);

    class EntityRegainHealthEventManager implements Listener {

        public final List<EntityRegainHealthListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityRegainHealthEvent event) {
            for (EntityRegainHealthListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
