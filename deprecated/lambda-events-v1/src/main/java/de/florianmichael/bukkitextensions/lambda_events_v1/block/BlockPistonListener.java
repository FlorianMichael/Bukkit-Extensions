package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPistonEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockPistonListener {

    void onInvoke(final BlockPistonEvent event);

    class BlockPistonEventManager implements Listener {

        public final List<BlockPistonListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockPistonEvent event) {
            for (BlockPistonListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
