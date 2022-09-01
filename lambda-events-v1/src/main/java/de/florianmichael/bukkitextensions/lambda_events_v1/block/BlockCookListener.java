package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockCanBuildEvent;
import org.bukkit.event.block.BlockCookEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockCookListener {

    void onInvoke(final BlockCookEvent event);

    class BlockCookEventManager implements Listener {

        public final List<BlockCookListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockCookEvent event) {
            for (BlockCookListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
