package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerArmorStandManipulateListener {

    void onInvoke(final PlayerArmorStandManipulateEvent event);

    class PlayerArmorStandManipulateEventManager implements Listener {

        public final List<PlayerArmorStandManipulateListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerArmorStandManipulateEvent event) {
            for (PlayerArmorStandManipulateListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
