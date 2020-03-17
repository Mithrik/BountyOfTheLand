package com.mithrik.botl.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BushBlock;
import net.minecraft.util.math.shapes.VoxelShape;

public class WildCropBlock extends BushBlock{
	
	protected static final VoxelShape SHAPE = Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D);

	protected WildCropBlock(Properties properties) {
		super(properties);
	}
}
