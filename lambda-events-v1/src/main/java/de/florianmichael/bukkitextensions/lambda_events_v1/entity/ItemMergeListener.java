package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemDespawnEvent;
import org.bukkit.event.entity.ItemMergeEvent;

import java.util.ArrayList;
import java.util.List;

public interface ItemMergeListener {

    void onInvoke(final ItemMergeEvent event);

    class ItemMergeEventManager implements Listener {

        public final List<ItemMergeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ItemMergeEvent event) {
            for (ItemMergeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
