package de.florianmichael.bukkitextensions.custom_scheduler_v1;

import de.florianmichael.bukkitextensions.base.BukkitExtensionBase;

import java.util.HashMap;
import java.util.Map;

public class CustomSchedulerAPI extends BukkitExtensionBase {

    private final Map<String, TickBase> TICKER_TRACKER = new HashMap<>();

    public CustomSchedulerAPI() {
        super("Custom Scheduler API", 1, "FlorianMichael");
    }

    public void registerTickTask(final String name, final long delay) {
        TICKER_TRACKER.put(name, new TickBase(delay));
    }

    public void addTicker(final String name, final ITicker tick) {
        if (!TICKER_TRACKER.containsKey(name)) {
            this.error(new TickerNotExistsException(name));
            return;
        }

        TICKER_TRACKER.get(name).getTicker().add(tick);
    }
}
