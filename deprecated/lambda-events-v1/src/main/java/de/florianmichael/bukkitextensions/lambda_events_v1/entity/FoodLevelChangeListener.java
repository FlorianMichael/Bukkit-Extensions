package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface FoodLevelChangeListener {

    void onInvoke(final FoodLevelChangeEvent event);

    class FoodLevelChangeEventManager implements Listener {

        public final List<FoodLevelChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final FoodLevelChangeEvent event) {
            for (FoodLevelChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
