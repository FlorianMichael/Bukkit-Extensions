package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerDeathListener {

    void onInvoke(final PlayerDeathEvent event);

    class PlayerDeathEventManager implements Listener {

        public final List<PlayerDeathListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerDeathEvent event) {
            for (PlayerDeathListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
