package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.ChunkPopulateEvent;
import org.bukkit.event.world.ChunkUnloadEvent;

import java.util.ArrayList;
import java.util.List;

public interface ChunkUnloadListener {

    void onInvoke(final ChunkUnloadEvent event);

    class ChunkUnloadEventManager implements Listener {

        public final List<ChunkUnloadListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ChunkUnloadEvent event) {
            for (ChunkUnloadListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
