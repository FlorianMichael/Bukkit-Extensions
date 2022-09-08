package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerGameModeChangeListener {

    void onInvoke(final PlayerGameModeChangeEvent event);

    class PlayerGameModeChangeEventManager implements Listener {

        public final List<PlayerGameModeChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerGameModeChangeEvent event) {
            for (PlayerGameModeChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
