package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAnimationEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerAnimationListener {

    void onInvoke(final PlayerAnimationEvent event);

    class PlayerAnimationEventManager implements Listener {

        public final List<PlayerAnimationListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerAnimationEvent event) {
            for (PlayerAnimationListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
