package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockBreakListener {

    void onInvoke(final BlockBreakEvent event);

    class BlockBreakEventManager implements Listener {

        public final List<BlockBreakListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockBreakEvent event) {
            for (BlockBreakListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
