package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerCommandPreprocessListener {

    void onInvoke(final PlayerCommandPreprocessEvent event);

    class PlayerCommandPreprocessEventManager implements Listener {

        public final List<PlayerCommandPreprocessListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerCommandPreprocessEvent event) {
            for (PlayerCommandPreprocessListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
