package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFromToEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockFromToListener {

    void onInvoke(final BlockFromToEvent event);

    class BlockFromToEventManager implements Listener {

        public final List<BlockFromToListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockFromToEvent event) {
            for (BlockFromToListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
