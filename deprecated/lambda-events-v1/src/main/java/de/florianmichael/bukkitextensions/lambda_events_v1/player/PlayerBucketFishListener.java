package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketFishEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerBucketFishListener {

    void onInvoke(final PlayerBucketFishEvent event);

    class PlayerBucketFishEventManager implements Listener {

        public final List<PlayerBucketFishListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerBucketFishEvent event) {
            for (PlayerBucketFishListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
