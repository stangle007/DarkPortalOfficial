
package net.mcreator.darkportaltools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;

import net.mcreator.darkportaltools.DarkPortalToolsModElements;

@DarkPortalToolsModElements.ModElement.Tag
public class ArtisianHoeItem extends DarkPortalToolsModElements.ModElement {
	@ObjectHolder("dark_portal_tools:artisian_hoe")
	public static final Item block = null;
	public ArtisianHoeItem(DarkPortalToolsModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 2031;
			}

			public float getEfficiency() {
				return 12f;
			}

			public float getAttackDamage() {
				return -1f;
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
		}, 0f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("artisian_hoe"));
	}
}
