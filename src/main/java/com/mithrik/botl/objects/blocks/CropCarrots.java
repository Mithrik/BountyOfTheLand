package com.mithrik.botl.objects.blocks;

import com.mithrik.botl.objects.items.InitItems;

import net.minecraft.block.CarrotBlock;
import net.minecraft.util.IItemProvider;

public class CropCarrots extends CarrotBlock{

	public CropCarrots(Properties properties) {
		super(properties);
	}

	@Override
	protected IItemProvider getSeedsItem() {
		return InitItems.CARROT_SEEDS;
	}
}
