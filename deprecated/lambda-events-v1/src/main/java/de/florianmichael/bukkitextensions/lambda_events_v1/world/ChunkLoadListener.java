package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkLoadEvent;

import java.util.ArrayList;
import java.util.List;

public interface ChunkLoadListener {

    void onInvoke(final ChunkLoadEvent event);

    class ChunkLoadEventManager implements Listener {

        public final List<ChunkLoadListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ChunkLoadEvent event) {
            for (ChunkLoadListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
