package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityShootBowListener {

    void onInvoke(final EntityShootBowEvent event);

    class EntityShootBowEventManager implements Listener {

        public final List<EntityShootBowListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityShootBowEvent event) {
            for (EntityShootBowListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
