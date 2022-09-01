package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.entity.PlayerLeashEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerLeashEntityListener {

    void onInvoke(final PlayerLeashEntityEvent event);

    class PlayerLeashEntityEventManager implements Listener {

        public final List<PlayerLeashEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerLeashEntityEvent event) {
            for (PlayerLeashEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
