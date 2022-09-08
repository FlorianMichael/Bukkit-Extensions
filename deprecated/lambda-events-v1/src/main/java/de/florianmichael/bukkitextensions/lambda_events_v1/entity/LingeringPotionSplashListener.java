package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.LingeringPotionSplashEvent;

import java.util.ArrayList;
import java.util.List;

public interface LingeringPotionSplashListener {

    void onInvoke(final LingeringPotionSplashEvent event);

    class LingeringPotionSplashEventManager implements Listener {

        public final List<LingeringPotionSplashListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final LingeringPotionSplashEvent event) {
            for (LingeringPotionSplashListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
