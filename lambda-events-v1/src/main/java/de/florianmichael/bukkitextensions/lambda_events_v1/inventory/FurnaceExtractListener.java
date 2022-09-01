package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.FurnaceBurnEvent;
import org.bukkit.event.inventory.FurnaceExtractEvent;

import java.util.ArrayList;
import java.util.List;

public interface FurnaceExtractListener {

    void onInvoke(final FurnaceExtractEvent event);

    class FurnaceExtractEventManager implements Listener {

        public final List<FurnaceExtractListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final FurnaceExtractEvent event) {
            for (FurnaceExtractListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
