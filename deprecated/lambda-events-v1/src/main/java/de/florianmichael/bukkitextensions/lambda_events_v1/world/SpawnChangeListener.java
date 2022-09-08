package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.SpawnChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface SpawnChangeListener {

    void onInvoke(final SpawnChangeEvent event);

    class SpawnChangeEventManager implements Listener {

        public final List<SpawnChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final SpawnChangeEvent event) {
            for (SpawnChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
