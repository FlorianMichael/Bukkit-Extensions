package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldInitEvent;
import org.bukkit.event.world.WorldLoadEvent;

import java.util.ArrayList;
import java.util.List;

public interface WorldLoadListener {

    void onInvoke(final WorldLoadEvent event);

    class WorldLoadEventManager implements Listener {

        public final List<WorldLoadListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final WorldLoadEvent event) {
            for (WorldLoadListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
