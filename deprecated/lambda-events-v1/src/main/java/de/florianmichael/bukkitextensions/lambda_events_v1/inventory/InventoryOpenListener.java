package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryOpenEvent;

import java.util.ArrayList;
import java.util.List;

public interface InventoryOpenListener {

    void onInvoke(final InventoryOpenEvent event);

    class InventoryOpenEventManager implements Listener {

        public final List<InventoryOpenListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final InventoryOpenEvent event) {
            for (InventoryOpenListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
