package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.StructureGrowEvent;
import org.bukkit.event.world.TimeSkipEvent;

import java.util.ArrayList;
import java.util.List;

public interface TimeSkipListener {

    void onInvoke(final TimeSkipEvent event);

    class TimeSkipEventManager implements Listener {

        public final List<TimeSkipListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final TimeSkipEvent event) {
            for (TimeSkipListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
