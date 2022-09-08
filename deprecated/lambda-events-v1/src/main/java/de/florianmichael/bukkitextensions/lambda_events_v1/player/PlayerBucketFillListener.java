package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketFillEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerBucketFillListener {

    void onInvoke(final PlayerBucketFillEvent event);

    class PlayerBucketFillEventManager implements Listener {

        public final List<PlayerBucketFillListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerBucketFillEvent event) {
            for (PlayerBucketFillListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
