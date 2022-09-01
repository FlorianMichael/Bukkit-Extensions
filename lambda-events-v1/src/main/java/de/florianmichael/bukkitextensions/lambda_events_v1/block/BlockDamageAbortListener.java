package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockCookEvent;
import org.bukkit.event.block.BlockDamageAbortEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockDamageAbortListener {

    void onInvoke(final BlockDamageAbortEvent event);

    class BlockDamageAbortEventManager implements Listener {

        public final List<BlockDamageAbortListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockDamageAbortEvent event) {
            for (BlockDamageAbortListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
