package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageAbortEvent;
import org.bukkit.event.block.BlockDamageEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockDamageListener {

    void onInvoke(final BlockDamageEvent event);

    class BlockDamageEventManager implements Listener {

        public final List<BlockDamageListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockDamageEvent event) {
            for (BlockDamageListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
