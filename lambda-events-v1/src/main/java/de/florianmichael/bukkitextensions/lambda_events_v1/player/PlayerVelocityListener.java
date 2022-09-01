package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerUnregisterChannelEvent;
import org.bukkit.event.player.PlayerVelocityEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerVelocityListener {

    void onInvoke(final PlayerVelocityEvent event);

    class PlayerVelocityEventManager implements Listener {

        public final List<PlayerVelocityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerVelocityEvent event) {
            for (PlayerVelocityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
