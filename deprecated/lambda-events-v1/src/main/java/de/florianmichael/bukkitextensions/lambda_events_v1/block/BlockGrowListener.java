package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockGrowEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockGrowListener {

    void onInvoke(final BlockGrowEvent event);

    class BlockGrowEventManager implements Listener {

        public final List<BlockGrowListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockGrowEvent event) {
            for (BlockGrowListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
