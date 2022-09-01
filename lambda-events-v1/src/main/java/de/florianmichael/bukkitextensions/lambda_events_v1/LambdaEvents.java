package de.florianmichael.bukkitextensions.lambda_events_v1;

import de.florianmichael.bukkitextensions.base.BukkitExtensionBase;
import de.florianmichael.bukkitextensions.lambda_events_v1.block.*;
import de.florianmichael.bukkitextensions.lambda_events_v1.enchantment.EnchantItemListener;
import de.florianmichael.bukkitextensions.lambda_events_v1.entity.*;
import de.florianmichael.bukkitextensions.lambda_events_v1.hanging.HangingBreakByEntityListener;
import de.florianmichael.bukkitextensions.lambda_events_v1.hanging.HangingBreakListener;
import de.florianmichael.bukkitextensions.lambda_events_v1.hanging.HangingListener;
import de.florianmichael.bukkitextensions.lambda_events_v1.hanging.HangingPlaceListener;
import de.florianmichael.bukkitextensions.lambda_events_v1.inventory.*;
import de.florianmichael.bukkitextensions.lambda_events_v1.player.PlayerJoinListener;
import de.florianmichael.bukkitextensions.lambda_events_v1.raid.*;
import de.florianmichael.bukkitextensions.lambda_events_v1.server.*;
import de.florianmichael.bukkitextensions.lambda_events_v1.vehicle.*;
import de.florianmichael.bukkitextensions.lambda_events_v1.weather.LightningStrikeListener;
import de.florianmichael.bukkitextensions.lambda_events_v1.weather.ThunderChangeListener;
import de.florianmichael.bukkitextensions.lambda_events_v1.weather.WeatherChangeListener;
import de.florianmichael.bukkitextensions.lambda_events_v1.weather.WeatherListener;
import de.florianmichael.bukkitextensions.spigot.SpigotPluginWrapper;
import org.bukkit.event.Listener;

public class LambdaEvents extends BukkitExtensionBase {

    // Block Events
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

    // Enchant Event
    private final EnchantItemListener.EnchantItemEventManager enchantItemEventManager = new EnchantItemListener.EnchantItemEventManager();

