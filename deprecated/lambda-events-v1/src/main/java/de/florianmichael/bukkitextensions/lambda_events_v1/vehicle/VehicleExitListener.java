package de.florianmichael.bukkitextensions.lambda_events_v1.vehicle;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleExitEvent;

import java.util.ArrayList;
import java.util.List;

public interface VehicleExitListener {

    void onInvoke(final VehicleExitEvent event);

    class VehicleExitEventManager implements Listener {

        public final List<VehicleExitListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final VehicleExitEvent event) {
            for (VehicleExitListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
