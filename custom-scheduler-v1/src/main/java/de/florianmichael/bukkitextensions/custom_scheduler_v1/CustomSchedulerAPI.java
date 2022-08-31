package de.florianmichael.bukkitextensions.custom_scheduler_v1;

import de.florianmichael.bukkitextensions.base.BukkitExtensionBase;
import de.florianmichael.bukkitextensions.spigot.SpigotPluginWrapper;

import java.util.HashMap;
import java.util.Map;

public class CustomSchedulerAPI extends BukkitExtensionBase {

    private final Map<String, TickBase> TICKER_TRACKER = new HashMap<>();
    private final Map<String, Integer> BUKKIT_ID_WRITER = new HashMap<>();

    public CustomSchedulerAPI() {
        super("Custom Scheduler API", 1, "FlorianMichael");
    }

    public void delayCallback(final Runnable runnable, final long delay) {
        this.bukkitServer().getScheduler().scheduleSyncDelayedTask(SpigotPluginWrapper.instance(), runnable, delay);
    }

    public void registerTickTask(final String name, final long delay) {
        this.registerTickTask(name, 0L, delay);
    }

    public void registerTickTask(final String name, final long period, final long delay) {
        final TickBase tickBase = new TickBase(delay);
        tickBase.setPeriod(period);

        TICKER_TRACKER.put(name, tickBase);
    }

    public void start(final String name) {
        this.start(name, true);
    }

    public void start(final String name, final boolean remove) {
        if (!TICKER_TRACKER.containsKey(name)) {
            this.error(new TickerNotExistsException(name));
            return;
        }

        final TickBase tickBase = TICKER_TRACKER.get(name);

        final int pId = this.bukkitServer().getScheduler().scheduleSyncRepeatingTask(SpigotPluginWrapper.instance(), () -> {
            for (Runnable runnable : tickBase.getTicker())
                runnable.run();
        }, tickBase.getPeriod(), tickBase.getDelay());

        if (remove)
            TICKER_TRACKER.remove(name);

        BUKKIT_ID_WRITER.put(name, pId);
    }

    public void end(final String name) {
        if (!BUKKIT_ID_WRITER.containsKey(name)) {
            this.error(new TickerNotExistsException(name));
            return;
        }

        this.bukkitServer().getScheduler().cancelTask(BUKKIT_ID_WRITER.get(name));

        TICKER_TRACKER.remove(name);
        BUKKIT_ID_WRITER.remove(name);
    }

    public void addTicker(final String name, final Runnable tick) {
        if (!TICKER_TRACKER.containsKey(name)) {
            this.error(new TickerNotExistsException(name));
            return;
        }

        TICKER_TRACKER.get(name).getTicker().add(tick);
    }
}
