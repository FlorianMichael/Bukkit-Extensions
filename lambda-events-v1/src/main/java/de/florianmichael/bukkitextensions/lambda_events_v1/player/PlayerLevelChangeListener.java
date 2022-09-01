package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerLevelChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerLevelChangeListener {

    void onInvoke(final PlayerLevelChangeEvent event);

    class PlayerLevelChangeEventManager implements Listener {

        public final List<PlayerLevelChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerLevelChangeEvent event) {
            for (PlayerLevelChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
