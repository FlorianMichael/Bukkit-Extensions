package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.EntityBlockFormEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityBlockFormListener {

    void onInvoke(final EntityBlockFormEvent event);

    class EntityBlockFormEventManager implements Listener {

        public final List<EntityBlockFormListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityBlockFormEvent event) {
            for (EntityBlockFormListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
