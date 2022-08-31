package de.florianmichael.bukkitextensions.spigot;

import org.bukkit.plugin.java.JavaPlugin;

public class SpigotPlugin extends JavaPlugin {

    public static SpigotPlugin self() {
        return SpigotPlugin.getPlugin(SpigotPlugin.class);
    }
}
