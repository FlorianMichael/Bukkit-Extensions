package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

import java.util.ArrayList;
import java.util.List;

public interface CreatureSpawnListener {

    void onInvoke(final CreatureSpawnEvent event);

    class CreatureSpawnEventManager implements Listener {

        public final List<CreatureSpawnListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final CreatureSpawnEvent event) {
            for (CreatureSpawnListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
