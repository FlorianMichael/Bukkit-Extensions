package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.LeavesDecayEvent;

import java.util.ArrayList;
import java.util.List;

public interface LeavesDecayListener {

    void onInvoke(final LeavesDecayEvent event);

    class LeavesDecayEventManager implements Listener {

        public final List<LeavesDecayListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final LeavesDecayEvent event) {
            for (LeavesDecayListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
