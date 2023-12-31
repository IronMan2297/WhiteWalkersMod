package net.ironman.whitewalkersmod;

import com.mojang.logging.LogUtils;
import net.ironman.whitewalkersmod.Effect.ModEffects;
import net.ironman.whitewalkersmod.block.ModBlocks;
import net.ironman.whitewalkersmod.item.ModCreativeModeTabs;
import net.ironman.whitewalkersmod.item.ModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(WhiteWalkersMod.MOD_ID)
public class WhiteWalkersMod {
    public static final String MOD_ID = "whitewalkersmod";
    public static final Logger LOGGER = LogUtils.getLogger();

    public WhiteWalkersMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        ModEffects.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        MinecraftForge.EVENT_BUS.register(this);
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ModItems.WOODEN_BATTLE_AXE);
            event.accept(ModItems.WOODEN_DOUBLE_AXE);
            event.accept(ModItems.STONE_BATTLE_AXE);
            event.accept(ModItems.STONE_DOUBLE_AXE);
            event.accept(ModItems.IRON_BATTLE_AXE);
            event.accept(ModItems.IRON_DOUBLE_AXE);
            event.accept(ModItems.GOLDEN_BATTLE_AXE);
            event.accept(ModItems.GOLDEN_DOUBLE_AXE);
            event.accept(ModItems.DIAMOND_BATTLE_AXE);
            event.accept(ModItems.DIAMOND_DOUBLE_AXE);
            event.accept(ModItems.NETHERITE_BATTLE_AXE);
            event.accept(ModItems.NETHERITE_DOUBLE_AXE);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
