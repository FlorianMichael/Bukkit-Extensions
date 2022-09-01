package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerEditBookEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerEditBookListener {

    void onInvoke(final PlayerEditBookEvent event);

    class PlayerEditBookEventManager implements Listener {

        public final List<PlayerEditBookListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerEditBookEvent event) {
            for (PlayerEditBookListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
