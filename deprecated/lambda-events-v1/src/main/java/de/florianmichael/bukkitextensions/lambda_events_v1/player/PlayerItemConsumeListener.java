package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerItemConsumeListener {

    void onInvoke(final PlayerItemConsumeEvent event);

    class PlayerItemConsumeEventManager implements Listener {

        public final List<PlayerItemConsumeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerItemConsumeEvent event) {
            for (PlayerItemConsumeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
