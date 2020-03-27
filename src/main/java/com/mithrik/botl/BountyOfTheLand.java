package com.mithrik.botl;

import com.mithrik.botl.events.InitEvents;
import com.mithrik.botl.proxy.ClientProxy;
import com.mithrik.botl.proxy.CommonProxy;
import com.mithrik.botl.util.Log;
import com.mithrik.botl.util.ModInfo;
import com.mithrik.botl.util.RenderCutouts;
import com.mithrik.botl.world.gen.features.InitFeatures;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(ModInfo.MODID)
public class BountyOfTheLand
{
	public static BountyOfTheLand instance;
	public static CommonProxy proxy = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);
	public static final InitFeatures botlFeatures = new InitFeatures();
	
    public BountyOfTheLand() {
        // Create instance of the mod itself
        instance = this;
        
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(botlFeatures::addFeatures);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::loadComplete);

    	// Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void commonSetup(FMLCommonSetupEvent event)
    {
        // PREINIT CODE HERE...
    	Log.LOGGER.info("Common Setup");
    	InitEvents.initEventRegisters();
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    	// CLIENT-SIDE CODE HERE...
    	RenderCutouts.renderCutouts(event);
    }

    private void loadComplete(final FMLLoadCompleteEvent event) {
    	// POSTINIT CODE HERE...
    	Log.LOGGER.info("Post Registration");
    	proxy.init();
    }
    
    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {
    	// SERVER STARTUP CODE HERE...
    	Log.LOGGER.info("HELLO from server starting");
    }
}
