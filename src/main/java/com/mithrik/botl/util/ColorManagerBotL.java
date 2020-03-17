package com.mithrik.botl.util;

import com.mithrik.botl.objects.blocks.InitBlocks;

import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.GrassColors;
import net.minecraft.world.ILightReader;
import net.minecraft.world.biome.BiomeColors;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = ModInfo.MODID, bus = Bus.MOD)
public class ColorManagerBotL {
	
	@OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerBlockColorHandlers(final ColorHandlerEvent.Block event) {
        event.getBlockColors().register((state, reader, pos, num) -> { 
        	return reader != null && pos != null ? BiomeColors.getGrassColor(reader, pos) : GrassColors.get(0.5D, 1.0D); 
    	}, InitBlocks.WILD_CORN, InitBlocks.WILD_MILLET, InitBlocks.WILD_RICE, InitBlocks.WILD_RYE, InitBlocks.WILD_WHEAT);
    }
	
	@OnlyIn(Dist.CLIENT)
    @SubscribeEvent
    public static void registerItemColorHandlers(final ColorHandlerEvent.Item event) {
        event.getItemColors().register((stack, num) -> {
            BlockState blockstate = ((BlockItem)stack.getItem()).getBlock().getDefaultState();
            return event.getBlockColors().getColor(blockstate, (ILightReader)null, (BlockPos)null, num);
         }, InitBlocks.WILD_CORN, InitBlocks.WILD_MILLET, InitBlocks.WILD_RICE, InitBlocks.WILD_RYE, InitBlocks.WILD_WHEAT);
    }
}
