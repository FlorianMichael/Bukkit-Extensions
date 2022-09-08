package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityDeathListener {

    void onInvoke(final EntityDeathEvent event);

    class EntityDeathEventManager implements Listener {

        public final List<EntityDeathListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityDeathEvent event) {
            for (EntityDeathListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
