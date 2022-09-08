package de.florianmichael.bukkitextensions.lambda_events_v1.raid;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidEvent;

import java.util.ArrayList;
import java.util.List;

public interface RaidListener {

    void onInvoke(final RaidEvent event);

    class RaidEventManager implements Listener {

        public final List<RaidListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final RaidEvent event) {
            for (RaidListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
