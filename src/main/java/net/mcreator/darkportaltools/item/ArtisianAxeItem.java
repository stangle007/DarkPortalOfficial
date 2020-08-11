
package net.mcreator.darkportaltools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.darkportaltools.DarkPortalToolsModElements;

@DarkPortalToolsModElements.ModElement.Tag
public class ArtisianAxeItem extends DarkPortalToolsModElements.ModElement {
	@ObjectHolder("dark_portal_tools:artisian_axe")
	public static final Item block = null;
	public ArtisianAxeItem(DarkPortalToolsModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 6;
			}

			public int getEnchantability() {
				return 42;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("artisian_axe"));
	}
}
