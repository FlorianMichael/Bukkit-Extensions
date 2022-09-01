package de.florianmichael.bukkitextensions.lambda_events_v1;

import de.florianmichael.bukkitextensions.base.BukkitExtensionBase;
import de.florianmichael.bukkitextensions.lambda_events_v1.block.*;
import de.florianmichael.bukkitextensions.lambda_events_v1.player.PlayerJoinListener;
import de.florianmichael.bukkitextensions.spigot.SpigotPluginWrapper;
import org.bukkit.event.Listener;

import java.lang.reflect.Field;

public class LambdaEvents extends BukkitExtensionBase {

    private final BlockBreakListener.BlockBreakEventManager blockBreakEventManager = new BlockBreakListener.BlockBreakEventManager();
    private final BlockBurnListener.BlockBurnEventManager blockBurnEventManager = new BlockBurnListener.BlockBurnEventManager();
    private final BlockCanBuildListener.BlockCanBuildEventManager blockCanBuildEventManager = new BlockCanBuildListener.BlockCanBuildEventManager();
    private final BlockCookListener.BlockCookEventManager blockCookEventManager = new BlockCookListener.BlockCookEventManager();
    private final BlockDamageAbortListener.BlockDamageAbortEventManager blockDamageAbortEventManager = new BlockDamageAbortListener.BlockDamageAbortEventManager();
    private final BlockDamageListener.BlockDamageEventManager blockDamageEventManager = new BlockDamageListener.BlockDamageEventManager();
    private final BlockDispenseArmorListener.BlockDispenseArmorEventManager blockDispenseArmorEventManager = new BlockDispenseArmorListener.BlockDispenseArmorEventManager();
    private final BlockDispenseListener.BlockDispenseEventManager blockDispenseEventManager = new BlockDispenseListener.BlockDispenseEventManager();
    private final BlockDropItemListener.BlockDropItemManager blockDropItemManager = new BlockDropItemListener.BlockDropItemManager();
    private final BlockExpListener.BlockExpEventManager blockExpEventManager = new BlockExpListener.BlockExpEventManager();
    private final BlockExplodeListener.BlockExplodeEventManager blockExplodeEventManager = new BlockExplodeListener.BlockExplodeEventManager();
    private final BlockFadeListener.BlockFadeEventManager blockFadeEventManager = new BlockFadeListener.BlockFadeEventManager();
    private final BlockFertilizeListener.BlockFertilizeEventManager blockFertilizeEventManager = new BlockFertilizeListener.BlockFertilizeEventManager();
    private final BlockFormListener.BlockFormEventManager blockFormEventManager = new BlockFormListener.BlockFormEventManager();
    private final BlockFromToListener.BlockFromToEventManager blockFromToEventManager = new BlockFromToListener.BlockFromToEventManager();
    private final BlockGrowListener.BlockGrowEventManager blockGrowEventManager = new BlockGrowListener.BlockGrowEventManager();
    private final BlockIgniteListener.BlockIgniteEventManager blockIgniteEventManager = new BlockIgniteListener.BlockIgniteEventManager();
    private final BlockListener.BlockEventManager blockEventManager = new BlockListener.BlockEventManager();
    private final BlockMultiPlaceListener.BlockMultiPlaceEventManager blockMultiPlaceEventManager = new BlockMultiPlaceListener.BlockMultiPlaceEventManager();
    private final BlockPhysicsListener.BlockPhysicsEventManager blockPhysicsEventManager = new BlockPhysicsListener.BlockPhysicsEventManager();
    private final BlockPistonExtendListener.BlockPistonExtendEventManager blockPistonExtendEventManager = new BlockPistonExtendListener.BlockPistonExtendEventManager();
    private final BlockPistonListener.BlockPistonEventManager blockPistonEventManager = new BlockPistonListener.BlockPistonEventManager();
    private final BlockPistonRetractListener.BlockPistonRetractEventManager blockPistonRetractEventManager = new BlockPistonRetractListener.BlockPistonRetractEventManager();
    private final BlockPlaceListener.BlockPlaceEventManager blockPlaceEventManager = new BlockPlaceListener.BlockPlaceEventManager();
    private final BlockReceiveGameListener.BlockReceiveGameEventManager blockReceiveGameEventManager = new BlockReceiveGameListener.BlockReceiveGameEventManager();
    private final BlockRedstoneListener.BlockRedstoneEventManager blockRedstoneEventManager = new BlockRedstoneListener.BlockRedstoneEventManager();
    private final BlockShearEntityListener.BlockShearEntityEventManager blockShearEntityEventManager = new BlockShearEntityListener.BlockShearEntityEventManager();
    private final BlockSpreadListener.BlockSpreadEventManager blockSpreadEventManager = new BlockSpreadListener.BlockSpreadEventManager();
    private final CauldronLevelChangeListener.CauldronLevelChangeEventManager cauldronLevelChangeEventManager = new CauldronLevelChangeListener.CauldronLevelChangeEventManager();
    private final EntityBlockFormListener.EntityBlockFormEventManager entityBlockFormEventManager = new EntityBlockFormListener.EntityBlockFormEventManager();
    private final FluidLevelChangeListener.FluidLevelChangeEventManager fluidLevelChangeEventManager = new FluidLevelChangeListener.FluidLevelChangeEventManager();
    private final LeavesDecayListener.LeavesDecayEventManager leavesDecayEventManager = new LeavesDecayListener.LeavesDecayEventManager();
    private final MoistureChangeListener.MoistureChangeEventManager moistureChangeEventManager = new MoistureChangeListener.MoistureChangeEventManager();
    private final NotePlayListener.NotePlayEventManager notePlayEventManager = new NotePlayListener.NotePlayEventManager();
    private final SignChangeListener.SignChangeEventManager signChangeEventManager = new SignChangeListener.SignChangeEventManager();
    private final SpongeAbsorbListener.SpongeAbsorbEventManager spongeAbsorbEventManager = new SpongeAbsorbListener.SpongeAbsorbEventManager();

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
