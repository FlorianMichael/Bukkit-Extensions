package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockShearEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockShearEntityListener {

    void onInvoke(final BlockShearEntityEvent event);

    class BlockShearEntityEventManager implements Listener {

        public final List<BlockShearEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockShearEntityEvent event) {
            for (BlockShearEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
