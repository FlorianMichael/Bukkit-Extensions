package de.florianmichael.bukkitextensions.base;

import de.florianmichael.bukkitextensions.BukkitExtensions;

public class BukkitExtensionBase {

    private final String name;
    private final int version;
    private final String[] authors;

    public BukkitExtensionBase(String name, int version, String... authors) {
        this.name = name;
        this.version = version;
        this.authors = authors;
    }

    public void registerSubmit() {
    }

    public void error(final Throwable throwable) {
        BukkitExtensions.self().throwError(this, throwable);
    }

    public String getName() {
        return name;
    }

    public int getVersion() {
        return version;
    }

    public String[] getAuthors() {
        return authors;
    }
}
