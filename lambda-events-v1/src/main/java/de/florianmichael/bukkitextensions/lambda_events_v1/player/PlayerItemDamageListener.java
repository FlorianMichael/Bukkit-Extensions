package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerItemDamageEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerItemDamageListener {

    void onInvoke(final PlayerItemDamageEvent event);

    class PlayerItemDamageEventManager implements Listener {

        public final List<PlayerItemDamageListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerItemDamageEvent event) {
            for (PlayerItemDamageListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
