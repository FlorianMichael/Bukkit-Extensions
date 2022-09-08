package de.florianmichael.bukkitextensions.lambda_events_v1.vehicle;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleMoveEvent;

import java.util.ArrayList;
import java.util.List;

public interface VehicleMoveListener {

    void onInvoke(final VehicleMoveEvent event);

    class VehicleMoveEventManager implements Listener {

        public final List<VehicleMoveListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final VehicleMoveEvent event) {
            for (VehicleMoveListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
