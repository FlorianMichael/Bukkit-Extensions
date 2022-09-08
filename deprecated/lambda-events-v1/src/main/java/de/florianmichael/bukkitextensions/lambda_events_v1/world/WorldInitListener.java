package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.WorldInitEvent;

import java.util.ArrayList;
import java.util.List;

public interface WorldInitListener {

    void onInvoke(final WorldInitEvent event);

    class WorldInitEventManager implements Listener {

        public final List<WorldInitListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final WorldInitEvent event) {
            for (WorldInitListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
