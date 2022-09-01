package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ArrowBodyCountChangeEvent;
import org.bukkit.event.entity.BatToggleSleepEvent;

import java.util.ArrayList;
import java.util.List;

public interface BatToggleSleepListener {

    void onInvoke(final BatToggleSleepEvent event);

    class BatToggleSleepEventManager implements Listener {

        public final List<BatToggleSleepListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BatToggleSleepEvent event) {
            for (BatToggleSleepListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
