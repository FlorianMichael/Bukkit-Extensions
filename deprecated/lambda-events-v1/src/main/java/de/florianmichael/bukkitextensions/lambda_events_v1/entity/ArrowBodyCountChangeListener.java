package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ArrowBodyCountChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface ArrowBodyCountChangeListener {

    void onInvoke(final ArrowBodyCountChangeEvent event);

    class ArrowBodyCountChangeEventManager implements Listener {

        public final List<ArrowBodyCountChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ArrowBodyCountChangeEvent event) {
            for (ArrowBodyCountChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
