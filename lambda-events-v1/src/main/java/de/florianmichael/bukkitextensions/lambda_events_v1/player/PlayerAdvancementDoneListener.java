package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerAdvancementDoneListener {

    void onInvoke(final PlayerAdvancementDoneEvent event);

    class PlayerAdvancementDoneEventManager implements Listener {

        public final List<PlayerAdvancementDoneListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerAdvancementDoneEvent event) {
            for (PlayerAdvancementDoneListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
