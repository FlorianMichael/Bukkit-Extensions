package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEvent;
import org.bukkit.event.player.PlayerRegisterChannelEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerRegisterChannelListener {

    void onInvoke(final PlayerRegisterChannelEvent event);

    class PlayerRegisterChannelEventManager implements Listener {

        public final List<PlayerRegisterChannelListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerRegisterChannelEvent event) {
            for (PlayerRegisterChannelListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
