package de.florianmichael.bukkitextensions.demo;

import de.florianmichael.bukkitextensions.BukkitExtensions;
import de.florianmichael.bukkitextensions.bungeecord_sender_v1.BungeeCordTransmitter;
import de.florianmichael.bukkitextensions.custom_scheduler_v1.CustomSchedulerAPI;
import de.florianmichael.bukkitextensions.lambda_events_v1.LambdaEvents;
import de.florianmichael.bukkitextensions.lambda_events_v2.DynamicLambdaEvents;
import de.florianmichael.bukkitextensions.modern_commands_v1.AbstractCommand;
import de.florianmichael.bukkitextensions.modern_commands_v1.ModernCommandBuilder;
import de.florianmichael.bukkitextensions.modern_commands_v1.StringArrayWrapper;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Collections;

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
        this.lambdaEvents = (LambdaEvents) BukkitExtensions.self().get(LambdaEvents.class);
        this.modernCommandBuilder = (ModernCommandBuilder) BukkitExtensions.self().get(ModernCommandBuilder.class);
        this.bungeeCordTransmitter = (BungeeCordTransmitter) BukkitExtensions.self().get(BungeeCordTransmitter.class);
        this.dynamicLambdaEvents = (DynamicLambdaEvents<?>) BukkitExtensions.self().get(DynamicLambdaEvents.class);
    }

    @Override
    public void onEnable() {
        super.onEnable();
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

        this.lambdaEvents.invokePlayerJoinListener((event -> System.out.println("Player joined: " + event.getPlayer().getName())));
        this.dynamicLambdaEvents.register(PlayerQuitEvent.class, (event -> System.out.println("Player quitted: " + event.getPlayer().getName())));
    }
}
