package tk.asm2n8.hello_world;

import net.minecraft.entity.EquipmentSlot;

public class PowerEnchantment extends net.minecraft.enchantment.PowerEnchantment {

    public PowerEnchantment(Weight enchantment$Weight_1, EquipmentSlot[] equipmentSlots_1) {
        super(enchantment$Weight_1, equipmentSlots_1);
    }

    @Override
    public int getMaximumLevel() {
        return 32767;
    }
}