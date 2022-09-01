package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockDropItemEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockDropItemListener {

    void onInvoke(final BlockDropItemEvent event);

    class BlockDropItemManager implements Listener {

        public final List<BlockDropItemListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockDropItemEvent event) {
            for (BlockDropItemListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
