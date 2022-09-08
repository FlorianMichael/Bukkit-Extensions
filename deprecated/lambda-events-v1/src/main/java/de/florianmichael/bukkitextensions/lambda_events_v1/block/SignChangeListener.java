package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.SignChangeEvent;

import java.util.ArrayList;
import java.util.List;

public interface SignChangeListener {

    void onInvoke(final SignChangeEvent event);

    class SignChangeEventManager implements Listener {

        public final List<SignChangeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final SignChangeEvent event) {
            for (SignChangeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
