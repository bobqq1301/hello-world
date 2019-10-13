package tk.asm2n8.hello_world;

import net.fabricmc.api.ModInitializer;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class HelloWorld implements ModInitializer {
	public static final Item DIAMOND_NUGGET = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		Registry.register(Registry.ENCHANTMENT, Registry.ENCHANTMENT.getRawId(Enchantments.POWER), "power",
				new PowerEnchantment(Enchantment.Weight.COMMON, new EquipmentSlot[] { EquipmentSlot.MAINHAND }));
		Registry.register(Registry.ENCHANTMENT, "asm2n8:frost", new FrostEnchantment(Enchantment.Weight.COMMON,
				EnchantmentTarget.WEAPON, new EquipmentSlot[] { EquipmentSlot.MAINHAND }));
		Registry.register(Registry.ITEM, new Identifier("asm2n8", "diamond_nugget"), DIAMOND_NUGGET);
	}
}
