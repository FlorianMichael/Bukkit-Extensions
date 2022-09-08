package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPreLoginEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerPreLoginListener {

    void onInvoke(final PlayerPreLoginEvent event);

    class PlayerPreLoginEventManager implements Listener {

        public final List<PlayerPreLoginListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerPreLoginEvent event) {
            for (PlayerPreLoginListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
