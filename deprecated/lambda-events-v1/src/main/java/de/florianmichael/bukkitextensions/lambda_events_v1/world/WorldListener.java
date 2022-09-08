package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldEvent;

import java.util.ArrayList;
import java.util.List;

public interface WorldListener {

    void onInvoke(final WorldEvent event);

    class WorldEventManager implements Listener {

        public final List<WorldListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final WorldEvent event) {
            for (WorldListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
