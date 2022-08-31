package de.florianmichael.bukkitextensions.custom_scheduler_v1;

public class TickerNotExistsException extends RuntimeException {

    public TickerNotExistsException(final String name) {
        super("Ticker with the name " + name + " is not loaded!");
    }
}
