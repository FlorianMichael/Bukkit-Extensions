package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.BrewingStandFuelEvent;

import java.util.ArrayList;
import java.util.List;

public interface BrewingStandFuelListener {

    void onInvoke(final BrewingStandFuelEvent event);

    class BrewingStandFuelEventManager implements Listener {

        public final List<BrewingStandFuelListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BrewingStandFuelEvent event) {
            for (BrewingStandFuelListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
