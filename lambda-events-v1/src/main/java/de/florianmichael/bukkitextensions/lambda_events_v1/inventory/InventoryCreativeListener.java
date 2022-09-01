package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryCreativeEvent;

import java.util.ArrayList;
import java.util.List;

public interface InventoryCreativeListener {

    void onInvoke(final InventoryCreativeEvent event);

    class InventoryCreativeEventManager implements Listener {

        public final List<InventoryCreativeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final InventoryCreativeEvent event) {
            for (InventoryCreativeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
