package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockReceiveGameEvent;
import org.bukkit.event.block.BlockRedstoneEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockRedstoneListener {

    void onInvoke(final BlockRedstoneEvent event);

    class BlockRedstoneEventManager implements Listener {

        public final List<BlockRedstoneListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockRedstoneEvent event) {
            for (BlockRedstoneListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
