package de.florianmichael.bukkitextensions.api_base;

import org.bukkit.plugin.java.JavaPlugin;

public class SpigotPluginWrapper extends JavaPlugin {

    public static SpigotPluginWrapper instance() {
        return SpigotPluginWrapper.getPlugin(SpigotPluginWrapper.class);
    }

    @Override
    public void onEnable() {
        super.onEnable();
    }
}
