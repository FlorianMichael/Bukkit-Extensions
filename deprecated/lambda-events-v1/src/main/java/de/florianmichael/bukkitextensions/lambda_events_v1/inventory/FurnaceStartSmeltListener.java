package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceStartSmeltEvent;

import java.util.ArrayList;
import java.util.List;

public interface FurnaceStartSmeltListener {

    void onInvoke(final FurnaceStartSmeltEvent event);

    class FurnaceStartSmeltEventManager implements Listener {

        public final List<FurnaceStartSmeltListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final FurnaceStartSmeltEvent event) {
            for (FurnaceStartSmeltListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
