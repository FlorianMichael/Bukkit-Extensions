package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldLoadEvent;
import org.bukkit.event.world.WorldSaveEvent;

import java.util.ArrayList;
import java.util.List;

public interface WorldSaveListener {

    void onInvoke(final WorldSaveEvent event);

    class WorldSaveEventManager implements Listener {

        public final List<WorldSaveListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final WorldSaveEvent event) {
            for (WorldSaveListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
