package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryDragEvent;

import java.util.ArrayList;
import java.util.List;

public interface InventoryDragListener {

    void onInvoke(final InventoryDragEvent event);

    class InventoryDragEventManager implements Listener {

        public final List<InventoryDragListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final InventoryDragEvent event) {
            for (InventoryDragListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
