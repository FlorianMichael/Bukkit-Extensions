package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerToggleSneakEvent;
import org.bukkit.event.player.PlayerToggleSprintEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerToggleSprintListener {

    void onInvoke(final PlayerToggleSprintEvent event);

    class PlayerToggleSprintEventManager implements Listener {

        public final List<PlayerToggleSprintListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerToggleSprintEvent event) {
            for (PlayerToggleSprintListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
