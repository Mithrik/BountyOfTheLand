package com.mithrik.botl.objects.blocks;

import com.mithrik.botl.objects.items.InitItems;

import net.minecraft.block.PotatoBlock;
import net.minecraft.util.IItemProvider;

public class CropPotatoes extends PotatoBlock{

	public CropPotatoes(Properties properties) {
		super(properties);
	}

	@Override
	protected IItemProvider getSeedsItem() {
		return InitItems.POTATO_SEEDS;
	}
}
