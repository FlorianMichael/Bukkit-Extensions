package de.florianmichael.bukkitextensions.lambda_events_v1.hanging;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingEvent;
import org.bukkit.event.hanging.HangingPlaceEvent;

import java.util.ArrayList;
import java.util.List;

public interface HangingPlaceListener {

    void onInvoke(final HangingPlaceEvent event);

    class HangingPlaceEventManager implements Listener {

        public final List<HangingPlaceListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final HangingPlaceEvent event) {
            for (HangingPlaceListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
