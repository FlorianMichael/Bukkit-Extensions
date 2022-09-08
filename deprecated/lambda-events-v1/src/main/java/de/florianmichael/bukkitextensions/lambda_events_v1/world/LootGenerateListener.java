package de.florianmichael.bukkitextensions.lambda_events_v1.world;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.world.LootGenerateEvent;

import java.util.ArrayList;
import java.util.List;

public interface LootGenerateListener {

    void onInvoke(final LootGenerateEvent event);

    class LootGenerateEventManager implements Listener {

        public final List<LootGenerateListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final LootGenerateEvent event) {
            for (LootGenerateListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
