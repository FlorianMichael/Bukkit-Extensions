package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.SmithItemEvent;

import java.util.ArrayList;
import java.util.List;

public interface SmithItemListener {

    void onInvoke(final SmithItemEvent event);

    class SmithItemEventManager implements Listener {

        public final List<SmithItemListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final SmithItemEvent event) {
            for (SmithItemListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
