package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;
import org.bukkit.event.inventory.InventoryPickupItemEvent;

import java.util.ArrayList;
import java.util.List;

public interface InventoryPickupItemListener {

    void onInvoke(final InventoryPickupItemEvent event);

    class InventoryPickupItemEventManager implements Listener {

        public final List<InventoryPickupItemListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final InventoryPickupItemEvent event) {
            for (InventoryPickupItemListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
