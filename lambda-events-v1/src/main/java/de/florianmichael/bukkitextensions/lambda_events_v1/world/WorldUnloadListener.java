package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldSaveEvent;
import org.bukkit.event.world.WorldUnloadEvent;

import java.util.ArrayList;
import java.util.List;

public interface WorldUnloadListener {

    void onInvoke(final WorldUnloadEvent event);

    class WorldUnloadEventManager implements Listener {

        public final List<WorldUnloadListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final WorldUnloadEvent event) {
            for (WorldUnloadListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
