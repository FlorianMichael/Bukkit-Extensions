package de.florianmichael.bukkitextensions.lambda_events_v1.vehicle;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.vehicle.VehicleEntityCollisionEvent;

import java.util.ArrayList;
import java.util.List;

public interface VehicleEntityCollisionListener {

    void onInvoke(final VehicleEntityCollisionEvent event);

    class VehicleEntityCollisionEventManager implements Listener {

        public final List<VehicleEntityCollisionListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final VehicleEntityCollisionEvent event) {
            for (VehicleEntityCollisionListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
