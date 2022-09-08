package de.florianmichael.bukkitextensions.lambda_events_v1.weather;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface WeatherChangeListener {

    void onInvoke(final WeatherChangeEvent event);

    class WeatherChangeEventManager implements Listener {

        public final List<WeatherChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final WeatherChangeEvent event) {
            for (WeatherChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
