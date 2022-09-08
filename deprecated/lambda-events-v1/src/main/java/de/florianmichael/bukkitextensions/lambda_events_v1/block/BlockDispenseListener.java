package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockDispenseListener {

    void onInvoke(final BlockDispenseEvent event);

    class BlockDispenseEventManager implements Listener {

        public final List<BlockDispenseListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockDispenseEvent event) {
            for (BlockDispenseListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
