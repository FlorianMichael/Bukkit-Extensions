package de.florianmichael.bukkitextensions.demo;

import de.florianmichael.bukkitextensions.api_base.BukkitExtensions;
import de.florianmichael.bukkitextensions.bungeecord_sender_v1.BungeeCordTransmitter;
import de.florianmichael.bukkitextensions.custom_scheduler_v1.CustomSchedulerAPI;
import de.florianmichael.bukkitextensions.lambda_events_v1.LambdaEvents;
import de.florianmichael.bukkitextensions.lambda_events_v2.DynamicLambdaEvents;
import de.florianmichael.bukkitextensions.modern_commands_v1.AbstractCommand;
import de.florianmichael.bukkitextensions.modern_commands_v1.ModernCommandBuilder;
import de.florianmichael.bukkitextensions.modern_commands_v1.StringArrayWrapper;
import de.florianmichael.bukkitextensions.storage_objects_v1.StorageObject;
import de.florianmichael.bukkitextensions.storage_objects_v1.Storages;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ExtensionDemo extends JavaPlugin {

    private CustomSchedulerAPI customSchedulerAPI;
    private LambdaEvents lambdaEvents;
    private ModernCommandBuilder modernCommandBuilder;
    private BungeeCordTransmitter bungeeCordTransmitter;
    private DynamicLambdaEvents<?> dynamicLambdaEvents;

    @Override
    public void onLoad() {
        super.onLoad();

        this.customSchedulerAPI = (CustomSchedulerAPI) BukkitExtensions.self().get(CustomSchedulerAPI.class);

        // Deprecated, use DynamicLambdaEvents
        this.lambdaEvents = (LambdaEvents) BukkitExtensions.self().get(LambdaEvents.class);

        this.modernCommandBuilder = (ModernCommandBuilder) BukkitExtensions.self().get(ModernCommandBuilder.class);
        this.bungeeCordTransmitter = (BungeeCordTransmitter) BukkitExtensions.self().get(BungeeCordTransmitter.class);
        this.dynamicLambdaEvents = (DynamicLambdaEvents<?>) BukkitExtensions.self().get(DynamicLambdaEvents.class);
    }

    public static class JoinCount extends StorageObject {

        public final Map<UUID, Integer> joinCounts = new HashMap<>();

        public int next(final UUID uuid) {
            return this.joinCounts.get(uuid) + 1;
        }
    }

    @Override
    public void onEnable() {
        super.onEnable();

        Storages.self().put(new JoinCount());

        this.dynamicLambdaEvents.register(PlayerJoinEvent.class, (event -> {
            final JoinCount joinCount = Storages.self().get(JoinCount.class);

            joinCount.joinCounts.put(event.getPlayer().getUniqueId(), joinCount.next(event.getPlayer().getUniqueId()));
            Storages.self().save(event.getPlayer().getName(), event.getPlayer().getUniqueId().toString());
        }));

        this.customSchedulerAPI.fastTicker(400, Collections.singletonList(() -> {
            System.out.println("Next Call: 400 ticks");
        }));

        this.modernCommandBuilder.registerCommand(new AbstractCommand("teamspeak") {
            @Override
            public void onExecute(String label, StringArrayWrapper args) {
                this.sendMessage("TS Message: " + label);

                bungeeCordTransmitter.sendPlayerToServer(this.getPlayer(), "Lobby");
            }
        });

        this.dynamicLambdaEvents.register(PlayerQuitEvent.class, (event -> System.out.println("Player disconnected with UUID: " + Storages.self().get(event.getPlayer().getName()))));
    }
}
