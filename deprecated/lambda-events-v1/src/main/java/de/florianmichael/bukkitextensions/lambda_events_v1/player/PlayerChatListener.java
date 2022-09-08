package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerChatListener {

    void onInvoke(final PlayerChatEvent event);

    class PlayerChatEventManager implements Listener {

        public final List<PlayerChatListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerChatEvent event) {
            for (PlayerChatListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
