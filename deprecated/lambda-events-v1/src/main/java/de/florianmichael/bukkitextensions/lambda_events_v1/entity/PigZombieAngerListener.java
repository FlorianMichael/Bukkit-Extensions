package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PigZombieAngerEvent;

import java.util.ArrayList;
import java.util.List;

public interface PigZombieAngerListener {

    void onInvoke(final PigZombieAngerEvent event);

    class PigZombieAngerEventManager implements Listener {

        public final List<PigZombieAngerListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PigZombieAngerEvent event) {
            for (PigZombieAngerListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
