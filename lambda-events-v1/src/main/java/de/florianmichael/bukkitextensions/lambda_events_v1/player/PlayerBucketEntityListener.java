package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerBucketEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerBucketEntityListener {

    void onInvoke(final PlayerBucketEntityEvent event);

    class PlayerBucketEmptyEventManager implements Listener {

        public final List<PlayerBucketEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerBucketEntityEvent event) {
            for (PlayerBucketEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
