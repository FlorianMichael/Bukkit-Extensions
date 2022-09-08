package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FireworkExplodeEvent;

import java.util.ArrayList;
import java.util.List;

public interface FireworkExplodeListener {

    void onInvoke(final FireworkExplodeEvent event);

    class FireworkExplodeEventManager implements Listener {

        public final List<FireworkExplodeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final FireworkExplodeEvent event) {
            for (FireworkExplodeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
