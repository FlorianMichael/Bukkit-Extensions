package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.AreaEffectCloudApplyEvent;

import java.util.ArrayList;
import java.util.List;

public interface AreaEffectCloudApplyListener {

    void onInvoke(final AreaEffectCloudApplyEvent event);

    class AreaEffectCloudApplyEventManager implements Listener {

        public final List<AreaEffectCloudApplyListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final AreaEffectCloudApplyEvent event) {
            for (AreaEffectCloudApplyListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
