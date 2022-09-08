package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockListener {

    void onInvoke(final BlockEvent event);

    class BlockEventManager implements Listener {

        public final List<BlockListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockEvent event) {
            for (BlockListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
