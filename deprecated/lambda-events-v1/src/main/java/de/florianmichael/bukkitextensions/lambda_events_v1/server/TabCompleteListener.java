package de.florianmichael.bukkitextensions.lambda_events_v1.server;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.TabCompleteEvent;

import java.util.ArrayList;
import java.util.List;

public interface TabCompleteListener {

    void onInvoke(final TabCompleteEvent event);

    class TabCompleteEventManager implements Listener {

        public final List<TabCompleteListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final TabCompleteEvent event) {
            for (TabCompleteListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
