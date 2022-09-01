package de.florianmichael.bukkitextensions.lambda_events_v1;

import de.florianmichael.bukkitextensions.base.BukkitExtensionBase;
import de.florianmichael.bukkitextensions.spigot.SpigotPluginWrapper;
import org.bukkit.event.Listener;

import java.lang.reflect.Field;

public class LambdaEvents extends BukkitExtensionBase {

    private final PlayerJoinListener.PlayerJoinEventManager playerJoinEventManager = new PlayerJoinListener.PlayerJoinEventManager();

    public LambdaEvents() {
        super("Lambda", 1, "FlorianMichael");
    }

    @Override
    public void registerSubmit() {
        for (Field field : this.getClass().getFields()) {
            if (field.getType().isAssignableFrom(Listener.class)) {
                try {
                    this.bukkitServer().getPluginManager().registerEvents((Listener) field.get(null), SpigotPluginWrapper.instance());
                } catch (IllegalAccessException e) {
                    this.error(e);
                }
            }
        }
    }

    public void invokePlayerJoinListener(final PlayerJoinListener listener) {
        this.playerJoinEventManager.EVENT_INVOKES.add(listener);
    }
}
