package net.ironman.whitewalkersmod.item.custom;

import net.ironman.whitewalkersmod.Effect.ModEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class IceStaffItem extends Item {
    public IceStaffItem(Properties pProperties) {
        super(pProperties);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, Player player, Entity entity) {
        if(entity instanceof LivingEntity livingEntity) {
            livingEntity.addEffect(new MobEffectInstance(ModEffects.FREEZE.get(), 200));
            livingEntity.canDisableShield();
        }

        return super.onLeftClickEntity(stack, player, entity);
    }

    @Override
    public boolean isDamageable(ItemStack stack) {
        return true;
    }
}
