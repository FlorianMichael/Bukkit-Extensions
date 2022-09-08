package de.florianmichael.bukkitextensions.lambda_events_v1.weather;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.ThunderChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface ThunderChangeListener {

    void onInvoke(final ThunderChangeEvent event);

    class ThunderChangeEventManager implements Listener {

        public final List<ThunderChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final ThunderChangeEvent event) {
            for (ThunderChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
