package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryInteractEvent;

import java.util.ArrayList;
import java.util.List;

public interface InventoryInteractListener {

    void onInvoke(final InventoryInteractEvent event);

    class InventoryInteractEventManager implements Listener {

        public final List<InventoryInteractListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final InventoryInteractEvent event) {
            for (InventoryInteractListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
