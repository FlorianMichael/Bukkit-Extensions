package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPhysicsEvent;

import java.util.ArrayList;
import java.util.List;

public interface BlockPhysicsListener {

    void onInvoke(final BlockPhysicsEvent event);

    class BlockPhysicsEventManager implements Listener {

        public final List<BlockPhysicsListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final BlockPhysicsEvent event) {
            for (BlockPhysicsListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
