package de.florianmichael.bukkitextensions.lambda_events_v1.block;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.SpongeAbsorbEvent;

import java.util.ArrayList;
import java.util.List;

public interface SpongeAbsorbListener {

    void onInvoke(final SpongeAbsorbEvent event);

    class SpongeAbsorbEventManager implements Listener {

        public final List<SpongeAbsorbListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final SpongeAbsorbEvent event) {
            for (SpongeAbsorbListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
