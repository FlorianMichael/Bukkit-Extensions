package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockMultiPlaceEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockMultiPlaceListener {

    void onInvoke(final BlockMultiPlaceEvent event);

    class BlockMultiPlaceEventManager implements Listener {

        public final List<BlockMultiPlaceListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockMultiPlaceEvent event) {
            for (BlockMultiPlaceListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
