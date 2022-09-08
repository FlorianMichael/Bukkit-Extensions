package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExpBottleEvent;

import java.util.ArrayList;
import java.util.List;

public interface ExpBottleListener {

    void onInvoke(final ExpBottleEvent event);

    class ExpBottleEventManager implements Listener {

        public final List<ExpBottleListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ExpBottleEvent event) {
            for (ExpBottleListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
