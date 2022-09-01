package de.florianmichael.bukkitextensions.bungeecord_sender_v1;

import com.google.common.collect.Iterables;
import com.google.common.io.ByteArrayDataOutput;
import com.google.common.io.ByteStreams;
import de.florianmichael.bukkitextensions.base.BukkitExtensionBase;
import de.florianmichael.bukkitextensions.spigot.SpigotPluginWrapper;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

public class BungeeCordTransmitter extends BukkitExtensionBase implements PluginMessageListener {

    public BungeeCordTransmitter() {
        super("Bungee-Cord Transmitter", 1, "Florian Michael");
    }

    @Override
    public void registerSubmit() {
        super.registerSubmit();
        this.bukkitServer().getMessenger().registerOutgoingPluginChannel(SpigotPluginWrapper.instance(), "BungeeCord");
        this.bukkitServer().getMessenger().registerIncomingPluginChannel(SpigotPluginWrapper.instance(), "BungeeCord", this);

    }

    public void sendPlayerToServer(final Player player, final String serverName) {
        final ByteArrayDataOutput output = this.newStream();

        output.writeUTF("Connect");
        output.writeUTF(serverName);

        this.doLogic(player, output);
    }

    public void sendPlayerToServer(final String name, final String serverName) {
        final Player first = this.firstExists();
        if (first == null) return;

        final ByteArrayDataOutput output = this.newStream();

        output.writeUTF("ConnectOther");
        output.writeUTF(name);
        output.writeUTF(serverName);

        this.doLogic(first, output);
    }

    private Player firstExists() {
        if (this.bukkitServer().getOnlinePlayers().isEmpty())
            return null;

        return Iterables.getFirst(this.bukkitServer().getOnlinePlayers(), null);
    }

    private ByteArrayDataOutput newStream() {
        return ByteStreams.newDataOutput();
    }

    private void doLogic(final Player player, final ByteArrayDataOutput output) {
        player.sendPluginMessage(SpigotPluginWrapper.instance(), "BungeeCord", output.toByteArray());
    }

    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
    }
}
