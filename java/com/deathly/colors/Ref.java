package com.deathly.colors;

import com.deathly.colors.Items.ModItems;
import com.deathly.colors.blocks.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

/**
 * Created by Deathly
 */

public class Ref {

	public static final String
			modid = "colors",
            modname = "Colors",
            version = "1.0.0";

	public static final CreativeTabs colorstab = new CreativeTabs("colorstab") {
		@Override public ItemStack getTabIconItem() {
			return new ItemStack(ModBlocks.rainbowblock);
		}
	};
}
