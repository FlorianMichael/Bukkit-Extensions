package de.florianmichael.bukkitextensions.lambda_events_v1.raid;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidSpawnWaveEvent;
import org.bukkit.event.raid.RaidStopEvent;

import java.util.ArrayList;
import java.util.List;

public interface RaidStopListener {

    void onInvoke(final RaidStopEvent event);

    class RaidStopEventManager implements Listener {

        public final List<RaidStopListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final RaidStopEvent event) {
            for (RaidStopListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
