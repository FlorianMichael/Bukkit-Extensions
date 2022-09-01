package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerBucketEmptyListener {

    void onInvoke(final PlayerBucketEmptyEvent event);

    class PlayerBucketEmptyEventManager implements Listener {

        public final List<PlayerBucketEmptyListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerBucketEmptyEvent event) {
            for (PlayerBucketEmptyListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
