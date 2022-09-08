package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.SlimeSplitEvent;

import java.util.ArrayList;
import java.util.List;

public interface SlimeSplitListener {

    void onInvoke(final SlimeSplitEvent event);

    class SlimeSplitEventManager implements Listener {

        public final List<SlimeSplitListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final SlimeSplitEvent event) {
            for (SlimeSplitListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
