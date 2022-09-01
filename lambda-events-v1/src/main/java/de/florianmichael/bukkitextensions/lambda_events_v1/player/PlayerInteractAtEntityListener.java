package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractAtEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerInteractAtEntityListener {

    void onInvoke(final PlayerInteractAtEntityEvent event);

    class PlayerInteractAtEntityEventManager implements Listener {

        public final List<PlayerInteractAtEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerInteractAtEntityEvent event) {
            for (PlayerInteractAtEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}