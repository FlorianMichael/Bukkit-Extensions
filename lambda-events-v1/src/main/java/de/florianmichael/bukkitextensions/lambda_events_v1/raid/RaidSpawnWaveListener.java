package de.florianmichael.bukkitextensions.lambda_events_v1.raid;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidFinishEvent;
import org.bukkit.event.raid.RaidSpawnWaveEvent;

import java.util.ArrayList;
import java.util.List;

public interface RaidSpawnWaveListener {

    void onInvoke(final RaidSpawnWaveEvent event);

    class RaidSpawnWaveEventManager implements Listener {

        public final List<RaidSpawnWaveListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final RaidSpawnWaveEvent event) {
            for (RaidSpawnWaveListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
