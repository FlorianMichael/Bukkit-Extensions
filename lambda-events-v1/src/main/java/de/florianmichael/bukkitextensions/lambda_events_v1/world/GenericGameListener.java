package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.EntitiesUnloadEvent;
import org.bukkit.event.world.GenericGameEvent;

import java.util.ArrayList;
import java.util.List;

public interface GenericGameListener {

    void onInvoke(final GenericGameEvent event);

    class GenericGameEventManager implements Listener {

        public final List<GenericGameListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final GenericGameEvent event) {
            for (GenericGameListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
