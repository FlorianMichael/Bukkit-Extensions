package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockIgniteEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockIgniteListener {

    void onInvoke(final BlockIgniteEvent event);

    class BlockIgniteEventManager implements Listener {

        public final List<BlockIgniteListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockIgniteEvent event) {
            for (BlockIgniteListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
