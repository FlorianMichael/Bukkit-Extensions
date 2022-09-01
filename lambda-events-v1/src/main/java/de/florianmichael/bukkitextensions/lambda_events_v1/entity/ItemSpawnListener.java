package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemMergeEvent;
import org.bukkit.event.entity.ItemSpawnEvent;

import java.util.ArrayList;
import java.util.List;

public interface ItemSpawnListener {

    void onInvoke(final ItemSpawnEvent event);

    class ItemSpawnEventManager implements Listener {

        public final List<ItemSpawnListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ItemSpawnEvent event) {
            for (ItemSpawnListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
