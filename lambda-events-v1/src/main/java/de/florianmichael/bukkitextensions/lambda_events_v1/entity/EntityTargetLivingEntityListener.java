package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityTargetLivingEntityListener {

    void onInvoke(final EntityTargetLivingEntityEvent event);

    class EntityTargetLivingEntityEventManager implements Listener {

        public final List<EntityTargetLivingEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityTargetLivingEntityEvent event) {
            for (EntityTargetLivingEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
