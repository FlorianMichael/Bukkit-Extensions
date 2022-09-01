package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandSendEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerCommandSendListener {

    void onInvoke(final PlayerCommandSendEvent event);

    class PlayerCommandSendEventManager implements Listener {

        public final List<PlayerCommandSendListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerCommandSendEvent event) {
            for (PlayerCommandSendListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
