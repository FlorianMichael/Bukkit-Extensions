package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpellCastEvent;
import org.bukkit.event.entity.EntityTameEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityTameListener {

    void onInvoke(final EntityTameEvent event);

    class EntityTameEventManager implements Listener {

        public final List<EntityTameListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityTameEvent event) {
            for (EntityTameListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