    // Entity Events
    private final AreaEffectCloudApplyListener.AreaEffectCloudApplyEventManager areaEffectCloudApplyEventManager = new AreaEffectCloudApplyListener.AreaEffectCloudApplyEventManager();
    private final ArrowBodyCountChangeListener.ArrowBodyCountChangeEventManager arrowBodyCountChangeEventManager = new ArrowBodyCountChangeListener.ArrowBodyCountChangeEventManager();
    private final BatToggleSleepListener.BatToggleSleepEventManager batToggleSleepEventManager = new BatToggleSleepListener.BatToggleSleepEventManager();
    private final CreatureSpawnListener.CreatureSpawnEventManager creatureSpawnEventManager = new CreatureSpawnListener.CreatureSpawnEventManager();
    private final CreeperPowerListener.CreeperPowerEventManager creeperPowerEventManager = new CreeperPowerListener.CreeperPowerEventManager();
    private final EnderDragonChangePhaseListener.EnderDragonChangePhaseEventManager enderDragonChangePhaseEventManager = new EnderDragonChangePhaseListener.EnderDragonChangePhaseEventManager();
    private final EntityAirChangeListener.EntityAirChangeEventManager entityAirChangeEventManager = new EntityAirChangeListener.EntityAirChangeEventManager();
    private final EntityBreakDoorListener.EntityBreakDoorEventManager entityBreakDoorEventManager = new EntityBreakDoorListener.EntityBreakDoorEventManager();
    private final EntityBreedListener.EntityBreedEventManager entityBreedEventManager = new EntityBreedListener.EntityBreedEventManager();
    private final EntityChangeBlockListener.EntityChangeBlockEventManager entityChangeBlockEventManager = new EntityChangeBlockListener.EntityChangeBlockEventManager();
    private final EntityCombustByBlockListener.EntityCombustByBlockEventManager entityCombustByBlockEventManager = new EntityCombustByBlockListener.EntityCombustByBlockEventManager();
    private final EntityCombustByEntityListener.EntityCombustByEntityEventManager entityCombustByEntityEventManager = new EntityCombustByEntityListener.EntityCombustByEntityEventManager();
    private final EntityCombustListener.EntityCombustEventManager entityCombustEventManager = new EntityCombustListener.EntityCombustEventManager();
    private final EntityCreatePortalListener.EntityCreatePortalEventManager entityCreatePortalEventManager = new EntityCreatePortalListener.EntityCreatePortalEventManager();
    private final EntityDamageByBlockListener.EntityDamageByBlockEventManager entityDamageByBlockEventManager = new EntityDamageByBlockListener.EntityDamageByBlockEventManager();
    private final EntityDamageByEntityListener.EntityDamageByEntityEventManager entityDamageByEntityEventManager = new EntityDamageByEntityListener.EntityDamageByEntityEventManager();
    private final EntityDamageListener.EntityDamageEventManager entityDamageEventManager = new EntityDamageListener.EntityDamageEventManager();
    private final EntityDeathListener.EntityDeathEventManager entityDeathEventManager = new EntityDeathListener.EntityDeathEventManager();
    private final EntityDropItemListener.EntityDropItemEventManager entityDropItemEventManager = new EntityDropItemListener.EntityDropItemEventManager();
    private final EntityEnterBlockListener.EntityEnterBlockEventManager entityEnterBlockEventManager = new EntityEnterBlockListener.EntityEnterBlockEventManager();
    private final EntityEnterLoveModeListener.EntityEnterLoveModeEventManager entityEnterLoveModeEventManager = new EntityEnterLoveModeListener.EntityEnterLoveModeEventManager();
    private final EntityExhaustionListener.EntityExhaustionEventManager entityExhaustionEventManager = new EntityExhaustionListener.EntityExhaustionEventManager();
    private final EntityExplodeListener.EntityExplodeEventManager entityExplodeEventManager = new EntityExplodeListener.EntityExplodeEventManager();
    private final EntityInteractListener.EntityInteractEventManager entityInteractEventManager = new EntityInteractListener.EntityInteractEventManager();
    private final EntityListener.EntityEventManager entityEventManager = new EntityListener.EntityEventManager();
    private final EntityPickupItemListener.EntityPickupItemEventManager entityPickupItemEventManager = new EntityPickupItemListener.EntityPickupItemEventManager();
    private final EntityPlaceListener.EntityPlaceEventManager entityPlaceEventManager = new EntityPlaceListener.EntityPlaceEventManager();
    private final EntityPortalEnterListener.EntityPortalEnterEventManager entityPortalEnterEventManager = new EntityPortalEnterListener.EntityPortalEnterEventManager();
    private final EntityPortalExitListener.EntityPortalExitEventManager entityPortalExitEventManager = new EntityPortalExitListener.EntityPortalExitEventManager();
    private final EntityPortalListener.EntityPortalEventManager entityPortalEventManager = new EntityPortalListener.EntityPortalEventManager();
    private final EntityPoseChangeListener.EntityPoseChangeEventManager entityPoseChangeEventManager = new EntityPoseChangeListener.EntityPoseChangeEventManager();
    private final EntityPotionEffectListener.EntityPotionEffectEventManager entityPotionEffectEventManager = new EntityPotionEffectListener.EntityPotionEffectEventManager();
    private final EntityRegainHealthListener.EntityRegainHealthEventManager entityRegainHealthEventManager = new EntityRegainHealthListener.EntityRegainHealthEventManager();
    private final EntityResurrectListener.EntityResurrectEventManager entityResurrectEventManager = new EntityResurrectListener.EntityResurrectEventManager();
    private final EntityShootBowListener.EntityShootBowEventManager entityShootBowEventManager = new EntityShootBowListener.EntityShootBowEventManager();
    private final EntitySpawnListener.EntitySpawnEventManager entitySpawnEventManager = new EntitySpawnListener.EntitySpawnEventManager();
    private final EntitySpellCastListener.EntitySpellCastEventManager entitySpellCastEventManager = new EntitySpellCastListener.EntitySpellCastEventManager();
    private final EntityTameListener.EntityTameEventManager entityTameEventManager = new EntityTameListener.EntityTameEventManager();
    private final EntityTargetListener.EntityTargetEventManager entityTargetEventManager = new EntityTargetListener.EntityTargetEventManager();
    private final EntityTargetLivingEntityListener.EntityTargetLivingEntityEventManager entityTargetLivingEntityEventManager = new EntityTargetLivingEntityListener.EntityTargetLivingEntityEventManager();
    private final EntityTeleportListener.EntityTeleportEventManager entityTeleportEventManager = new EntityTeleportListener.EntityTeleportEventManager();
    private final EntityToggleGlideListener.EntityToggleGlideEventManager entityToggleGlideEventManager = new EntityToggleGlideListener.EntityToggleGlideEventManager();
    private final EntityToggleSwimListener.EntityToggleSwimEventManager entityToggleSwimEventManager = new EntityToggleSwimListener.EntityToggleSwimEventManager();
    private final EntityTransformListener.EntityTransformEventManager entityTransformEventManager = new EntityTransformListener.EntityTransformEventManager();
    private final EntityUnleashListener.EntityUnleashEventManager entityUnleashEventManager = new EntityUnleashListener.EntityUnleashEventManager();
    private final ExpBottleListener.ExpBottleEventManager expBottleEventManager = new ExpBottleListener.ExpBottleEventManager();
    private final ExplosionPrimeListener.ExplosionPrimeEventManager explosionPrimeEventManager = new ExplosionPrimeListener.ExplosionPrimeEventManager();
    private final FireworkExplodeListener.FireworkExplodeEventManager fireworkExplodeEventManager = new FireworkExplodeListener.FireworkExplodeEventManager();
    private final FoodLevelChangeListener.FoodLevelChangeEventManager foodLevelChangeEventManager = new FoodLevelChangeListener.FoodLevelChangeEventManager();
    private final HorseJumpListener.HorseJumpEventManager horseJumpEventManager = new HorseJumpListener.HorseJumpEventManager();
    private final ItemDespawnListener.ItemDespawnEventManager itemDespawnEventManager = new ItemDespawnListener.ItemDespawnEventManager();
    private final ItemMergeListener.ItemMergeEventManager itemMergeEventManager = new ItemMergeListener.ItemMergeEventManager();
    private final ItemSpawnListener.ItemSpawnEventManager itemSpawnEventManager = new ItemSpawnListener.ItemSpawnEventManager();
    private final LingeringPotionSplashListener.LingeringPotionSplashEventManager lingeringPotionSplashEventManager = new LingeringPotionSplashListener.LingeringPotionSplashEventManager();
    private final PiglinBarterListener.PiglinBarterEventManager piglinBarterEventManager = new PiglinBarterListener.PiglinBarterEventManager();
    private final PigZapListener.PigZapEventManager pigZapEventManager = new PigZapListener.PigZapEventManager();
    private final PigZombieAngerListener.PigZombieAngerEventManager pigZombieAngerEventManager = new PigZombieAngerListener.PigZombieAngerEventManager();
    private final PlayerDeathListener.PlayerDeathEventManager playerDeathEventManager = new PlayerDeathListener.PlayerDeathEventManager();
    private final PlayerLeashEntityListener.PlayerLeashEntityEventManager playerLeashEntityEventManager = new PlayerLeashEntityListener.PlayerLeashEntityEventManager();
    private final PotionSplashListener.PotionSplashEventManager potionSplashEventManager = new PotionSplashListener.PotionSplashEventManager();
    private final ProjectileHitListener.ProjectileHitEventManager projectileHitEventManager = new ProjectileHitListener.ProjectileHitEventManager();
    private final ProjectileLaunchListener.ProjectileLaunchEventManager projectileLaunchEventManager = new ProjectileLaunchListener.ProjectileLaunchEventManager();
    private final SheepDyeWoolListener.SheepDyeWoolEventManager sheepDyeWoolEventManager = new SheepDyeWoolListener.SheepDyeWoolEventManager();
    private final SheepRegrowWoolListener.SheepRegrowWoolEventManager sheepRegrowWoolEventManager = new SheepRegrowWoolListener.SheepRegrowWoolEventManager();
    private final SlimeSplitListener.SlimeSplitEventManager slimeSplitEventManager = new SlimeSplitListener.SlimeSplitEventManager();
    private final SpawnerSpawnListener.SpawnerSpawnEventManager spawnerSpawnEventManager = new SpawnerSpawnListener.SpawnerSpawnEventManager();
    private final StriderTemperatureChangeListener.StriderTemperatureChangeEventManager striderTemperatureChangeEventManager = new StriderTemperatureChangeListener.StriderTemperatureChangeEventManager();
    private final VillagerAcquireTradeListener.VillagerAcquireTradeEventManager villagerAcquireTradeEventManager = new VillagerAcquireTradeListener.VillagerAcquireTradeEventManager();
    private final VillagerCareerChangeListener.VillagerCareerChangeEventManager villagerCareerChangeEventManager = new VillagerCareerChangeListener.VillagerCareerChangeEventManager();
    private final VillagerReplenishTradeListener.VillagerReplenishTradeEventManager villagerReplenishTradeEventManager = new VillagerReplenishTradeListener.VillagerReplenishTradeEventManager();

