package de.florianmichael.bukkitextensions.modern_commands_v1;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractCommand extends BukkitCommand {

    private CommandSender sender;

    public AbstractCommand(String name) {
        this(name, "", "/" + name, new ArrayList<>());
    }

    public AbstractCommand(String name, String description, String usageMessage, List<String> aliases) {
        super(name, description, usageMessage, aliases);
    }

    public abstract void onExecute(final String label, final StringArrayWrapper args);
    public List<String> onTabComplete(final String alias, final StringArrayWrapper args, final Location location) {
        return new ArrayList<>();
    }

    public CommandSender getSender() {
        return sender;
    }

    public boolean isPlayer() {
        return this.getSender() instanceof Player;
    }

    public Player getPlayer() {
        return (Player) this.getSender();
    }

    public void sendMessage(final String message) {
        this.getSender().sendMessage(message);
    }

    @Override
    public boolean execute(CommandSender sender, String commandLabel, String[] args) {
        this.sender = sender;

        this.onExecute(commandLabel, new StringArrayWrapper(args));
        return true;
    }

    @Override
    public List<String> tabComplete(CommandSender sender, String alias, String[] args, Location location) throws IllegalArgumentException {
        this.sender = sender;

        return this.onTabComplete(alias, new StringArrayWrapper(args), location);
    }
}
