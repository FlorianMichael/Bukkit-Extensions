package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EnderDragonChangePhaseEvent;
import org.bukkit.event.entity.EntityAirChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityAirChangeListener {

    void onInvoke(final EntityAirChangeEvent event);

    class EntityAirChangeEventManager implements Listener {

        public final List<EntityAirChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityAirChangeEvent event) {
            for (EntityAirChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
