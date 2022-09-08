package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemMendEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerItemMendListener {

    void onInvoke(final PlayerItemMendEvent event);

    class PlayerItemMendEventManager implements Listener {

        public final List<PlayerItemMendListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerItemMendEvent event) {
            for (PlayerItemMendListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
