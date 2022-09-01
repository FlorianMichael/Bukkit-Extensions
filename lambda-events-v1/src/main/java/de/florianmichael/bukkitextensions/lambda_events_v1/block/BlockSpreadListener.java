package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockShearEntityEvent;
import org.bukkit.event.block.BlockSpreadEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockSpreadListener {

    void onInvoke(final BlockSpreadEvent event);

    class BlockSpreadEventManager implements Listener {

        public final List<BlockSpreadListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockSpreadEvent event) {
            for (BlockSpreadListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
