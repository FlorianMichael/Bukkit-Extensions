package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDamageEvent;
import org.bukkit.event.block.BlockDispenseArmorEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockDispenseArmorListener {

    void onInvoke(final BlockDispenseArmorEvent event);

    class BlockDispenseArmorEventManager implements Listener {

        public final List<BlockDispenseArmorListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockDispenseArmorEvent event) {
            for (BlockDispenseArmorListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
