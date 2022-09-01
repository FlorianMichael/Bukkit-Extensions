package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.HorseJumpEvent;
import org.bukkit.event.entity.ItemDespawnEvent;

import java.util.ArrayList;
import java.util.List;

public interface ItemDespawnListener {

    void onInvoke(final ItemDespawnEvent event);

    class ItemDespawnEventManager implements Listener {

        public final List<ItemDespawnListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ItemDespawnEvent event) {
            for (ItemDespawnListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
