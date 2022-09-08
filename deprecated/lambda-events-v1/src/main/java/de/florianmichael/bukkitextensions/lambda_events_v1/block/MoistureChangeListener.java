package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.MoistureChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface MoistureChangeListener {

    void onInvoke(final MoistureChangeEvent event);

    class MoistureChangeEventManager implements Listener {

        public final List<MoistureChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final MoistureChangeEvent event) {
            for (MoistureChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
