package de.florianmichael.bukkitextensions.lambda_events_v1.vehicle;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.vehicle.VehicleBlockCollisionEvent;

import java.util.ArrayList;
import java.util.List;

public interface VehicleBlockCollisionListener {

    void onInvoke(final VehicleBlockCollisionEvent event);

    class VehicleBlockCollisionEventManager implements Listener {

        public final List<VehicleBlockCollisionListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final VehicleBlockCollisionEvent event) {
            for (VehicleBlockCollisionListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
