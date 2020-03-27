package com.mithrik.botl.objects.blocks;

import com.mithrik.botl.objects.items.InitItems;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

/*
 * === CROPCORN ===
 * 
 * CropCorn is a unique CropsBlock inheritance, as the Corn plant itself requires a more than one block height when near and
 * at maturity as a crop. Because of this, CropCorn is variation of CropsBlock that modifies the voxel array for a more fitting
 * hit-box for the model, along with the required overrides to the parent class's relevant methods.
 * 
 * */

public class CropCorn extends CropsBlock{
	
	protected static final VoxelShape[] SHAPES = new VoxelShape[]{
			Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), 
		    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), 
		    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D), 
		    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), 
		    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D), 
		    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 18.0D, 16.0D), 
		    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 23.0D, 16.0D), 
		    Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 28.0D, 16.0D)};
	
	protected CropCorn(Properties builder) {
		super(builder);
	}
	
	@Override
	protected IItemProvider getSeedsItem() {
		return InitItems.CORN_SEEDS;
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return SHAPES[state.get(this.getAgeProperty())];
	}
}
