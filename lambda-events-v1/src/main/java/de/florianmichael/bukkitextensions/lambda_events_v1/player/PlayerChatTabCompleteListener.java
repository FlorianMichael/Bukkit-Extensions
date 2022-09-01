package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChatEvent;
import org.bukkit.event.player.PlayerChatTabCompleteEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerChatTabCompleteListener {

    void onInvoke(final PlayerChatTabCompleteEvent event);

    class PlayerChatTabCompleteEventManager implements Listener {

        public final List<PlayerChatTabCompleteListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerChatTabCompleteEvent event) {
            for (PlayerChatTabCompleteListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
