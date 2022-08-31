package de.florianmichael.bukkitextensions.custom_scheduler_v1;

import java.util.ArrayList;
import java.util.List;

public class TickBase {

    private final List<Runnable> ticker = new ArrayList<>();

    private final long delay;
    private long period;

    public TickBase(final long delay) {
        this.delay = delay;
    }

    public void add(final Runnable ticker) {
        this.ticker.add(ticker);
    }

    public long getDelay() {
        return delay;
    }

    public long getPeriod() {
        return period;
    }

    public void setPeriod(long period) {
        this.period = period;
    }

    public List<Runnable> getTicker() {
        return ticker;
    }
}
