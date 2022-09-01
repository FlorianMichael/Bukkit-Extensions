package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPistonEvent;
import org.bukkit.event.block.BlockPistonExtendEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockPistonExtendListener {

    void onInvoke(final BlockPistonExtendEvent event);

    class BlockPistonExtendEventManager implements Listener {

        public final List<BlockPistonExtendListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockPistonExtendEvent event) {
            for (BlockPistonExtendListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
