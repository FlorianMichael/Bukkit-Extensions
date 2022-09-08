package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityEnterLoveModeEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityEnterLoveModeListener {

    void onInvoke(final EntityEnterLoveModeEvent event);

    class EntityEnterLoveModeEventManager implements Listener {

        public final List<EntityEnterLoveModeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityEnterLoveModeEvent event) {
            for (EntityEnterLoveModeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
