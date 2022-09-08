package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLocaleChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerLocaleChangeListener {

    void onInvoke(final PlayerLocaleChangeEvent event);

    class PlayerLocaleChangeEventManager implements Listener {

        public final List<PlayerLocaleChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerLocaleChangeEvent event) {
            for (PlayerLocaleChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
