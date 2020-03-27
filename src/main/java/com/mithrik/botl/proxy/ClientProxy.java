package com.mithrik.botl.proxy;

import com.mithrik.botl.objects.blocks.InitBlocks;
import com.mithrik.botl.util.Log;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.color.BlockColors;
import net.minecraft.world.GrassColors;
import net.minecraft.world.biome.BiomeColors;

public class ClientProxy extends CommonProxy {

	public ClientProxy() {
		super();
	}
	
	@Override
	public void init() {
		Log.LOGGER.debug("CLIENT PROXY: Fire init");
		Block[] tintedBlocks = {InitBlocks.WILD_CORN, InitBlocks.WILD_MILLET, InitBlocks.WILD_RICE, InitBlocks.WILD_RYE, InitBlocks.WILD_WHEAT};
		
		BlockColors blockColors = Minecraft.getInstance().getBlockColors();
		
		for(Block block : tintedBlocks) {
			blockColors.register((state, reader, pos, tintIndex) -> { 
				return reader != null && pos != null ? BiomeColors.getGrassColor(reader, pos) : GrassColors.get(0.5D, 1.0D); }, block);
		}
		
	}
}
