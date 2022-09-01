package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.StriderTemperatureChangeEvent;
import org.bukkit.event.entity.VillagerAcquireTradeEvent;

import java.util.ArrayList;
import java.util.List;

public interface VillagerAcquireTradeListener {

    void onInvoke(final VillagerAcquireTradeEvent event);

    class VillagerAcquireTradeEventManager implements Listener {

        public final List<VillagerAcquireTradeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final VillagerAcquireTradeEvent event) {
            for (VillagerAcquireTradeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