    // Hanging Events
    private final HangingBreakByEntityListener.HangingBreakByEntityEventManager hangingBreakByEntityEventManager = new HangingBreakByEntityListener.HangingBreakByEntityEventManager();
    private final HangingBreakListener.HangingBreakEventManager hangingBreakEventManager = new HangingBreakListener.HangingBreakEventManager();
    private final HangingListener.HangingEventManager hangingEventManager = new HangingListener.HangingEventManager();
    private final HangingPlaceListener.HangingPlaceEventManager hangingPlaceEventManager = new HangingPlaceListener.HangingPlaceEventManager();

    // Inventory Events
    private final BrewingStandFuelListener.BrewingStandFuelEventManager brewingStandFuelEventManager = new BrewingStandFuelListener.BrewingStandFuelEventManager();
    private final BrewListener.BrewEventManager brewEventManager = new BrewListener.BrewEventManager();
    private final CraftItemListener.CraftItemEventManager craftItemEventManager = new CraftItemListener.CraftItemEventManager();
    private final FurnaceBurnListener.FurnaceBurnEventManager furnaceBurnEventManager = new FurnaceBurnListener.FurnaceBurnEventManager();
    private final FurnaceExtractListener.FurnaceExtractEventManager furnaceExtractEventManager = new FurnaceExtractListener.FurnaceExtractEventManager();
    private final FurnaceSmeltListener.FurnaceSmeltEventManager furnaceSmeltEventManager = new FurnaceSmeltListener.FurnaceSmeltEventManager();
    private final FurnaceStartSmeltListener.FurnaceStartSmeltEventManager furnaceStartSmeltEventManager = new FurnaceStartSmeltListener.FurnaceStartSmeltEventManager();
    private final InventoryClickListener.InventoryClickEventManager inventoryClickEventManager = new InventoryClickListener.InventoryClickEventManager();
    private final InventoryCloseListener.InventoryCloseEventManager inventoryCloseEventManager = new InventoryCloseListener.InventoryCloseEventManager();
    private final InventoryCreativeListener.InventoryCreativeEventManager inventoryCreativeEventManager = new InventoryCreativeListener.InventoryCreativeEventManager();
    private final InventoryDragListener.InventoryDragEventManager inventoryDragEventManager = new InventoryDragListener.InventoryDragEventManager();
    private final InventoryInteractListener.InventoryInteractEventManager inventoryInteractEventManager = new InventoryInteractListener.InventoryInteractEventManager();
    private final InventoryListener.InventoryEventManager inventoryEventManager = new InventoryListener.InventoryEventManager();
    private final InventoryMoveItemListener.InventoryMoveItemEventManager inventoryMoveItemEventManager = new InventoryMoveItemListener.InventoryMoveItemEventManager();
    private final InventoryOpenListener.InventoryOpenEventManager inventoryOpenEventManager = new InventoryOpenListener.InventoryOpenEventManager();
    private final InventoryPickupItemListener.InventoryPickupItemEventManager inventoryPickupItemEventManager = new InventoryPickupItemListener.InventoryPickupItemEventManager();
    private final PrepareAnvilListener.PrepareAnvilEventManager prepareAnvilEventManager = new PrepareAnvilListener.PrepareAnvilEventManager();
    private final PrepareItemCraftListener.PrepareItemCraftEventManager prepareItemCraftEventManager = new PrepareItemCraftListener.PrepareItemCraftEventManager();
    private final PrepareSmithingListener.PrepareSmithingEventManager prepareSmithingEventManager = new PrepareSmithingListener.PrepareSmithingEventManager();
    private final SmithItemListener.SmithItemEventManager smithItemEventManager = new SmithItemListener.SmithItemEventManager();
    private final TradeSelectListener.TradeSelectEventManager tradeSelectEventManager = new TradeSelectListener.TradeSelectEventManager();

    // Player Events
    private final PlayerJoinListener.PlayerJoinEventManager playerJoinEventManager = new PlayerJoinListener.PlayerJoinEventManager();

    // Raid Events
    private final RaidListener.RaidEventManager raidEventManager = new RaidListener.RaidEventManager();
    private final RaidFinishListener.RaidFinishEventManager raidFinishEventManager = new RaidFinishListener.RaidFinishEventManager();
    private final RaidSpawnWaveListener.RaidSpawnWaveEventManager raidSpawnWaveEventManager = new RaidSpawnWaveListener.RaidSpawnWaveEventManager();
    private final RaidStopListener.RaidStopEventManager raidStopEventManager = new RaidStopListener.RaidStopEventManager();
    private final RaidTriggerListener.RaidTriggerEventManager raidTriggerEventManager = new RaidTriggerListener.RaidTriggerEventManager();

