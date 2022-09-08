package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerPortalEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerPortalListener {

    void onInvoke(final PlayerPortalEvent event);

    class PlayerPortalEventManager implements Listener {

        public final List<PlayerPortalListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerPortalEvent event) {
            for (PlayerPortalListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
