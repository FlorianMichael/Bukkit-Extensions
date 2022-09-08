package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerBedLeaveListener {

    void onInvoke(final PlayerBedLeaveEvent event);

    class PlayerBedLeaveEventManager implements Listener {

        public final List<PlayerBedLeaveListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerBedLeaveEvent event) {
            for (PlayerBedLeaveListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
