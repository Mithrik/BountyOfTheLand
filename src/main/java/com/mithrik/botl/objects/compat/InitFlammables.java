package com.mithrik.botl.objects.compat;

import com.mithrik.botl.objects.blocks.InitBlocks;

import net.minecraft.block.Blocks;
import net.minecraft.block.FireBlock;

public class InitFlammables {
	
	public static void setup() {
		
		FireBlock fireblock = (FireBlock)Blocks.FIRE;
		
		fireblock.setFireInfo(InitBlocks.WILD_BEETROOTS, 60, 100);
		fireblock.setFireInfo(InitBlocks.WILD_CARROTS, 60, 100);
		fireblock.setFireInfo(InitBlocks.WILD_CORN, 60, 100);
		fireblock.setFireInfo(InitBlocks.WILD_MILLET, 60, 100);
		fireblock.setFireInfo(InitBlocks.WILD_POTATOES, 60, 100);
		fireblock.setFireInfo(InitBlocks.WILD_RICE, 60, 100);
		fireblock.setFireInfo(InitBlocks.WILD_RYE, 60, 100);
		fireblock.setFireInfo(InitBlocks.WILD_WHEAT, 60, 100);
		fireblock.setFireInfo(InitBlocks.WILD_YAMS, 60, 100);
	}
}
