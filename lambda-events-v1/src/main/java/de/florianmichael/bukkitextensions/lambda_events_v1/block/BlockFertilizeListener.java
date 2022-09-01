package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFadeEvent;
import org.bukkit.event.block.BlockFertilizeEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockFertilizeListener {

    void onInvoke(final BlockFertilizeEvent event);

    class BlockFertilizeEventManager implements Listener {

        public final List<BlockFertilizeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockFertilizeEvent event) {
            for (BlockFertilizeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
