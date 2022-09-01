package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockFertilizeEvent;
import org.bukkit.event.block.BlockFormEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockFormListener {

    void onInvoke(final BlockFormEvent event);

    class BlockFormEventManager implements Listener {

        public final List<BlockFormListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockFormEvent event) {
            for (BlockFormListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
