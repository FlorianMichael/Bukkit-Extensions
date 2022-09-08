package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerSwapHandItemsListener {

    void onInvoke(final PlayerSwapHandItemsEvent event);

    class PlayerSwapHandItemsEventManager implements Listener {

        public final List<PlayerSwapHandItemsListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerSwapHandItemsEvent event) {
            for (PlayerSwapHandItemsListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
