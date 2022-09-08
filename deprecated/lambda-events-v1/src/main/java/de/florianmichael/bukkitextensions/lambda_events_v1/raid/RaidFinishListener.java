package de.florianmichael.bukkitextensions.lambda_events_v1.raid;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.raid.RaidFinishEvent;

import java.util.ArrayList;
import java.util.List;

public interface RaidFinishListener {

    void onInvoke(final RaidFinishEvent event);

    class RaidFinishEventManager implements Listener {

        public final List<RaidFinishListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final RaidFinishEvent event) {
            for (RaidFinishListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
