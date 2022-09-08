package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockCanBuildEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockCanBuildListener {

    void onInvoke(final BlockCanBuildEvent event);

    class BlockCanBuildEventManager implements Listener {

        public final List<BlockCanBuildListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockCanBuildEvent event) {
            for (BlockCanBuildListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
