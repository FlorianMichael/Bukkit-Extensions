package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSprintEvent;
import org.bukkit.event.player.PlayerUnleashEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerUnleashEntityListener {

    void onInvoke(final PlayerUnleashEntityEvent event);

    class PlayerUnleashEntityEventManager implements Listener {

        public final List<PlayerUnleashEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerUnleashEntityEvent event) {
            for (PlayerUnleashEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
