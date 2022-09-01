package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.event.entity.EntitySpellCastEvent;

import java.util.ArrayList;
import java.util.List;

public interface EntitySpellCastListener {

    void onInvoke(final EntitySpellCastEvent event);

    class EntitySpellCastEventManager implements Listener {

        public final List<EntitySpellCastListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EntitySpellCastEvent event) {
            for (EntitySpellCastListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
