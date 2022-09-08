package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemBreakEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerItemBreakListener {

    void onInvoke(final PlayerItemBreakEvent event);

    class PlayerItemBreakEventManager implements Listener {

        public final List<PlayerItemBreakListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerItemBreakEvent event) {
            for (PlayerItemBreakListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}