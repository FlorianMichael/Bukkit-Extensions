package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.FluidLevelChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface FluidLevelChangeListener {

    void onInvoke(final FluidLevelChangeEvent event);

    class FluidLevelChangeEventManager implements Listener {

        public final List<FluidLevelChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final FluidLevelChangeEvent event) {
            for (FluidLevelChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
