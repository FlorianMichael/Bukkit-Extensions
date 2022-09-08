package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.VillagerReplenishTradeEvent;

import java.util.ArrayList;
import java.util.List;

public interface VillagerReplenishTradeListener {

    void onInvoke(final VillagerReplenishTradeEvent event);

    class VillagerReplenishTradeEventManager implements Listener {

        public final List<VillagerReplenishTradeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final VillagerReplenishTradeEvent event) {
            for (VillagerReplenishTradeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
