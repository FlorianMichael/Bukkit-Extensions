package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryPickupItemEvent;
import org.bukkit.event.inventory.PrepareAnvilEvent;

import java.util.ArrayList;
import java.util.List;

public interface PrepareAnvilListener {

    void onInvoke(final PrepareAnvilEvent event);

    class PrepareAnvilEventManager implements Listener {

        public final List<PrepareAnvilListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PrepareAnvilEvent event) {
            for (PrepareAnvilListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
