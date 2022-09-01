package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockBurnEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockBurnListener {

    void onInvoke(final BlockBurnEvent event);

    class BlockBurnEventManager implements Listener {

        public final List<BlockBurnListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockBurnEvent event) {
            for (BlockBurnListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
