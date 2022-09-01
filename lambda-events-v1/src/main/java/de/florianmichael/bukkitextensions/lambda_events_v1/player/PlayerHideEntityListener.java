package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerHideEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerHideEntityListener {

    void onInvoke(final PlayerHideEntityEvent event);

    class PlayerHideEntityEventManager implements Listener {

        public final List<PlayerHideEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerHideEntityEvent event) {
            for (PlayerHideEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
