package de.florianmichael.bukkitextensions.lambda_events_v1.hanging;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;
import org.bukkit.event.hanging.HangingBreakEvent;

import java.util.ArrayList;
import java.util.List;

public interface HangingBreakListener {

    void onInvoke(final HangingBreakEvent event);

    class HangingBreakEventManager implements Listener {

        public final List<HangingBreakListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final HangingBreakEvent event) {
            for (HangingBreakListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
