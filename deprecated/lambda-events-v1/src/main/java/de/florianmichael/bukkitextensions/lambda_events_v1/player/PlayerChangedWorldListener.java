package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerChangedWorldListener {

    void onInvoke(final PlayerChangedWorldEvent event);

    class PlayerChangedWorldEventManager implements Listener {

        public final List<PlayerChangedWorldListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerChangedWorldEvent event) {
            for (PlayerChangedWorldListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
