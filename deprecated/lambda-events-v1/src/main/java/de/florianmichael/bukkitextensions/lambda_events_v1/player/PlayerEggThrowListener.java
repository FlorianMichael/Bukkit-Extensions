package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerEggThrowListener {

    void onInvoke(final PlayerEggThrowEvent event);

    class PlayerEggThrowEventManager implements Listener {

        public final List<PlayerEggThrowListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerEggThrowEvent event) {
            for (PlayerEggThrowListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
