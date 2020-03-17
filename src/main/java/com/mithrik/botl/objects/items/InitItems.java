package com.mithrik.botl.objects.items;

import com.mithrik.botl.ItemGroupBotL;
import com.mithrik.botl.objects.blocks.crops.InitCrops;
import com.mithrik.botl.util.ModInfo;

import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

/*
 * === ItemInit ===
 * 
 * The central class for registration of items within the mod.
 * */

@EventBusSubscriber(modid = ModInfo.MODID, bus = Bus.MOD)
@ObjectHolder(ModInfo.MODID)
public class InitItems {
//	ITEM DECLARATIONS

	public static final Item CORN = null;
	public static final Item RICE = null;
	public static final Item RYE = null;
	public static final Item MILLET = null;
	public static final Item YAM = null;
	
	public static final Item PEACH = null;
	public static final Item MANGO = null;
	
	public static final Item CORN_SEEDS = null;
	public static final Item RICE_SEEDS = null;
	public static final Item RYE_SEEDS = null;
	public static final Item MILLET_SEEDS = null;
	
//	REGISTRATION
	@SubscribeEvent
	public static void RegisterItems(final RegistryEvent.Register<Item> event) {
		
		// SIMPLE ITEMS
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)).setRegistryName("millet"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)).setRegistryName("rice"));
		event.getRegistry().register(new Item(new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)).setRegistryName("rye"));
		
		// FOOD ITEMS
		event.getRegistry().register(new Item(new Item.Properties().food((new Food.Builder()).hunger(2).saturation(0.6f).build()).group(ItemGroupBotL.BOTL_ITEMS)).setRegistryName("corn"));
		event.getRegistry().register(new BlockNamedItem(InitCrops.CROP_YAMS, new Item.Properties().food((new Food.Builder()).hunger(2).saturation(0.6f).build()).group(ItemGroupBotL.BOTL_ITEMS)).setRegistryName("yam"));
		
		event.getRegistry().register(new Item(new Item.Properties().food((new Food.Builder()).hunger(4).saturation(2.4f).build()).group(ItemGroupBotL.BOTL_ITEMS)).setRegistryName("peach"));
		event.getRegistry().register(new Item(new Item.Properties().food((new Food.Builder()).hunger(4).saturation(3.6f).build()).group(ItemGroupBotL.BOTL_ITEMS)).setRegistryName("mango"));
		
		// BLOCK-NAMED ITEMS
		event.getRegistry().register(new BlockNamedItem(InitCrops.CROP_CORN, new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)).setRegistryName("corn_seeds"));
		event.getRegistry().register(new BlockNamedItem(InitCrops.CROP_MILLET, new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)).setRegistryName("millet_seeds"));
		event.getRegistry().register(new BlockNamedItem(InitCrops.CROP_RICE, new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)).setRegistryName("rice_seeds"));
		event.getRegistry().register(new BlockNamedItem(InitCrops.CROP_RYE, new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)).setRegistryName("rye_seeds"));
	}
}
