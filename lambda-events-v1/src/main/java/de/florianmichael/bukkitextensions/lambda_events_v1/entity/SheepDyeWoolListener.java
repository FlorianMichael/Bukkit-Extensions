package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.entity.SheepDyeWoolEvent;

import java.util.ArrayList;
import java.util.List;

public interface SheepDyeWoolListener {

    void onInvoke(final SheepDyeWoolEvent event);

    class SheepDyeWoolEventManager implements Listener {

        public final List<SheepDyeWoolListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final SheepDyeWoolEvent event) {
            for (SheepDyeWoolListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
