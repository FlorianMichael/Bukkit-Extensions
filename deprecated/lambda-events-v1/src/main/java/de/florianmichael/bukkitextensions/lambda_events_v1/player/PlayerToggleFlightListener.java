package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerToggleFlightListener {

    void onInvoke(final PlayerToggleFlightEvent event);

    class PlayerToggleFlightEventManager implements Listener {

        public final List<PlayerToggleFlightListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerToggleFlightEvent event) {
            for (PlayerToggleFlightListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
