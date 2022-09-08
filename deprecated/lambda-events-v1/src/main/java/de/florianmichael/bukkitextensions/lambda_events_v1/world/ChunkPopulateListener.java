package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkPopulateEvent;

import java.util.ArrayList;
import java.util.List;

public interface ChunkPopulateListener {

    void onInvoke(final ChunkPopulateEvent event);

    class ChunkPopulateEventManager implements Listener {

        public final List<ChunkPopulateListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ChunkPopulateEvent event) {
            for (ChunkPopulateListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
