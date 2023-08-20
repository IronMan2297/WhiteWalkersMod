package net.ironman.whitewalkersmod.item;

import net.ironman.whitewalkersmod.WhiteWalkersMod;
import net.ironman.whitewalkersmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers{
        public static final Tier VALYRIAN = TierSortingRegistry.registerTier(
                new ForgeTier(4, 1800, 8.5f, 3.5f, 22,
                        ModTags.Blocks.NEEDS_VALYRIAN_TOOL, () -> Ingredient.of(ModItems.VALYRIAN_STEEL_INGOT.get())),
                new ResourceLocation(WhiteWalkersMod.MOD_ID, "valyrian_steel_ingot"), List.of(Tiers.DIAMOND), List.of());
}
