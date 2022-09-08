package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EnderDragonChangePhaseEvent;

import java.util.ArrayList;
import java.util.List;

public interface EnderDragonChangePhaseListener {

    void onInvoke(final EnderDragonChangePhaseEvent event);

    class EnderDragonChangePhaseEventManager implements Listener {

        public final List<EnderDragonChangePhaseListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EnderDragonChangePhaseEvent event) {
            for (EnderDragonChangePhaseListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
