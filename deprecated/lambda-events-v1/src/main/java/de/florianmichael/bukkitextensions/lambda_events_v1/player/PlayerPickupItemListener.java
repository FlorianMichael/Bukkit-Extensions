package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPickupItemEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerPickupItemListener {

    void onInvoke(final PlayerPickupItemEvent event);

    class PlayerPickupItemEventManager implements Listener {

        public final List<PlayerPickupItemListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerPickupItemEvent event) {
            for (PlayerPickupItemListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
