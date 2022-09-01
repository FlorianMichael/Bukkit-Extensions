package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PotionSplashEvent;
import org.bukkit.event.entity.ProjectileHitEvent;

import java.util.ArrayList;
import java.util.List;

public interface ProjectileHitListener {

    void onInvoke(final ProjectileHitEvent event);

    class ProjectileHitEventManager implements Listener {

        public final List<ProjectileHitListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ProjectileHitEvent event) {
            for (ProjectileHitListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
