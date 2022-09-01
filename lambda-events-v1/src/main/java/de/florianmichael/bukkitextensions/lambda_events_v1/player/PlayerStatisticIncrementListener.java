package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerShowEntityEvent;
import org.bukkit.event.player.PlayerStatisticIncrementEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerStatisticIncrementListener {

    void onInvoke(final PlayerStatisticIncrementEvent event);

    class PlayerStatisticIncrementEventManager implements Listener {

        public final List<PlayerStatisticIncrementListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerStatisticIncrementEvent event) {
            for (PlayerStatisticIncrementListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
