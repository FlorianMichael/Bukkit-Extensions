package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerBucketListener {

    void onInvoke(final PlayerBucketEvent event);

    class PlayerBucketEventManager implements Listener {

        public final List<PlayerBucketListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerBucketEvent event) {
            for (PlayerBucketListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
