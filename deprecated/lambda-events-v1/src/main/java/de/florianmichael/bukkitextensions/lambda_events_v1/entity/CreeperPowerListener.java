package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreeperPowerEvent;

import java.util.ArrayList;
import java.util.List;

public interface CreeperPowerListener {

    void onInvoke(final CreeperPowerEvent event);

    class CreeperPowerEventManager implements Listener {

        public final List<CreeperPowerListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final CreeperPowerEvent event) {
            for (CreeperPowerListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
