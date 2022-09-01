package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketFishEvent;
import org.bukkit.event.player.PlayerChangedMainHandEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerChangedMainHandListener {

    void onInvoke(final PlayerChangedMainHandEvent event);

    class PlayerChangedMainHandEventManager implements Listener {

        public final List<PlayerChangedMainHandListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerChangedMainHandEvent event) {
            for (PlayerChangedMainHandListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
