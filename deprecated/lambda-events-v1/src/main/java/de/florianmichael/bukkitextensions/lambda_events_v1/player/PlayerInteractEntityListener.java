package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerInteractEntityListener {

    void onInvoke(final PlayerInteractEntityEvent event);

    class PlayerInteractEntityEventManager implements Listener {

        public final List<PlayerInteractEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerInteractEntityEvent event) {
            for (PlayerInteractEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
