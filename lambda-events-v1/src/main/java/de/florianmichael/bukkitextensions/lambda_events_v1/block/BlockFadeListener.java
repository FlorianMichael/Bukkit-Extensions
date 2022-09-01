package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.block.BlockFadeEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockFadeListener {

    void onInvoke(final BlockFadeEvent event);

    class BlockFadeEventManager implements Listener {

        public final List<BlockFadeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockFadeEvent event) {
            for (BlockFadeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
