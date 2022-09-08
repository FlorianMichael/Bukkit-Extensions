package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChannelEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerChannelListener {

    void onInvoke(final PlayerChannelEvent event);

    class PlayerChannelEventManager implements Listener {

        public final List<PlayerChannelListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerChannelEvent event) {
            for (PlayerChannelListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
