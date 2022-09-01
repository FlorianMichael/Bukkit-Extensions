package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceExtractEvent;
import org.bukkit.event.inventory.FurnaceSmeltEvent;

import java.util.ArrayList;
import java.util.List;

public interface FurnaceSmeltListener {

    void onInvoke(final FurnaceSmeltEvent event);

    class FurnaceSmeltEventManager implements Listener {

        public final List<FurnaceSmeltListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final FurnaceSmeltEvent event) {
            for (FurnaceSmeltListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
