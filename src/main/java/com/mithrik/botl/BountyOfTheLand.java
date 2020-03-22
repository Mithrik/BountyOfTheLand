package com.mithrik.botl;

import com.mithrik.botl.util.Log;
import com.mithrik.botl.util.ModInfo;
import com.mithrik.botl.util.RenderCutouts;
import com.mithrik.botl.world.gen.features.InitFeatures;

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
	public static final InitFeatures botlFeatures = new InitFeatures();
	
    public BountyOfTheLand() {
        // Register the setup method for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        // Register worldgen features for modloading
        FMLJavaModLoadingContext.get().getModEventBus().addListener(botlFeatures::addFeatures);
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
		RenderCutouts.renderCutouts(event);
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    	// SERVER STARTUP CODE HERE...
    	Log.LOGGER.info("HELLO from server starting");
    }
}
