package de.florianmichael.bukkitextensions.lambda_events_v1.hanging;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingEvent;

import java.util.ArrayList;
import java.util.List;

public interface HangingListener {

    void onInvoke(final HangingEvent event);

    class HangingEventManager implements Listener {

        public final List<HangingListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final HangingEvent event) {
            for (HangingListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
