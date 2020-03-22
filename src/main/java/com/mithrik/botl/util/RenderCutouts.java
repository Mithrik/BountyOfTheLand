package com.mithrik.botl.util;

import com.mithrik.botl.objects.blocks.InitBlocks;
import com.mithrik.botl.objects.blocks.crops.InitCrops;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class RenderCutouts {
	
	public static void renderCutouts(final FMLClientSetupEvent event) {
		RenderTypeLookup.setRenderLayer(InitCrops.CROP_CORN, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(InitCrops.CROP_RICE, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(InitCrops.CROP_RYE, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(InitCrops.CROP_MILLET, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(InitCrops.CROP_YAMS, RenderType.getCutout());
		
		RenderTypeLookup.setRenderLayer(InitBlocks.WILD_BEETROOTS, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(InitBlocks.WILD_CARROTS, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(InitBlocks.WILD_CORN, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(InitBlocks.WILD_MILLET, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(InitBlocks.WILD_POTATOES, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(InitBlocks.WILD_RICE, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(InitBlocks.WILD_RYE, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(InitBlocks.WILD_WHEAT, RenderType.getCutout());
		RenderTypeLookup.setRenderLayer(InitBlocks.WILD_YAMS, RenderType.getCutout());
	}
}
