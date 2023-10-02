package net.ironman.whitewalkersmod.item;

import net.ironman.whitewalkersmod.Effect.ModEffects;
import net.ironman.whitewalkersmod.WhiteWalkersMod;
import net.ironman.whitewalkersmod.item.custom.FireSwordItem;
import net.ironman.whitewalkersmod.item.custom.IceStaffItem;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WhiteWalkersMod.MOD_ID);

    public static final RegistryObject<Item> VALYRIAN_STEEL_INGOT = ITEMS.register("valyrian_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_VALYRIAN_STEEL = ITEMS.register("raw_valyrian_steel",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> VALYRIAN_STEEL_SWORD = ITEMS.register("valyrian_steel_sword",
            () -> new SwordItem(ModToolTiers.VALYRIAN, 3, -2.4F, new Item.Properties()));
    public static final RegistryObject<Item> VALYRIAN_STEEL_AXE = ITEMS.register("valyrian_steel_axe",
            () -> new AxeItem(ModToolTiers.VALYRIAN, 5.0F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> VALYRIAN_STEEL_PICKAXE = ITEMS.register("valyrian_steel_pickaxe",
            () -> new PickaxeItem(ModToolTiers.VALYRIAN, 1, -2.8F, new Item.Properties()));
    public static final RegistryObject<Item> VALYRIAN_STEEL_SHOVEL = ITEMS.register("valyrian_steel_shovel",
            () -> new ShovelItem(ModToolTiers.VALYRIAN, 1.5F, -3.0F, new Item.Properties()));
    public static final RegistryObject<Item> VALYRIAN_STEEL_HOE = ITEMS.register("valyrian_steel_hoe",
            () -> new HoeItem(ModToolTiers.VALYRIAN, -3, 0.0F, new Item.Properties()));
    public static final RegistryObject<Item> VALYRIAN_STEEL_BATTLE_AXE = ITEMS.register("valyrian_steel_battle_axe",
            () -> new AxeItem(ModToolTiers.VALYRIAN, 6.0F, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> VALYRIAN_STEEL_DOUBLE_AXE = ITEMS.register("valyrian_steel_double_axe",
            () -> new AxeItem(ModToolTiers.VALYRIAN, 7.0F, -2.5F, new Item.Properties()));

    public static final RegistryObject<Item> WOODEN_BATTLE_AXE = ITEMS.register("wooden_battle_axe",
            () -> new AxeItem(Tiers.WOOD, 6.0F, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_DOUBLE_AXE = ITEMS.register("wooden_double_axe",
            () -> new AxeItem(Tiers.WOOD, 7.0F, -2.5F, new Item.Properties()));

    public static final RegistryObject<Item> STONE_BATTLE_AXE = ITEMS.register("stone_battle_axe",
            () -> new AxeItem(Tiers.STONE, 6.0F, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> STONE_DOUBLE_AXE = ITEMS.register("stone_double_axe",
            () -> new AxeItem(Tiers.STONE, 7.0F, -2.5F, new Item.Properties()));

    public static final RegistryObject<Item> IRON_BATTLE_AXE = ITEMS.register("iron_battle_axe",
            () -> new AxeItem(Tiers.IRON, 6.0F, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> IRON_DOUBLE_AXE = ITEMS.register("iron_double_axe",
            () -> new AxeItem(Tiers.IRON, 7.0F, -2.5F, new Item.Properties()));

    public static final RegistryObject<Item> GOLDEN_BATTLE_AXE = ITEMS.register("golden_battle_axe",
            () -> new AxeItem(Tiers.GOLD, 6.0F, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> GOLDEN_DOUBLE_AXE = ITEMS.register("golden_double_axe",
            () -> new AxeItem(Tiers.GOLD, 7.0F, -2.5F, new Item.Properties()));

    public static final RegistryObject<Item> DIAMOND_BATTLE_AXE = ITEMS.register("diamond_battle_axe",
            () -> new AxeItem(Tiers.DIAMOND, 6.0F, -2.0F, new Item.Properties()));
    public static final RegistryObject<Item> DIAMOND_DOUBLE_AXE = ITEMS.register("diamond_double_axe",
            () -> new AxeItem(Tiers.DIAMOND, 7.0F, -2.5F, new Item.Properties()));

    public static final RegistryObject<Item> NETHERITE_BATTLE_AXE = ITEMS.register("netherite_battle_axe",
            () -> new AxeItem(Tiers.NETHERITE, 6.0F, -2.0F, new Item.Properties().fireResistant()));
    public static final RegistryObject<Item> NETHERITE_DOUBLE_AXE = ITEMS.register("netherite_double_axe",
            () -> new AxeItem(Tiers.NETHERITE, 7.0F, -2.5F, new Item.Properties().fireResistant()));

    public static final RegistryObject<Item> LIGHTBRINGER = ITEMS.register("lightbringer",
            () -> new FireSwordItem(ModToolTiers.VALYRIAN, 3, -2.4F, new Item.Properties()));

    public static final RegistryObject<Item> DRAGONGLASS_DAGGER = ITEMS.register("dragonglass_dagger",
            () -> new SwordItem(ModToolTiers.DRAGONGLASS, 2, 0.0F, new Item.Properties()));

    public static final RegistryObject<Item> ICE_STAFF = ITEMS.register("ice_staff",
            () -> new IceStaffItem(new Item.Properties().defaultDurability(256)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
