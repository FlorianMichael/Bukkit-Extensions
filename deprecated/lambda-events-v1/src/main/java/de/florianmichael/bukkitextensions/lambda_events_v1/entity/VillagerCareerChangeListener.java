package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.VillagerCareerChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface VillagerCareerChangeListener {

    void onInvoke(final VillagerCareerChangeEvent event);

    class VillagerCareerChangeEventManager implements Listener {

        public final List<VillagerCareerChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final VillagerCareerChangeEvent event) {
            for (VillagerCareerChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
