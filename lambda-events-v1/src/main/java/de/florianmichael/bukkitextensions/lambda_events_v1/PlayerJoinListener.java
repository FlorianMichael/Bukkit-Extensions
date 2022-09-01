package de.florianmichael.bukkitextensions.lambda_events_v1;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerJoinListener {

    void onInvoke(final PlayerJoinEvent event);

    class PlayerJoinEventManager implements Listener {

        public final List<PlayerJoinListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onPlayerJoin(final PlayerJoinEvent event) {
            for (PlayerJoinListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
