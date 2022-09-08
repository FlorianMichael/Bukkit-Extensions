package de.florianmichael.bukkitextensions.lambda_events_v1.weather;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherEvent;

import java.util.ArrayList;
import java.util.List;

public interface WeatherListener {

    void onInvoke(final WeatherEvent event);

    class WeatherEventManager implements Listener {

        public final List<WeatherListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final WeatherEvent event) {
            for (WeatherListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
