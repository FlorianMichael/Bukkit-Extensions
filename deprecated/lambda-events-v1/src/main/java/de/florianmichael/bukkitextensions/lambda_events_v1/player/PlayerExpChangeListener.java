package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerExpChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerExpChangeListener {

    void onInvoke(final PlayerExpChangeEvent event);

    class PlayerExpChangeEventManager implements Listener {

        public final List<PlayerExpChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerExpChangeEvent event) {
            for (PlayerExpChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
