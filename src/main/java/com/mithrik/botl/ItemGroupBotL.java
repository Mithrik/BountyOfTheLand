package com.mithrik.botl;

import com.mithrik.botl.objects.blocks.InitBlocks;
import com.mithrik.botl.objects.items.InitItems;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ItemGroupBotL {
	public static final ItemGroup BOTL_BLOCKS = new ItemGroup("botl_blocks") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(InitBlocks.WILD_CARROTS);
		};
	};
	
	public static final ItemGroup BOTL_ITEMS = new ItemGroup("botl_items") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(InitItems.CORN);
		};
	};
}
