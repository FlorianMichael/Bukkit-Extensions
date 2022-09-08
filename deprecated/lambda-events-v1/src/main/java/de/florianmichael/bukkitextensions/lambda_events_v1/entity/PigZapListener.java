package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PigZapEvent;

import java.util.ArrayList;
import java.util.List;

public interface PigZapListener {

    void onInvoke(final PigZapEvent event);

    class PigZapEventManager implements Listener {

        public final List<PigZapListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PigZapEvent event) {
            for (PigZapListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
