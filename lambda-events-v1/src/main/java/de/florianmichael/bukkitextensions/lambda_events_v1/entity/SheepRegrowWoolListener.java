package de.florianmichael.bukkitextensions.lambda_events_v1.entity;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.SheepDyeWoolEvent;
import org.bukkit.event.entity.SheepRegrowWoolEvent;

import java.util.ArrayList;
import java.util.List;

public interface SheepRegrowWoolListener {

    void onInvoke(final SheepRegrowWoolEvent event);

    class SheepRegrowWoolEventManager implements Listener {

        public final List<SheepRegrowWoolListener> EVENT_INVOKES = new ArrayList<>();

        @EventHandler
        public void onEvent(final SheepRegrowWoolEvent event) {
            for (SheepRegrowWoolListener eventInvoke : EVENT_INVOKES)
                eventInvoke.onInvoke(event);
        }
    }
}
