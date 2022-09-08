package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.EntitiesUnloadEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntitiesUnloadListener {

    void onInvoke(final EntitiesUnloadEvent event);

    class EntitiesUnloadEventManager implements Listener {

        public final List<EntitiesUnloadListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntitiesUnloadEvent event) {
            for (EntitiesUnloadListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
