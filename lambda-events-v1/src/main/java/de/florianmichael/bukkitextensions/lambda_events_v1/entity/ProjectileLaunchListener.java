package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;

import java.util.ArrayList;
import java.util.List;

public interface ProjectileLaunchListener {

    void onInvoke(final ProjectileLaunchEvent event);

    class ProjectileLaunchEventManager implements Listener {

        public final List<ProjectileLaunchListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ProjectileLaunchEvent event) {
            for (ProjectileLaunchListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
