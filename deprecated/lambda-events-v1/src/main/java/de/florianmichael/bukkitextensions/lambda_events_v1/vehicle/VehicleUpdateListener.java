package de.florianmichael.bukkitextensions.lambda_events_v1.vehicle;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleUpdateEvent;

import java.util.ArrayList;
import java.util.List;

public interface VehicleUpdateListener {

    void onInvoke(final VehicleUpdateEvent event);

    class VehicleUpdateEventManager implements Listener {

        public final List<VehicleUpdateListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final VehicleUpdateEvent event) {
            for (VehicleUpdateListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
