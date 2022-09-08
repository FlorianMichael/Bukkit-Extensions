package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.CauldronLevelChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface CauldronLevelChangeListener {

    void onInvoke(final CauldronLevelChangeEvent event);

    class CauldronLevelChangeEventManager implements Listener {

        public final List<CauldronLevelChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final CauldronLevelChangeEvent event) {
            for (CauldronLevelChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
