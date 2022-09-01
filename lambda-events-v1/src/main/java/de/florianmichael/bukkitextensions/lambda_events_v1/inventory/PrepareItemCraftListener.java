package de.florianmichael.bukkitextensions.lambda_events_v1.inventory;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.PrepareAnvilEvent;
import org.bukkit.event.inventory.PrepareItemCraftEvent;

import java.util.ArrayList;
import java.util.List;

public interface PrepareItemCraftListener {

    void onInvoke(final PrepareItemCraftEvent event);

    class PrepareItemCraftEventManager implements Listener {

        public final List<PrepareItemCraftListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PrepareItemCraftEvent event) {
            for (PrepareItemCraftListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
