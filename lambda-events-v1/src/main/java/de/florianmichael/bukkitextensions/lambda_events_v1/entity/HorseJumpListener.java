package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.HorseJumpEvent;

import java.util.ArrayList;
import java.util.List;

public interface HorseJumpListener {

    void onInvoke(final HorseJumpEvent event);

    class HorseJumpEventManager implements Listener {

        public final List<HorseJumpListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final HorseJumpEvent event) {
            for (HorseJumpListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
