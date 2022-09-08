package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.StructureGrowEvent;

import java.util.ArrayList;
import java.util.List;

public interface StructureGrowListener {

    void onInvoke(final StructureGrowEvent event);

    class StructureGrowEventManager implements Listener {

        public final List<StructureGrowListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final StructureGrowEvent event) {
            for (StructureGrowListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
