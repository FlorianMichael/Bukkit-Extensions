package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShowEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerShowEntityListener {

    void onInvoke(final PlayerShowEntityEvent event);

    class PlayerShowEntityEventManager implements Listener {

        public final List<PlayerShowEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerShowEntityEvent event) {
            for (PlayerShowEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
