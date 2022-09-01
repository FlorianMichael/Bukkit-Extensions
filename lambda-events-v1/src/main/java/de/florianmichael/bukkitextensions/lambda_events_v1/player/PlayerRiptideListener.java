package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.event.player.PlayerRiptideEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerRiptideListener {

    void onInvoke(final PlayerRiptideEvent event);

    class PlayerRiptideEventManager implements Listener {

        public final List<PlayerRiptideListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerRiptideEvent event) {
            for (PlayerRiptideListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
