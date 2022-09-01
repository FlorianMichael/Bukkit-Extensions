package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.block.BlockReceiveGameEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockReceiveGameListener {

    void onInvoke(final BlockReceiveGameEvent event);

    class BlockReceiveGameEventManager implements Listener {

        public final List<BlockReceiveGameListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockReceiveGameEvent event) {
            for (BlockReceiveGameListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
