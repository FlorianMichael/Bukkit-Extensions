package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.EntitiesLoadEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntitiesLoadListener {

    void onInvoke(final EntitiesLoadEvent event);

    class EntitiesLoadEventManager implements Listener {

        public final List<EntitiesLoadListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntitiesLoadEvent event) {
            for (EntitiesLoadListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
