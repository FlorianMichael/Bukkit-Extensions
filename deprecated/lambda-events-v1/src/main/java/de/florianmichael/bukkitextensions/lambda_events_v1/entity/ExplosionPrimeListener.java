package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ExplosionPrimeEvent;

import java.util.ArrayList;
import java.util.List;

public interface ExplosionPrimeListener {

    void onInvoke(final ExplosionPrimeEvent event);

    class ExplosionPrimeEventManager implements Listener {

        public final List<ExplosionPrimeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ExplosionPrimeEvent event) {
            for (ExplosionPrimeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
