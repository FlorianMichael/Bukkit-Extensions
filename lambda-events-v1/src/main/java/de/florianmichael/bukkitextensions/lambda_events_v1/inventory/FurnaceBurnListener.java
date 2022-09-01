package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.BrewingStandFuelEvent;
import org.bukkit.event.inventory.FurnaceBurnEvent;

import java.util.ArrayList;
import java.util.List;

public interface FurnaceBurnListener {

    void onInvoke(final FurnaceBurnEvent event);

    class FurnaceBurnEventManager implements Listener {

        public final List<FurnaceBurnListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final FurnaceBurnEvent event) {
            for (FurnaceBurnListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
