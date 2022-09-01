package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;

import java.util.ArrayList;
import java.util.List;

public interface InventoryCloseListener {

    void onInvoke(final InventoryCloseEvent event);

    class InventoryCloseEventManager implements Listener {

        public final List<InventoryCloseListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final InventoryCloseEvent event) {
            for (InventoryCloseListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
