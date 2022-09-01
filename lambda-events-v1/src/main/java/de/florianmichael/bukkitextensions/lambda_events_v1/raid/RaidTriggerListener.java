package de.florianmichael.bukkitextensions.lambda_events_v1.raid;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidStopEvent;
import org.bukkit.event.raid.RaidTriggerEvent;

import java.util.ArrayList;
import java.util.List;

public interface RaidTriggerListener {

    void onInvoke(final RaidTriggerEvent event);

    class RaidTriggerEventManager implements Listener {

        public final List<RaidTriggerListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final RaidTriggerEvent event) {
            for (RaidTriggerListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
