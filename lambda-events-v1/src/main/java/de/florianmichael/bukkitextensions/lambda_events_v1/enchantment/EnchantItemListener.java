package de.florianmichael.bukkitextensions.lambda_events_v1.enchantment;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;

import java.util.ArrayList;
import java.util.List;

public interface EnchantItemListener {

    void onInvoke(final EnchantItemEvent event);

    class EnchantItemEventManager implements Listener {

        public final List<EnchantItemListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final EnchantItemEvent event) {
            for (EnchantItemListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
