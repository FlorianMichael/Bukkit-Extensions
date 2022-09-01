package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPistonExtendEvent;
import org.bukkit.event.block.BlockPistonRetractEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockPistonRetractListener {

    void onInvoke(final BlockPistonRetractEvent event);

    class BlockPistonRetractEventManager implements Listener {

        public final List<BlockPistonRetractListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockPistonRetractEvent event) {
            for (BlockPistonRetractListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
