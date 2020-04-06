package com.mithrik.botl.objects.items;

import com.mithrik.botl.ItemGroupBotL;
import com.mithrik.botl.objects.blocks.InitBlocks;
import com.mithrik.botl.util.ModInfo;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.IForgeRegistry;
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
	
	public static final Item COOKED_RICE = null;
	public static final Item COOKED_YAM = null;
	public static final Item MANGO = null;
	public static final Item PEACH = null;
	public static final Item PHULKA = null;
	public static final Item RYE_BREAD = null;
	public static final Item TORTILLA = null;
	
	public static final Item CORN_SEEDS = null;
	public static final Item MILLET_SEEDS = null;
	public static final Item RICE_SEEDS = null;
	public static final Item RYE_SEEDS = null;
	public static final Item YAM_SEEDS = null;
	
//	REGISTRATION
	@SubscribeEvent
	public static void RegisterItems(RegistryEvent.Register<Item> event) {
		
		IForgeRegistry<Item> r = event.getRegistry();
		
		// SIMPLE ITEMS
		register(r,"millet", new CropItem(new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"rice", new CropItem(new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"rye", new CropItem(new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)));
		
		// FOOD ITEMS
		register(r,"corn", new CropItem(new Item.Properties().food(makeFood(2, 0.3f)).group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"yam", new CropItem(new Item.Properties().food(makeFood(2, 0.3f)).group(ItemGroupBotL.BOTL_ITEMS)));
		
		register(r,"cooked_rice", new Item(new Item.Properties().food(makeFood(5, 0.48f)).group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"cooked_yam", new Item(new Item.Properties().food(makeFood(5, 0.6f)).group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"mango", new Item(new Item.Properties().food(makeFood(4, 0.45f)).group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"peach", new Item(new Item.Properties().food(makeFood(4, 0.3f)).group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"phulka", new Item(new Item.Properties().food(makeFood(3, 0.6f)).group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"rye_bread", new Item(new Item.Properties().food(makeFood(5, 0.6f)).group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"tortilla", new Item(new Item.Properties().food(makeFood(2, 0.6f)).group(ItemGroupBotL.BOTL_ITEMS)));
		
		
		// BLOCK-NAMED ITEMS
		register(r,"corn_seeds", new SeedItem(InitBlocks.CROP_CORN, new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"millet_seeds", new SeedItem(InitBlocks.CROP_MILLET, new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"rice_seeds", new SeedItem(InitBlocks.CROP_RICE, new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"rye_seeds", new SeedItem(InitBlocks.CROP_RYE, new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)));
		register(r,"yam_seeds", new SeedItem(InitBlocks.CROP_YAMS, new Item.Properties().group(ItemGroupBotL.BOTL_ITEMS)));
	}
	
	// === OBJECT TEMPLATES ===
	private static Food makeFood(int hunger, float saturation){
		return (new Food.Builder()).hunger(hunger).saturation(saturation).build();
	}
	
	// === REGRISTRATION ===
	private static <T extends Item> void register(IForgeRegistry<Item> registry, String name, T item) {
		item.setRegistryName(name);
		registry.register(item);
	}
	
}
