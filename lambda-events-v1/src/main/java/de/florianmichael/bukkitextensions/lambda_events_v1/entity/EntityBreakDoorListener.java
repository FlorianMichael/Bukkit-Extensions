package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityAirChangeEvent;
import org.bukkit.event.entity.EntityBreakDoorEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityBreakDoorListener {

    void onInvoke(final EntityBreakDoorEvent event);

    class EntityBreakDoorEventManager implements Listener {

        public final List<EntityBreakDoorListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityBreakDoorEvent event) {
            for (EntityBreakDoorListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
