package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRiptideEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerShearEntityListener {

    void onInvoke(final PlayerShearEntityEvent event);

    class PlayerShearEntityEventManager implements Listener {

        public final List<PlayerShearEntityListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerShearEntityEvent event) {
            for (PlayerShearEntityListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
