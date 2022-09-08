package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockPlaceListener {

    void onInvoke(final BlockPlaceEvent event);

    class BlockPlaceEventManager implements Listener {

        public final List<BlockPlaceListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockPlaceEvent event) {
            for (BlockPlaceListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
