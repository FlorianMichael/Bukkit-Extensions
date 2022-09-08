package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PiglinBarterEvent;

import java.util.ArrayList;
import java.util.List;

public interface PiglinBarterListener {

    void onInvoke(final PiglinBarterEvent event);

    class PiglinBarterEventManager implements Listener {

        public final List<PiglinBarterListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PiglinBarterEvent event) {
            for (PiglinBarterListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
