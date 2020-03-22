package com.mithrik.botl.world.gen.features;

import com.mithrik.botl.objects.blocks.InitBlocks;

import net.minecraft.world.gen.blockplacer.SimpleBlockPlacer;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.BlockClusterFeatureConfig;

public class FeatureConfigsBotL {
	public static final BlockClusterFeatureConfig WILD_BEETROOTS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(InitBlocks.WILD_BEETROOTS.getDefaultState()), new SimpleBlockPlacer())).tries(16).build();
	public static final BlockClusterFeatureConfig WILD_CARROTS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(InitBlocks.WILD_CARROTS.getDefaultState()), new SimpleBlockPlacer())).tries(16).build();
	public static final BlockClusterFeatureConfig WILD_CORN_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(InitBlocks.WILD_CORN.getDefaultState()), new SimpleBlockPlacer())).tries(16).build();
	public static final BlockClusterFeatureConfig WILD_MILLET_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(InitBlocks.WILD_MILLET.getDefaultState()), new SimpleBlockPlacer())).tries(16).build();
	public static final BlockClusterFeatureConfig WILD_POTATOES_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(InitBlocks.WILD_POTATOES.getDefaultState()), new SimpleBlockPlacer())).tries(16).build();
	public static final BlockClusterFeatureConfig WILD_RICE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(InitBlocks.WILD_RICE.getDefaultState()), new SimpleBlockPlacer())).tries(16).build();
	public static final BlockClusterFeatureConfig WILD_RYE_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(InitBlocks.WILD_RYE.getDefaultState()), new SimpleBlockPlacer())).tries(16).build();
	public static final BlockClusterFeatureConfig WILD_WHEAT_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(InitBlocks.WILD_WHEAT.getDefaultState()), new SimpleBlockPlacer())).tries(16).build();
	public static final BlockClusterFeatureConfig WILD_YAMS_CONFIG = (new BlockClusterFeatureConfig.Builder(new SimpleBlockStateProvider(InitBlocks.WILD_YAMS.getDefaultState()), new SimpleBlockPlacer())).tries(16).build();
}
