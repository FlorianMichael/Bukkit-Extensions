package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockExplodeListener {

    void onInvoke(final BlockExplodeEvent event);

    class BlockExplodeEventManager implements Listener {

        public final List<BlockExplodeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockExplodeEvent event) {
            for (BlockExplodeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
