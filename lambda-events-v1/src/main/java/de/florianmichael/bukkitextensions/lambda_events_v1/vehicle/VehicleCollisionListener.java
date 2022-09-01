package de.florianmichael.bukkitextensions.lambda_events_v1.vehicle;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleBlockCollisionEvent;
import org.bukkit.event.vehicle.VehicleCollisionEvent;

import java.util.ArrayList;
import java.util.List;

public interface VehicleCollisionListener {

    void onInvoke(final VehicleCollisionEvent event);

    class VehicleCollisionEventManager implements Listener {

        public final List<VehicleCollisionListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final VehicleCollisionEvent event) {
            for (VehicleCollisionListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
