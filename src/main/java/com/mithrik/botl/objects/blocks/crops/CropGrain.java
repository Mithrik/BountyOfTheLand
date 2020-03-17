package com.mithrik.botl.objects.blocks.crops;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

/* 
 * === CROPGRAIN ===
 * 
 * This class is the catch-all class for all grain crop blocks, a.k.a. "wheat clones".
 * 
 * CropGrain inherits from the basic crop class, which itself is the implementation of vanilla Minecraft's wheat crop. There
 * are a couple of changes applied to the base class to make it able to work as a base for all crops of the same time, namely
 * the override of the maxAge (and the related VoxelShape array for its hitbox) and seed Item variables, so as to make those
 * declared final values within the constructor, rather than hard-coded into the class.
 * 
 * Apart from that, each grain crop, there are two constructors, one for crops that have the default maxAge (7) of the original
 * wheat, and another one where said age can be added in as a value, along with the voxel array that for the corresponding
 * number of growth stages.
 * 
 * */

public class CropGrain extends CropsBlock{
	
	protected final Item seeds;
	protected final int maxAge;
	protected final VoxelShape[] shapes;
	
	protected CropGrain(Properties builder, Item SeedsItem) {
		super(builder);
		this.seeds = SeedsItem;
		this.maxAge = 7;
		this.shapes = new VoxelShape[]{
				Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), 
				Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D), 
				Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D), 
				Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), 
				Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D), 
				Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D), 
				Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D), 
				Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D)};
	}
	
	protected CropGrain(Properties builder, Item SeedsItem, int stages, VoxelShape[] voxels) {
		super(builder);
		this.seeds = SeedsItem;
		this.maxAge = stages;
		this.shapes = voxels;
	}
	
	@Override
	protected IItemProvider getSeedsItem() {
		return seeds;
	}
	
	@Override
	public int getMaxAge() {
		// TODO Auto-generated method stub
		return maxAge;
	}
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return shapes[state.get(this.getAgeProperty())];
	}
}
