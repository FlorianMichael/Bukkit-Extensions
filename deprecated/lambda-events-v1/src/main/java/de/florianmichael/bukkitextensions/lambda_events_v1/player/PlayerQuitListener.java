package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerQuitListener {

    void onInvoke(final PlayerQuitEvent event);

    class PlayerQuitEventManager implements Listener {

        public final List<PlayerQuitListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerQuitEvent event) {
            for (PlayerQuitListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
