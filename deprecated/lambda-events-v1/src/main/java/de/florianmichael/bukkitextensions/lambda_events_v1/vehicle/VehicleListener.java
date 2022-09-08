package de.florianmichael.bukkitextensions.lambda_events_v1.vehicle;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleEvent;

import java.util.ArrayList;
import java.util.List;

public interface VehicleListener {

    void onInvoke(final VehicleEvent event);

    class VehicleEventManager implements Listener {

        public final List<VehicleListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final VehicleEvent event) {
            for (VehicleListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
