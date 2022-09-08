package de.florianmichael.bukkitextensions.lambda_events_v1.hanging;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingBreakByEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface HangingBreakByEntityListener {

    void onInvoke(final HangingBreakByEntityEvent event);

    class HangingBreakByEntityEventManager implements Listener {

        public final List<HangingBreakByEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final HangingBreakByEntityEvent event) {
            for (HangingBreakByEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
