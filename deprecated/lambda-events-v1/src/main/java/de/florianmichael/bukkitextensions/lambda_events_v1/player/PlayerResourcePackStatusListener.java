package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerResourcePackStatusListener {

    void onInvoke(final PlayerResourcePackStatusEvent event);

    class PlayerResourcePackStatusEventManager implements Listener {

        public final List<PlayerResourcePackStatusListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerResourcePackStatusEvent event) {
            for (PlayerResourcePackStatusListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
