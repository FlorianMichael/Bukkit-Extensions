package de.florianmichael.bukkitextensions.lambda_events_v1;

import de.florianmichael.bukkitextensions.base.BukkitExtensionBase;
import de.florianmichael.bukkitextensions.lambda_events_v1.block.*;
import de.florianmichael.bukkitextensions.lambda_events_v1.entity.*;
import de.florianmichael.bukkitextensions.lambda_events_v1.player.PlayerJoinListener;
import de.florianmichael.bukkitextensions.spigot.SpigotPluginWrapper;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.LingeringPotionSplashEvent;

import java.lang.reflect.Field;

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

    // Enchant Event
    private final EnchantItemListener.EnchantItemEventManager enchantItemEventManager = new EnchantItemListener.EnchantItemEventManager();

    // Player Events
    private final PlayerJoinListener.PlayerJoinEventManager playerJoinEventManager = new PlayerJoinListener.PlayerJoinEventManager();

    public LambdaEvents() {
        super("Lambda", 1, "FlorianMichael", "Tjorven-Liebe");
    }


    private void registerListener(final Listener listener) {
        this.bukkitServer().getPluginManager().registerEvents(listener, SpigotPluginWrapper.instance());
    }

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

    public void invokeEnchantItemListener(final EnchantItemListener listener) {
        if (this.enchantItemEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.enchantItemEventManager);

        this.enchantItemEventManager.EVENT_INVOKES.add(listener);
    }

    public void invokePlayerJoinListener(final PlayerJoinListener listener) {
        if (this.playerJoinEventManager.EVENT_INVOKES.isEmpty())
            this.registerListener(this.playerJoinEventManager);

        this.playerJoinEventManager.EVENT_INVOKES.add(listener);
    }
}
