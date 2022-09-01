package de.florianmichael.bukkitextensions.lambda_events_v1.player;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerArmorStandManipulateEvent;
import org.bukkit.event.player.PlayerBedEnterEvent;

import java.util.ArrayList;
import java.util.List;

public interface PlayerBedEnterListener {

    void onInvoke(final PlayerBedEnterEvent event);

    class PlayerBedEnterEventManager implements Listener {

        public final List<PlayerBedEnterListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PlayerBedEnterEvent event) {
            for (PlayerBedEnterListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
