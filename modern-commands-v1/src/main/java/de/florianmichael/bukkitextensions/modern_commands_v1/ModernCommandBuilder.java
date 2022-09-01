package de.florianmichael.bukkitextensions.modern_commands_v1;

import de.florianmichael.bukkitextensions.base.BukkitExtensionBase;
import org.bukkit.command.CommandMap;

import java.lang.reflect.Field;

public class ModernCommandBuilder extends BukkitExtensionBase {

    public ModernCommandBuilder() {
        super("Modern Commands", 1, "Florian Michael");
    }

    public void registerCommand(final AbstractCommand command) {
        try {
            final Field bukkitCommandMap = this.bukkitServer().getClass().getDeclaredField("commandMap");

            bukkitCommandMap.setAccessible(true);

            final CommandMap commandMap = (CommandMap) bukkitCommandMap.get(this.bukkitServer());

            for (String alias : command.getAliases())
                commandMap.register(alias, command);

        } catch (NoSuchFieldException | IllegalAccessException e) {
            this.error(e);
        }
    }
}
