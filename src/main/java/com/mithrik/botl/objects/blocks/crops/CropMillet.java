package com.mithrik.botl.objects.blocks.crops;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;

import java.util.Random;

import com.mithrik.botl.objects.items.InitItems;

import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;

public class CropMillet extends CropsBlock{

	protected final VoxelShape[] shapes = new VoxelShape[]{
			Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D), 
			Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D), 
			Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 8.0D, 16.0D), 
			Block.makeCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D)};
	
	protected CropMillet(Properties builder) {
		super(builder);
	}
	
	@Override
	protected IItemProvider getSeedsItem() {
		return InitItems.MILLET_SEEDS;
	}
	
	@Override
	public int getMaxAge() {
		return 3;
	}
	
	public void tick(BlockState state, ServerWorld worldIn, BlockPos pos, Random rand) {
		if (rand.nextInt(3) != 0) {
			super.tick(state, worldIn, pos, rand);
		}
	}
	
   protected int getBonemealAgeIncrease(World worldIn) {
      return super.getBonemealAgeIncrease(worldIn) / 3;
   }
	
	@Override
	public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
		return shapes[state.get(this.getAgeProperty())];
	}
}
