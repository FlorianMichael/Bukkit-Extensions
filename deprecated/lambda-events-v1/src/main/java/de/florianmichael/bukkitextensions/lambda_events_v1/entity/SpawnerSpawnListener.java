package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.SpawnerSpawnEvent;

import java.util.ArrayList;
import java.util.List;

public interface SpawnerSpawnListener {

    void onInvoke(final SpawnerSpawnEvent event);

    class SpawnerSpawnEventManager implements Listener {

        public final List<SpawnerSpawnListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final SpawnerSpawnEvent event) {
            for (SpawnerSpawnListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
