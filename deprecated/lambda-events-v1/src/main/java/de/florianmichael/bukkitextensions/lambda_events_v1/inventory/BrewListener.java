package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.BrewEvent;

import java.util.ArrayList;
import java.util.List;

public interface BrewListener {

    void onInvoke(final BrewEvent event);

    class BrewEventManager implements Listener {

        public final List<BrewListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BrewEvent event) {
            for (BrewListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
