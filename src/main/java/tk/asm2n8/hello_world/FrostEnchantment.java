package tk.asm2n8.hello_world;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FrostEnchantment extends Enchantment {

    public FrostEnchantment(Weight enchantment$Weight_1, EnchantmentTarget enchantmentTarget_1,
            EquipmentSlot[] equipmentSlots_1) {
        super(enchantment$Weight_1, enchantmentTarget_1, equipmentSlots_1);
    }

    @Override
    public int getMinimumPower(int int_1) {
        return 1 + int_1;
    }

    @Override
    public int getMaximumPower(int int_1) {
        return 1 + this.getMinimumPower(int_1);
    }

    @Override
    public int getMaximumLevel() {
        return 32767;
    }

    @Override
    public void onTargetDamaged(LivingEntity user, Entity target, int level) {
        if (target instanceof LivingEntity) {
            ((LivingEntity) target)
                    .addPotionEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 20 * 2 * level, level - 1));
        }

        super.onTargetDamaged(user, target, level);
    }
}