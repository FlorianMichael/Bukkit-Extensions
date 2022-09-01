package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityPoseChangeEvent;
import org.bukkit.event.entity.EntityPotionEffectEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntityPotionEffectListener {

    void onInvoke(final EntityPotionEffectEvent event);

    class EntityPotionEffectEventManager implements Listener {

        public final List<EntityPotionEffectListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntityPotionEffectEvent event) {
            for (EntityPotionEffectListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
