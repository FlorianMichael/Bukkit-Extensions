package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTargetLivingEntityEvent;
import org.bukkit.event.entity.EntityTeleportEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityTeleportListener {

    void onInvoke(final EntityTeleportEvent event);

    class EntityTeleportEventManager implements Listener {

        public final List<EntityTeleportListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityTeleportEvent event) {
            for (EntityTeleportListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
