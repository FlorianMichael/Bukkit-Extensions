package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.TradeSelectEvent;

import java.util.ArrayList;
import java.util.List;

public interface TradeSelectListener {

    void onInvoke(final TradeSelectEvent event);

    class TradeSelectEventManager implements Listener {

        public final List<TradeSelectListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final TradeSelectEvent event) {
            for (TradeSelectListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
