package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleFlightEvent;
import org.bukkit.event.player.PlayerToggleSneakEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerToggleSneakListener {

    void onInvoke(final PlayerToggleSneakEvent event);

    class PlayerToggleSneakEventManager implements Listener {

        public final List<PlayerToggleSneakListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerToggleSneakEvent event) {
            for (PlayerToggleSneakListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
