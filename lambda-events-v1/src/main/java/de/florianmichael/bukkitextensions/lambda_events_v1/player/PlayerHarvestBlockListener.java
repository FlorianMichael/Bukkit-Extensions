package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.event.player.PlayerHarvestBlockEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerHarvestBlockListener {

    void onInvoke(final PlayerHarvestBlockEvent event);

    class PlayerHarvestBlockEventManager implements Listener {

        public final List<PlayerHarvestBlockListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerHarvestBlockEvent event) {
            for (PlayerHarvestBlockListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
