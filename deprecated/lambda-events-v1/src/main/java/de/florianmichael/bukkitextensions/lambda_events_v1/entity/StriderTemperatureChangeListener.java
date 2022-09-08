package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.StriderTemperatureChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface StriderTemperatureChangeListener {

    void onInvoke(final StriderTemperatureChangeEvent event);

    class StriderTemperatureChangeEventManager implements Listener {

        public final List<StriderTemperatureChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final StriderTemperatureChangeEvent event) {
            for (StriderTemperatureChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
