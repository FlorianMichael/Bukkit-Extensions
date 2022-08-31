package de.florianmichael.bukkitextensions.custom_scheduler_v1;

import java.util.ArrayList;
import java.util.List;

public class TickBase {

    private final List<ITicker> ticker = new ArrayList<>();

    private final long delay;

    public TickBase(long delay) {
        this.delay = delay;
    }

    public void add(final ITicker ticker) {
        this.ticker.add(ticker);
    }

    public long getDelay() {
        return delay;
    }

    public List<ITicker> getTicker() {
        return ticker;
    }
}
