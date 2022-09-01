package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerListener {

    void onInvoke(final PlayerEvent event);

    class PlayerEventManager implements Listener {

        public final List<PlayerListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerEvent event) {
            for (PlayerListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
