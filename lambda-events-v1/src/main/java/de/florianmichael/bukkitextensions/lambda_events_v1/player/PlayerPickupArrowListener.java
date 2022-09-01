package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerPickupArrowEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerPickupArrowListener {

    void onInvoke(final PlayerPickupArrowEvent event);

    class PlayerPickupArrowEventManager implements Listener {

        public final List<PlayerPickupArrowListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerPickupArrowEvent event) {
            for (PlayerPickupArrowListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
