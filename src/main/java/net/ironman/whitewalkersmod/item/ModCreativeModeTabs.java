package net.ironman.whitewalkersmod.item;

import net.ironman.whitewalkersmod.WhiteWalkersMod;
import net.ironman.whitewalkersmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, WhiteWalkersMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> WHITE_WALKERS_TAB = CREATIVE_MODE_TABS.register("white_walkers_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.VALYRIAN_STEEL_INGOT.get()))
                    .title(Component.translatable("creativetab.white_walkers_tab"))
                    .displayItems((Parameters, output) -> {
                        output.accept(ModItems.VALYRIAN_STEEL_INGOT.get());
                        output.accept(ModItems.RAW_VALYRIAN_STEEL.get());
                        output.accept(ModItems.VALYRIAN_STEEL_SWORD.get());
                        output.accept(ModItems.VALYRIAN_STEEL_PICKAXE.get());
                        output.accept(ModItems.VALYRIAN_STEEL_AXE.get());
                        output.accept(ModItems.VALYRIAN_STEEL_SHOVEL.get());
                        output.accept(ModItems.VALYRIAN_STEEL_HOE.get());
                        output.accept(ModItems.VALYRIAN_STEEL_BATTLE_AXE.get());
                        output.accept(ModItems.VALYRIAN_STEEL_DOUBLE_AXE.get());

                        output.accept(ModBlocks.VALYRIAN_STEEL_BLOCK.get());
                        output.accept(ModBlocks.RAW_VALYRIAN_STEEL_BLOCK.get());
                        output.accept(ModBlocks.VALYRIAN_STEEL_ORE.get());
                        output.accept(ModBlocks.DEEPSLATE_VALYRIAN_STEEL_ORE.get());
                        output.accept(ModBlocks.END_STONE_VALYRIAN_STEEL_ORE.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
