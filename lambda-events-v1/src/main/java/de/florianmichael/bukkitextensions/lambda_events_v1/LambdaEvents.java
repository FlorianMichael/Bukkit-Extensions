package de.florianmichael.bukkitextensions.lambda_events_v1;

import de.florianmichael.bukkitextensions.base.BukkitExtensionBase;
import de.florianmichael.bukkitextensions.lambda_events_v1.block.BlockBreakListener;
import de.florianmichael.bukkitextensions.lambda_events_v1.block.BlockBurnListener;
import de.florianmichael.bukkitextensions.lambda_events_v1.player.PlayerJoinListener;
import de.florianmichael.bukkitextensions.spigot.SpigotPluginWrapper;
import org.bukkit.event.Listener;

import java.lang.reflect.Field;

public class LambdaEvents extends BukkitExtensionBase {

    private final BlockBreakListener.BlockBreakEventManager blockBreakEventManager = new BlockBreakListener.BlockBreakEventManager();
    private final BlockBurnListener.BlockBurnEventManager blockBurnEventManager = new BlockBurnListener.BlockBurnEventManager();

    private final EnchantItemListener.EnchantItemEventManager enchantItemEventManager = new EnchantItemListener.EnchantItemEventManager();

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

    public void invokeBlockBreakListener(final BlockBreakListener listener) {
        this.blockBreakEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockBurnListener(final BlockBurnListener listener) {
        this.blockBurnEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEnchantItemListener(final EnchantItemListener listener) {
        this.enchantItemEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePlayerJoinListener(final PlayerJoinListener listener) {
        this.playerJoinEventManager.EVENT_INVOKES.add(listener);
    }
}
