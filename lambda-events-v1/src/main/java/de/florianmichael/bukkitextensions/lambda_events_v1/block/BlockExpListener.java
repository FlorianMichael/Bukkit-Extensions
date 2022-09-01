package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.event.block.BlockExpEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockExpListener {

    void onInvoke(final BlockExpEvent event);

    class BlockExpEventManager implements Listener {

        public final List<BlockExpListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockExpEvent event) {
            for (BlockExpListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
