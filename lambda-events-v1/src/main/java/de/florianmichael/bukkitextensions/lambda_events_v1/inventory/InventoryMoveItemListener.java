package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;

import java.util.ArrayList;
import java.util.List;

public interface InventoryMoveItemListener {

    void onInvoke(final InventoryMoveItemEvent event);

    class InventoryMoveItemEventManager implements Listener {

        public final List<InventoryMoveItemListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final InventoryMoveItemEvent event) {
            for (InventoryMoveItemListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