    // Server Events
    private final BroadcastMessageListener.BroadcastMessageEventManager broadcastMessageEventManager = new BroadcastMessageListener.BroadcastMessageEventManager();
    private final MapInitializeListener.MapInitializeEventManager mapInitializeEventManager = new MapInitializeListener.MapInitializeEventManager();
    private final PluginDisableListener.PluginDisableEventManager pluginDisableEventManager = new PluginDisableListener.PluginDisableEventManager();
    private final PluginEnableListener.PluginEnableEventManager pluginEnableEventManager = new PluginEnableListener.PluginEnableEventManager();
    private final PluginListener.PluginEventManager pluginEventManager = new PluginListener.PluginEventManager();
    private final RemoteServerCommandListener.RemoteServerCommandEventManager remoteServerCommandEventManager = new RemoteServerCommandListener.RemoteServerCommandEventManager();
    private final ServerCommandListener.ServerCommandEventManager serverCommandEventManager = new ServerCommandListener.ServerCommandEventManager();
    private final ServerListener.ServerEventManager serverEventManager = new ServerListener.ServerEventManager();
    private final ServerListPingListener.ServerListPingEventManager serverListPingEventManager = new ServerListPingListener.ServerListPingEventManager();
    private final ServerLoadListener.ServerLoadEventManager serverLoadEventManager = new ServerLoadListener.ServerLoadEventManager();
    private final ServiceListener.ServiceEventManager serviceEventManager = new ServiceListener.ServiceEventManager();
    private final ServiceRegisterListener.ServiceRegisterEventManager serviceRegisterEventManager = new ServiceRegisterListener.ServiceRegisterEventManager();
    private final ServiceUnregisterListener.ServiceUnregisterEventManager serviceUnregisterEventManager = new ServiceUnregisterListener.ServiceUnregisterEventManager();
    private final TabCompleteListener.TabCompleteEventManager tabCompleteEventManager = new TabCompleteListener.TabCompleteEventManager();

    // Vehicle Events
    private final VehicleBlockCollisionListener.VehicleBlockCollisionEventManager vehicleBlockCollisionEventManager = new VehicleBlockCollisionListener.VehicleBlockCollisionEventManager();
    private final VehicleCollisionListener.VehicleCollisionEventManager vehicleCollisionEventManager = new VehicleCollisionListener.VehicleCollisionEventManager();
    private final VehicleCreateListener.VehicleCreateEventManager vehicleCreateEventManager = new VehicleCreateListener.VehicleCreateEventManager();
    private final VehicleDamageListener.VehicleDamageEventManager vehicleDamageEventManager = new VehicleDamageListener.VehicleDamageEventManager();
    private final VehicleDestroyListener.VehicleDestroyEventManager vehicleDestroyEventManager = new VehicleDestroyListener.VehicleDestroyEventManager();
    private final VehicleEnterListener.VehicleEnterEventManager vehicleEnterEventManager = new VehicleEnterListener.VehicleEnterEventManager();
    private final VehicleEntityCollisionListener.VehicleEntityCollisionEventManager vehicleEntityCollisionEventManager = new VehicleEntityCollisionListener.VehicleEntityCollisionEventManager();
    private final VehicleListener.VehicleEventManager vehicleEventManager = new VehicleListener.VehicleEventManager();
    private final VehicleExitListener.VehicleExitEventManager vehicleExitEventManager = new VehicleExitListener.VehicleExitEventManager();
    private final VehicleMoveListener.VehicleMoveEventManager vehicleMoveEventManager = new VehicleMoveListener.VehicleMoveEventManager();
    private final VehicleUpdateListener.VehicleUpdateEventManager vehicleUpdateEventManager = new VehicleUpdateListener.VehicleUpdateEventManager();

    // Weather Events
    private final LightningStrikeListener.LightningStrikeEventManager lightningStrikeEventManager = new LightningStrikeListener.LightningStrikeEventManager();
    private final ThunderChangeListener.ThunderChangeEventManager thunderChangeEventManager = new ThunderChangeListener.ThunderChangeEventManager();
    private final WeatherChangeListener.WeatherChangeEventManager weatherChangeEventManager = new WeatherChangeListener.WeatherChangeEventManager();
    private final WeatherListener.WeatherEventManager weatherEventManager = new WeatherListener.WeatherEventManager();

    public LambdaEvents() {
        super("Lambda", 1, "FlorianMichael", "Tjorven-Liebe");
    }

    private void registerListener(final Listener listener) {
        this.bukkitServer().getPluginManager().registerEvents(listener, SpigotPluginWrapper.instance());
    }

