package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerMoveListener {

    void onInvoke(final PlayerMoveEvent event);

    class PlayerMoveEventManager implements Listener {

        public final List<PlayerMoveListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerMoveEvent event) {
            for (PlayerMoveListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
