package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerUnregisterChannelEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerUnregisterChannelListener {

    void onInvoke(final PlayerUnregisterChannelEvent event);

    class PlayerUnregisterChannelEventManager implements Listener {

        public final List<PlayerUnregisterChannelListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerUnregisterChannelEvent event) {
            for (PlayerUnregisterChannelListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
