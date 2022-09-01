package de.florianmichael.bukkitextensions.lambda_events_v1.vehicle;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleCollisionEvent;
import org.bukkit.event.vehicle.VehicleCreateEvent;

import java.util.ArrayList;
import java.util.List;

public interface VehicleCreateListener {

    void onInvoke(final VehicleCreateEvent event);

    class VehicleCreateEventManager implements Listener {

        public final List<VehicleCreateListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final VehicleCreateEvent event) {
            for (VehicleCreateListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