    // Block Events
    public void invokeBlockBreakListener(final BlockBreakListener listener) {
        if (this.blockBreakEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockBreakEventManager);

        this.blockBreakEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockBurnListener(final BlockBurnListener listener) {
        if (this.blockBurnEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockBurnEventManager);

        this.blockBurnEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockCanBuildListener(final BlockCanBuildListener listener) {
        if (this.blockCanBuildEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockCanBuildEventManager);

        this.blockCanBuildEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockCookEventListener(final BlockCookListener listener) {
        if (this.blockCookEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockCookEventManager);

        this.blockCookEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockDamageAbortListener(final BlockDamageAbortListener listener) {
        if (this.blockDamageAbortEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockDamageAbortEventManager);

        this.blockDamageAbortEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockDamageListener(final BlockDamageListener listener) {
        if (this.blockDamageAbortEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockDamageEventManager);

        this.blockDamageEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockDispenseArmorListener(final BlockDispenseArmorListener listener) {
        if (this.blockDispenseArmorEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockDispenseArmorEventManager);

        this.blockDispenseArmorEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockDispenseListener(final BlockDispenseListener listener) {
        if (this.blockDispenseEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockDispenseEventManager);

        this.blockDispenseEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockDropItemListener(final BlockDropItemListener listener) {
        if (this.blockDropItemManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockDropItemManager);

        this.blockDropItemManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockExpListener(final BlockExpListener listener) {
        if (this.blockExpEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockExpEventManager);

        this.blockExpEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockExplodeListener(final BlockExplodeListener listener) {
        if (this.blockExplodeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockExplodeEventManager);

        this.blockExplodeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockFadeListener(final BlockFadeListener listener) {
        if (this.blockFadeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockFadeEventManager);

        this.blockFadeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockFertilize(final BlockFertilizeListener listener) {
        if (this.blockFertilizeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockFertilizeEventManager);

        this.blockFertilizeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockFormListener(final BlockFormListener listener) {
        if (this.blockFormEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockFormEventManager);

        this.blockFormEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockFromToListener(final BlockFromToListener listener) {
        if (this.blockFromToEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockFromToEventManager);

        this.blockFromToEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockGrowListener(final BlockGrowListener listener) {
        if (this.blockGrowEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockGrowEventManager);

        this.blockGrowEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockIgniteListener(final BlockIgniteListener listener) {
        if (this.blockIgniteEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockIgniteEventManager);

        this.blockIgniteEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockListener(final BlockListener listener) {
        if (this.blockEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockEventManager);

        this.blockEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockMultiPlaceListener(final BlockMultiPlaceListener listener) {
        if (this.blockMultiPlaceEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockMultiPlaceEventManager);

        this.blockMultiPlaceEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockPhysicsListener(final BlockPhysicsListener listener) {
        if (this.blockPhysicsEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockPhysicsEventManager);

        this.blockPhysicsEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockPistonExtendListener(final BlockPistonExtendListener listener) {
        if (this.blockPistonEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockPistonEventManager);

        this.blockPistonExtendEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockPistonRetractListener(final BlockPistonRetractListener listener) {
        if (this.blockPistonRetractEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockPistonEventManager);

        this.blockPistonRetractEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockPistonListener(final BlockPistonListener listener) {
        if (this.blockPistonEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockPistonEventManager);

        this.blockPistonEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockPlaceListener(final BlockPlaceListener listener) {
        if (this.blockPlaceEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockPlaceEventManager);

        this.blockPlaceEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockReceiveGameListener(final BlockReceiveGameListener listener) {
        if (this.blockReceiveGameEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockReceiveGameEventManager);

        this.blockReceiveGameEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockRedstoneListener(final BlockRedstoneListener listener) {
        if (this.blockRedstoneEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockRedstoneEventManager);

        this.blockRedstoneEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockShearEntityListener(final BlockShearEntityListener listener) {
        if (this.blockShearEntityEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockShearEntityEventManager);

        this.blockShearEntityEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBlockSpreadListener(final BlockSpreadListener listener) {
        if (this.blockSpreadEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.blockSpreadEventManager);

        this.blockSpreadEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeCauldronLevelChangeListener(final CauldronLevelChangeListener listener) {
        if (this.cauldronLevelChangeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.cauldronLevelChangeEventManager);

        this.cauldronLevelChangeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityBlockFormListener(final EntityBlockFormListener listener) {
        if (this.entityBlockFormEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityBlockFormEventManager);

        this.entityBlockFormEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeFluidLevelChangeListener(final FluidLevelChangeListener listener) {
        if (this.fluidLevelChangeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.fluidLevelChangeEventManager);

        this.fluidLevelChangeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeLeavesDecayListener(final LeavesDecayListener listener) {
        if (this.leavesDecayEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.leavesDecayEventManager);

        this.leavesDecayEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeMoistureChangeListener(final MoistureChangeListener listener) {
        if (this.moistureChangeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.moistureChangeEventManager);

        this.moistureChangeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeNotePlayListener(final NotePlayListener listener) {
        if (this.notePlayEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.notePlayEventManager);

        this.notePlayEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeSignChangeListener(final SignChangeListener listener) {
        if (this.signChangeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.signChangeEventManager);

        this.signChangeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeSpongeAbsorbListener(final SpongeAbsorbListener listener) {
        if (this.spongeAbsorbEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.spongeAbsorbEventManager);

        this.spongeAbsorbEventManager.EVENT_INVOKES.add(listener);
    }

    // Enchantment Event
    public void invokeEnchantItemListener(final EnchantItemListener listener) {
        if (this.enchantItemEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.enchantItemEventManager);

        this.enchantItemEventManager.EVENT_INVOKES.add(listener);
    }

    // Entity Events
    public void invokeAreaEffectCloudApplyListener(final AreaEffectCloudApplyListener listener) {
        if (this.areaEffectCloudApplyEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.areaEffectCloudApplyEventManager);

        this.areaEffectCloudApplyEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeArrowBodyCountChangeListener(final ArrowBodyCountChangeListener listener) {
        if (this.arrowBodyCountChangeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.arrowBodyCountChangeEventManager);

        this.arrowBodyCountChangeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBatToggleSleepListener(final BatToggleSleepListener listener) {
        if (this.batToggleSleepEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.batToggleSleepEventManager);

        this.batToggleSleepEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeCreatureSpawnListener(final CreatureSpawnListener listener) {
        if (this.creatureSpawnEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.creatureSpawnEventManager);

        this.creatureSpawnEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeCreeperPowerListener(final CreeperPowerListener listener) {
        if (this.creeperPowerEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.creeperPowerEventManager);

        this.creeperPowerEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEnderDragonChangePhaseListener(final EnderDragonChangePhaseListener listener) {
        if (this.enderDragonChangePhaseEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.enderDragonChangePhaseEventManager);

        this.enderDragonChangePhaseEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityAirChangeListener(final EntityAirChangeListener listener) {
        if (this.entityAirChangeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityAirChangeEventManager);

        this.entityAirChangeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityBreakDoorListener(final EntityBreakDoorListener listener) {
        if (this.entityBreakDoorEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityBreakDoorEventManager);

        this.entityBreakDoorEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityBreedListener(final EntityBreedListener listener) {
        if (this.entityBreedEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityBreedEventManager);

        this.entityBreedEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityChangeBlockListener(final EntityChangeBlockListener listener) {
        if (this.entityChangeBlockEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityChangeBlockEventManager);

        this.entityChangeBlockEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityCombustByBlockListener(final EntityCombustByBlockListener listener) {
        if (this.entityCombustByBlockEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityCombustByBlockEventManager);

        this.entityCombustByBlockEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityCombustByEntityListener(final EntityCombustByEntityListener listener) {
        if (this.entityCombustByEntityEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityCombustByEntityEventManager);

        this.entityCombustByEntityEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityCombustListener(final EntityCombustListener listener) {
        if (this.entityCombustEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityCombustEventManager);

        this.entityCombustEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityCreatePortalListener(final EntityCreatePortalListener listener) {
        if (this.entityCreatePortalEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityCreatePortalEventManager);

        this.entityCreatePortalEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityDamageByBlockListener(final EntityDamageByBlockListener listener) {
        if (this.entityDamageByBlockEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityDamageByBlockEventManager);

        this.entityDamageByBlockEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityDamageByEntityListener(final EntityDamageByEntityListener listener) {
        if (this.entityDamageByEntityEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityDamageByEntityEventManager);

        this.entityDamageByEntityEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityDamageListener(final EntityDamageListener listener) {
        if (this.entityDamageEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityDamageEventManager);

        this.entityDamageEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityDeathListener(final EntityDeathListener listener) {
        if (this.entityDeathEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityDeathEventManager);

        this.entityDeathEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityDropItemListener(final EntityDropItemListener listener) {
        if (this.entityDropItemEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityDropItemEventManager);

        this.entityDropItemEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityEnterBlockListener(final EntityEnterBlockListener listener) {
        if (this.entityEnterBlockEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityEnterBlockEventManager);

        this.entityEnterBlockEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityEnterLoveModeListener(final EntityEnterLoveModeListener listener) {
        if (this.entityEnterLoveModeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityEnterLoveModeEventManager);

        this.entityEnterLoveModeEventManager.EVENT_INVOKES.add(listener);
    }


    public void invokeEntityExhaustionListener(final EntityExhaustionListener listener) {
        if (this.entityExhaustionEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityExhaustionEventManager);

        this.entityExhaustionEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityExplodeListener(final EntityExplodeListener listener) {
        if (this.entityExplodeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityExplodeEventManager);

        this.entityExplodeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityInteractListener(final EntityInteractListener listener) {
        if (this.entityInteractEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityInteractEventManager);

        this.entityInteractEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityListener(final EntityListener listener) {
        if (this.entityEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityEventManager);

        this.entityEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityPickupItemListener(final EntityPickupItemListener listener) {
        if (this.entityPickupItemEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityPickupItemEventManager);

        this.entityPickupItemEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityPlaceListener(final EntityPlaceListener listener) {
        if (this.entityPlaceEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityPlaceEventManager);

        this.entityPlaceEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityPortalEnterListener(final EntityPortalEnterListener listener) {
        if (this.entityPortalEnterEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityPortalEnterEventManager);

        this.entityPortalEnterEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityPortalExitListener(final EntityPortalExitListener listener) {
        if (this.entityPortalExitEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityPortalExitEventManager);

        this.entityPortalExitEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityPortalListener(final EntityPortalListener listener) {
        if (this.entityPortalEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityPortalEventManager);

        this.entityPortalEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityPoseChangeListener(final EntityPoseChangeListener listener) {
        if (this.entityPoseChangeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityPoseChangeEventManager);

        this.entityPoseChangeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityPotionEffectListener(final EntityPotionEffectListener listener) {
        if (this.entityPotionEffectEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityPotionEffectEventManager);

        this.entityPotionEffectEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityRegainHealthListener(final EntityRegainHealthListener listener) {
        if (this.entityRegainHealthEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityRegainHealthEventManager);

        this.entityRegainHealthEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityResurrectListener(final EntityResurrectListener listener) {
        if (this.entityResurrectEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityResurrectEventManager);

        this.entityResurrectEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityShootBowListener(final EntityShootBowListener listener) {
        if (this.entityShootBowEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityShootBowEventManager);

        this.entityShootBowEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntitySpawnListener(final EntitySpawnListener listener) {
        if (this.entitySpawnEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entitySpawnEventManager);

        this.entitySpawnEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntitySpellCastListener(final EntitySpellCastListener listener) {
        if (this.entitySpellCastEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entitySpellCastEventManager);

        this.entitySpellCastEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityTameListener(final EntityTameListener listener) {
        if (this.entityTameEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityTameEventManager);

        this.entityTameEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityTargetListener(final EntityTargetListener listener) {
        if (this.entityTargetEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityTargetEventManager);

        this.entityTargetEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityTargetLivingEntityListener(final EntityTargetLivingEntityListener listener) {
        if (this.entityTargetLivingEntityEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityTargetLivingEntityEventManager);

        this.entityTargetLivingEntityEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityTeleportListener(final EntityTeleportListener listener) {
        if (this.entityTeleportEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityTeleportEventManager);

        this.entityTeleportEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityToggleGlideListener(final EntityToggleGlideListener listener) {
        if (this.entityToggleGlideEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityToggleGlideEventManager);

        this.entityToggleGlideEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityToggleSwimListener(final EntityToggleSwimListener listener) {
        if (this.entityToggleSwimEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityToggleSwimEventManager);

        this.entityToggleSwimEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityTransformListener(final EntityTransformListener listener) {
        if (this.entityTransformEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityTransformEventManager);

        this.entityTransformEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeEntityUnleashListener(final EntityUnleashListener listener) {
        if (this.entityUnleashEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.entityUnleashEventManager);

        this.entityUnleashEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeExpBottleListener(final ExpBottleListener listener) {
        if (this.expBottleEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.expBottleEventManager);

        this.expBottleEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeExplosionPrimeListener(final ExplosionPrimeListener listener) {
        if (this.explosionPrimeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.explosionPrimeEventManager);

        this.explosionPrimeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeFireworkExplodeListener(final FireworkExplodeListener listener) {
        if (this.fireworkExplodeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.fireworkExplodeEventManager);

        this.fireworkExplodeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeFoodLevelChangeListener(final FoodLevelChangeListener listener) {
        if (this.foodLevelChangeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.foodLevelChangeEventManager);

        this.foodLevelChangeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeHorseJumpListener(final HorseJumpListener listener) {
        if (this.horseJumpEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.horseJumpEventManager);

        this.horseJumpEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeItemDespawnListener(final ItemDespawnListener listener) {
        if (this.itemDespawnEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.itemDespawnEventManager);

        this.itemDespawnEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeItemMergeListener(final ItemMergeListener listener) {
        if (this.itemMergeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.itemMergeEventManager);

        this.itemMergeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeItemSpawnListener(final ItemSpawnListener listener) {
        if (this.itemSpawnEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.itemSpawnEventManager);

        this.itemSpawnEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeLingeringPotionSplashListener(final LingeringPotionSplashListener listener) {
        if (this.lingeringPotionSplashEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.lingeringPotionSplashEventManager);

        this.lingeringPotionSplashEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePiglinBarterListener(final PiglinBarterListener listener) {
        if (this.piglinBarterEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.piglinBarterEventManager);

        this.piglinBarterEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePigZapListener(final PigZapListener listener) {
        if (this.pigZapEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.pigZapEventManager);

        this.pigZapEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePigZombieAngerListener(final PigZombieAngerListener listener) {
        if (this.pigZombieAngerEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.pigZombieAngerEventManager);

        this.pigZombieAngerEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePlayerDeathListener(final PlayerDeathListener listener) {
        if (this.playerDeathEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.playerDeathEventManager);

        this.playerDeathEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePlayerLeashEntityListener(final PlayerLeashEntityListener listener) {
        if (this.playerLeashEntityEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.playerLeashEntityEventManager);

        this.playerLeashEntityEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePotionSplashListener(final PotionSplashListener listener) {
        if (this.potionSplashEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.potionSplashEventManager);

        this.potionSplashEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeProjectileHitListener(final ProjectileHitListener listener) {
        if (this.projectileHitEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.projectileHitEventManager);

        this.projectileHitEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeProjectileLaunchListener(final ProjectileLaunchListener listener) {
        if (this.projectileLaunchEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.projectileLaunchEventManager);

        this.projectileLaunchEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeSheepDyeWoolListener(final SheepDyeWoolListener listener) {
        if (this.sheepDyeWoolEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.sheepDyeWoolEventManager);

        this.sheepDyeWoolEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeSheepRegrowWoolListener(final SheepRegrowWoolListener listener) {
        if (this.sheepRegrowWoolEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.sheepRegrowWoolEventManager);

        this.sheepRegrowWoolEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeSlimeSplitListener(final SlimeSplitListener listener) {
        if (this.slimeSplitEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.slimeSplitEventManager);

        this.slimeSplitEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeSpawnerSpawnListener(final SpawnerSpawnListener listener) {
        if (this.spawnerSpawnEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.spawnerSpawnEventManager);

        this.spawnerSpawnEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeStriderTemperatureChangeListener(final StriderTemperatureChangeListener listener) {
        if (this.striderTemperatureChangeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.striderTemperatureChangeEventManager);

        this.striderTemperatureChangeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVillagerAcquireTradeListener(final VillagerAcquireTradeListener listener) {
        if (this.villagerAcquireTradeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.villagerAcquireTradeEventManager);

        this.villagerAcquireTradeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVillagerCareerChangeListener(final VillagerCareerChangeListener listener) {
        if (this.villagerCareerChangeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.villagerCareerChangeEventManager);

        this.villagerCareerChangeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVillagerReplenishTradeListener(final VillagerReplenishTradeListener listener) {
        if (this.villagerReplenishTradeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.villagerReplenishTradeEventManager);

        this.villagerReplenishTradeEventManager.EVENT_INVOKES.add(listener);
    }

    // Hanging Events
    public void invokeHangingBreakByEntityListener(final HangingBreakByEntityListener listener) {
        if (this.hangingBreakByEntityEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.hangingBreakByEntityEventManager);

        this.hangingBreakByEntityEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeHangingBreakListener(final HangingBreakListener listener) {
        if (this.hangingBreakEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.hangingBreakEventManager);

        this.hangingBreakEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeHangingListener(final HangingListener listener) {
        if (this.hangingEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.hangingEventManager);

        this.hangingEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeHangingPlaceListener(final HangingPlaceListener listener) {
        if (this.hangingPlaceEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.hangingPlaceEventManager);

        this.hangingPlaceEventManager.EVENT_INVOKES.add(listener);
    }

    // Inventory Events
    public void invokeBrewingStandFuelListener(final BrewingStandFuelListener listener) {
        if (this.brewingStandFuelEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.brewingStandFuelEventManager);

        this.brewingStandFuelEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeBrewListener(final BrewListener listener) {
        if (this.brewEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.brewEventManager);

        this.brewEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeCraftItemListener(final CraftItemListener listener) {
        if (this.craftItemEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.craftItemEventManager);

        this.craftItemEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeFurnaceBurnListener(final FurnaceBurnListener listener) {
        if (this.furnaceBurnEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.furnaceBurnEventManager);

        this.furnaceBurnEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeFurnaceExtractListener(final FurnaceExtractListener listener) {
        if (this.furnaceExtractEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.furnaceExtractEventManager);

        this.furnaceExtractEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeFurnaceSmeltListener(final FurnaceSmeltListener listener) {
        if (this.furnaceSmeltEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.furnaceSmeltEventManager);

        this.furnaceSmeltEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeFurnaceStartSmeltListener(final FurnaceStartSmeltListener listener) {
        if (this.furnaceStartSmeltEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.furnaceStartSmeltEventManager);

        this.furnaceStartSmeltEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeInventoryClickListener(final InventoryClickListener listener) {
        if (this.inventoryClickEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.inventoryClickEventManager);

        this.inventoryClickEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeInventoryCloseListener(final InventoryCloseListener listener) {
        if (this.inventoryCloseEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.inventoryCloseEventManager);

        this.inventoryCloseEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeInventoryCreativeListener(final InventoryCreativeListener listener) {
        if (this.inventoryCreativeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.inventoryCreativeEventManager);

        this.inventoryCreativeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeInventoryDragListener(final InventoryDragListener listener) {
        if (this.inventoryDragEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.inventoryDragEventManager);

        this.inventoryDragEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeInventoryInteractListener(final InventoryInteractListener listener) {
        if (this.inventoryInteractEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.inventoryInteractEventManager);

        this.inventoryInteractEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeInventoryListener(final InventoryListener listener) {
        if (this.inventoryEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.inventoryEventManager);

        this.inventoryEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeInventoryMoveItemListener(final InventoryMoveItemListener listener) {
        if (this.inventoryMoveItemEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.inventoryMoveItemEventManager);

        this.inventoryMoveItemEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeInventoryOpenListener(final InventoryOpenListener listener) {
        if (this.inventoryOpenEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.inventoryOpenEventManager);

        this.inventoryOpenEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeInventoryPickupItemListener(final InventoryPickupItemListener listener) {
        if (this.inventoryPickupItemEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.inventoryPickupItemEventManager);

        this.inventoryPickupItemEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePrepareAnvilListener(final PrepareAnvilListener listener) {
        if (this.prepareAnvilEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.prepareAnvilEventManager);

        this.prepareAnvilEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePrepareItemCraftListener(final PrepareItemCraftListener listener) {
        if (this.prepareItemCraftEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.prepareItemCraftEventManager);

        this.prepareItemCraftEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePrepareSmithingListener(final PrepareSmithingListener listener) {
        if (this.prepareSmithingEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.prepareSmithingEventManager);

        this.prepareSmithingEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeSmithItemListener(final SmithItemListener listener) {
        if (this.smithItemEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.smithItemEventManager);

        this.smithItemEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeTradeSelectListener(final TradeSelectListener listener) {
        if (this.tradeSelectEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.tradeSelectEventManager);

        this.tradeSelectEventManager.EVENT_INVOKES.add(listener);
    }

    // Player Events
    public void invokePlayerJoinListener(final PlayerJoinListener listener) {
        if (this.playerJoinEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.playerJoinEventManager);

        this.playerJoinEventManager.EVENT_INVOKES.add(listener);
    }

    // Raid Events
    public void invokeRaidListener(final RaidListener listener) {
        if (this.raidEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.raidEventManager);

        this.raidEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeRaidFinishListener(final RaidFinishListener listener) {
        if (this.raidFinishEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.raidFinishEventManager);

        this.raidFinishEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeRaidSpawnWaveListener(final RaidSpawnWaveListener listener) {
        if (this.raidSpawnWaveEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.raidSpawnWaveEventManager);

        this.raidSpawnWaveEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeRaidStopListener(final RaidStopListener listener) {
        if (this.raidStopEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.raidStopEventManager);

        this.raidStopEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeRaidTriggerListener(final RaidTriggerListener listener) {
        if (this.raidTriggerEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.raidTriggerEventManager);

        this.raidTriggerEventManager.EVENT_INVOKES.add(listener);
    }

    // Server Events
    public void invokeBroadcastMessageListener(final BroadcastMessageListener listener) {
        if (this.broadcastMessageEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.broadcastMessageEventManager);

        this.broadcastMessageEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeMapInitializeListener(final MapInitializeListener listener) {
        if (this.mapInitializeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.mapInitializeEventManager);

        this.mapInitializeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePluginDisableListener(final PluginDisableListener listener) {
        if (this.pluginDisableEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.pluginDisableEventManager);

        this.pluginDisableEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePluginEnableListener(final PluginEnableListener listener) {
        if (this.pluginEnableEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.pluginEnableEventManager);

        this.pluginEnableEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePluginListener(final PluginListener listener) {
        if (this.pluginEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.pluginEventManager);

        this.pluginEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeRemoteServerCommandListener(final RemoteServerCommandListener listener) {
        if (this.remoteServerCommandEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.remoteServerCommandEventManager);

        this.remoteServerCommandEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeServerCommandListener(final ServerCommandListener listener) {
        if (this.serverCommandEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.serverCommandEventManager);

        this.serverCommandEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeServerListener(final ServerListener listener) {
        if (this.serverEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.serverEventManager);

        this.serverEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeServerListPingListener(final ServerListPingListener listener) {
        if (this.serverListPingEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.serverListPingEventManager);

        this.serverListPingEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeServerLoadListener(final ServerLoadListener listener) {
        if (this.serverLoadEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.serverLoadEventManager);

        this.serverLoadEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeServiceListener(final ServiceListener listener) {
        if (this.serviceEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.serviceEventManager);

        this.serviceEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeServiceRegisterListener(final ServiceRegisterListener listener) {
        if (this.serviceRegisterEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.serviceRegisterEventManager);

        this.serviceRegisterEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeServiceUnregisterListener(final ServiceUnregisterListener listener) {
        if (this.serviceUnregisterEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.serviceUnregisterEventManager);

        this.serviceUnregisterEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeTabCompleteListener(final TabCompleteListener listener) {
        if (this.tabCompleteEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.tabCompleteEventManager);

        this.tabCompleteEventManager.EVENT_INVOKES.add(listener);
    }

    // Vehicle Events
    public void invokeVehicleBlockCollisionListener(final VehicleBlockCollisionListener listener) {
        if (this.vehicleBlockCollisionEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.vehicleBlockCollisionEventManager);

        this.vehicleBlockCollisionEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVehicleCollisionListener(final VehicleCollisionListener listener) {
        if (this.vehicleCollisionEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.vehicleCollisionEventManager);

        this.vehicleCollisionEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVehicleCreateListener(final VehicleCreateListener listener) {
        if (this.vehicleCreateEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.vehicleCreateEventManager);

        this.vehicleCreateEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVehicleDamageListener(final VehicleDamageListener listener) {
        if (this.vehicleDamageEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.vehicleDamageEventManager);

        this.vehicleDamageEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVehicleDestroyListener(final VehicleDestroyListener listener) {
        if (this.vehicleDestroyEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.vehicleDestroyEventManager);

        this.vehicleDestroyEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVehicleEnterListener(final VehicleEnterListener listener) {
        if (this.vehicleEnterEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.vehicleEnterEventManager);

        this.vehicleEnterEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVehicleEntityCollisionListener(final VehicleEntityCollisionListener listener) {
        if (this.vehicleEntityCollisionEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.vehicleEntityCollisionEventManager);

        this.vehicleEntityCollisionEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVehicleListener(final VehicleListener listener) {
        if (this.vehicleEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.vehicleEventManager);

        this.vehicleEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVehicleExitListener(final VehicleExitListener listener) {
        if (this.vehicleExitEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.vehicleExitEventManager);

        this.vehicleExitEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVehicleMoveListener(final VehicleMoveListener listener) {
        if (this.vehicleMoveEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.vehicleMoveEventManager);

        this.vehicleMoveEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeVehicleUpdateListener(final VehicleUpdateListener listener) {
        if (this.vehicleUpdateEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.vehicleUpdateEventManager);

        this.vehicleUpdateEventManager.EVENT_INVOKES.add(listener);
    }

    // Weather Events
    public void invokeLightningStrikeListener(final LightningStrikeListener listener) {
        if (this.lightningStrikeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.lightningStrikeEventManager);

        this.lightningStrikeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeThunderChangeListener(final ThunderChangeListener listener) {
        if (this.thunderChangeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.thunderChangeEventManager);

        this.thunderChangeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeWeatherChangeListener(final WeatherChangeListener listener) {
        if (this.weatherChangeEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.weatherChangeEventManager);

        this.weatherChangeEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokeWeatherListener(final WeatherListener listener) {
        if (this.weatherEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.weatherEventManager);

        this.weatherEventManager.EVENT_INVOKES.add(listener);
    }
}
