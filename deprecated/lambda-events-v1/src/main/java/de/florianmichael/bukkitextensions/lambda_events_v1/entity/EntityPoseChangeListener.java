package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPoseChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityPoseChangeListener {

    void onInvoke(final EntityPoseChangeEvent event);

    class EntityPoseChangeEventManager implements Listener {

        public final List<EntityPoseChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityPoseChangeEvent event) {
            for (EntityPoseChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
