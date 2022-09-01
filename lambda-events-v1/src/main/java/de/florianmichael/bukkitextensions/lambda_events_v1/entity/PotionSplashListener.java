package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerLeashEntityEvent;
import org.bukkit.event.entity.PotionSplashEvent;

import java.util.ArrayList;
import java.util.List;

public interface PotionSplashListener {

    void onInvoke(final PotionSplashEvent event);

    class PotionSplashEventManager implements Listener {

        public final List<PotionSplashListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final PotionSplashEvent event) {
            for (PotionSplashListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
