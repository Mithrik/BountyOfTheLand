package com.mithrik.botl;

import com.mithrik.botl.objects.blocks.InitBlocks;
import com.mithrik.botl.objects.blocks.crops.InitCrops;
import com.mithrik.botl.util.Log;
import com.mithrik.botl.util.ModInfo;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModInfo.MODID)
public class BountyOfTheLand
{
	public static BountyOfTheLand instance;
	
    public BountyOfTheLand() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register the doClientStuff method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
        // Create instance of the mod itself
        instance = this;
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // PREINIT CODE HERE...
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    	// CLIENT-SIDE CODE HERE...
    	
    	// --- TRANSPARENCY ---
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

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    	// SERVER STARTUP CODE HERE...
    	Log.LOGGER.info("HELLO from server starting");
    }
}
