package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExhaustionEvent;
import org.bukkit.event.world.ChunkEvent;

import java.util.ArrayList;
import java.util.List;

public interface ChunkListener {

    void onInvoke(final ChunkEvent event);

    class ChunkEventManager implements Listener {

        public final List<ChunkListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ChunkEvent event) {
            for (ChunkListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
