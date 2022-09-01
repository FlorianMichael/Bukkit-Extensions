package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.BrewingStandFuelEvent;
import org.bukkit.event.inventory.CraftItemEvent;

import java.util.ArrayList;
import java.util.List;

public interface CraftItemListener {

    void onInvoke(final CraftItemEvent event);

    class CraftItemEventManager implements Listener {

        public final List<CraftItemListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final CraftItemEvent event) {
            for (CraftItemListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
