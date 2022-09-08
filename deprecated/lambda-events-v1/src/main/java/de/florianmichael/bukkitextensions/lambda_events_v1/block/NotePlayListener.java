package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.NotePlayEvent;

import java.util.ArrayList;
import java.util.List;

public interface NotePlayListener {

    void onInvoke(final NotePlayEvent event);

    class NotePlayEventManager implements Listener {

        public final List<NotePlayListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final NotePlayEvent event) {
            for (NotePlayListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
