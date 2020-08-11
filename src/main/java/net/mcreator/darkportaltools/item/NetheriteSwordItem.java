
package net.mcreator.darkportaltools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.darkportaltools.DarkPortalToolsModElements;

@DarkPortalToolsModElements.ModElement.Tag
public class NetheriteSwordItem extends DarkPortalToolsModElements.ModElement {
	@ObjectHolder("dark_portal_tools:netherite_sword")
	public static final Item block = null;
	public NetheriteSwordItem(DarkPortalToolsModElements instance) {
		super(instance, 46);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.4f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("netherite_sword"));
	}
}
