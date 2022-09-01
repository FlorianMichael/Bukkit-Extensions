package de.florianmichael.bukkitextensions.lambda_events_v1.weather;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.event.weather.LightningStrikeEvent;

import java.util.ArrayList;
import java.util.List;

public interface LightningStrikeListener {

    void onInvoke(final LightningStrikeEvent event);

    class LightningStrikeEventManager implements Listener {

        public final List<LightningStrikeListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final LightningStrikeEvent event) {
            for (LightningStrikeListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
