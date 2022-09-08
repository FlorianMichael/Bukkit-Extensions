package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityTargetListener {

    void onInvoke(final EntityTargetEvent event);

    class EntityTargetEventManager implements Listener {

        public final List<EntityTargetListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityTargetEvent event) {
            for (EntityTargetListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
