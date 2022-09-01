package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerItemHeldEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerItemHeldListener {

    void onInvoke(final PlayerItemHeldEvent event);

    class PlayerItemHeldEventManager implements Listener {

        public final List<PlayerItemHeldListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerItemHeldEvent event) {
            for (PlayerItemHeldListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
