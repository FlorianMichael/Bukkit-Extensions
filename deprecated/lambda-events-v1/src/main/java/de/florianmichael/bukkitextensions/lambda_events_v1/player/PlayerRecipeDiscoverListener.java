package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRecipeDiscoverEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerRecipeDiscoverListener {

    void onInvoke(final PlayerRecipeDiscoverEvent event);

    class PlayerRecipeDiscoverEventManager implements Listener {

        public final List<PlayerRecipeDiscoverListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerRecipeDiscoverEvent event) {
            for (PlayerRecipeDiscoverListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
