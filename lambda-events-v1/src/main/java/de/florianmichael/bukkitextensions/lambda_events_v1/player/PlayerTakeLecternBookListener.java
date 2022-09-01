package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerSwapHandItemsEvent;
import org.bukkit.event.player.PlayerTakeLecternBookEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerTakeLecternBookListener {

    void onInvoke(final PlayerTakeLecternBookEvent event);

    class PlayerTakeLecternBookEventManager implements Listener {

        public final List<PlayerTakeLecternBookListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerTakeLecternBookEvent event) {
            for (PlayerTakeLecternBookListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
