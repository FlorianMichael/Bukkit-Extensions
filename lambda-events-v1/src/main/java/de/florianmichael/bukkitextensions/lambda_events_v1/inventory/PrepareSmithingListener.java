package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareItemCraftEvent;
import org.bukkit.event.inventory.PrepareSmithingEvent;

import java.util.ArrayList;
import java.util.List;

public interface PrepareSmithingListener {

    void onInvoke(final PrepareSmithingEvent event);

    class PrepareSmithingEventManager implements Listener {

        public final List<PrepareSmithingListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PrepareSmithingEvent event) {
            for (PrepareSmithingListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
