package com.mithrik.botl.objects.blocks;

import com.mithrik.botl.ItemGroupBotL;
import com.mithrik.botl.util.ModInfo;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

/*
 * === BlockRegistry ===
 * 
 * The central class for registration of blocks within the mod.
 * */

@EventBusSubscriber(modid = ModInfo.MODID, bus = Bus.MOD)
@ObjectHolder(ModInfo.MODID)
public class InitBlocks {
//	BLOCK DECLARATIONS
	
	// SIMPLE BLOCKS
	public static final Block SLATE = null;
	
	public static final Block WILD_BEETROOTS = null;
	public static final Block WILD_CARROTS = null;
	public static final Block WILD_CORN = null;
	public static final Block WILD_MILLET = null;
	public static final Block WILD_POTATOES = null;
	public static final Block WILD_RICE = null;
	public static final Block WILD_RYE = null;
	public static final Block WILD_WHEAT = null;
	public static final Block WILD_YAMS = null;
	
	
//	REGISTRATION
	@SubscribeEvent
	public static void RegisterBlocks(final RegistryEvent.Register<Block> event) {
		// SIMPLE BLOCKS
		event.getRegistry().register(new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f,6.0f).sound(SoundType.STONE)).setRegistryName("slate"));
		
		// WILD CROP BLOCKS
		event.getRegistry().register(new WildCropBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName("wild_beetroots"));
		event.getRegistry().register(new WildCropBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName("wild_carrots"));
		event.getRegistry().register(new WildCropBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName("wild_corn"));
		event.getRegistry().register(new WildCropBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName("wild_millet"));
		event.getRegistry().register(new WildCropBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName("wild_potatoes"));
		event.getRegistry().register(new WildCropBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName("wild_rice"));
		event.getRegistry().register(new WildCropBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName("wild_rye"));
		event.getRegistry().register(new WildCropBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName("wild_wheat"));
		event.getRegistry().register(new WildCropBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).doesNotBlockMovement().sound(SoundType.PLANT)).setRegistryName("wild_yams"));
	}
	
	@SubscribeEvent
	public static void RegisterBlockItems(final RegistryEvent.Register<Item> event) {
		// SIMPLE BLOCKS
		event.getRegistry().register(new BlockItem(SLATE, new BlockItem.Properties().group(ItemGroupBotL.BOTL_BLOCKS)).setRegistryName("slate"));
		
		// WILD CROP BLOCKS
		event.getRegistry().register(new BlockItem(WILD_BEETROOTS, new BlockItem.Properties().group(ItemGroupBotL.BOTL_BLOCKS)).setRegistryName("wild_beetroots"));
		event.getRegistry().register(new BlockItem(WILD_CARROTS, new BlockItem.Properties().group(ItemGroupBotL.BOTL_BLOCKS)).setRegistryName("wild_carrots"));
		event.getRegistry().register(new BlockItem(WILD_CORN, new BlockItem.Properties().group(ItemGroupBotL.BOTL_BLOCKS)).setRegistryName("wild_corn"));
		event.getRegistry().register(new BlockItem(WILD_MILLET, new BlockItem.Properties().group(ItemGroupBotL.BOTL_BLOCKS)).setRegistryName("wild_millet"));
		event.getRegistry().register(new BlockItem(WILD_POTATOES, new BlockItem.Properties().group(ItemGroupBotL.BOTL_BLOCKS)).setRegistryName("wild_potatoes"));
		event.getRegistry().register(new BlockItem(WILD_RICE, new BlockItem.Properties().group(ItemGroupBotL.BOTL_BLOCKS)).setRegistryName("wild_rice"));
		event.getRegistry().register(new BlockItem(WILD_RYE, new BlockItem.Properties().group(ItemGroupBotL.BOTL_BLOCKS)).setRegistryName("wild_rye"));
		event.getRegistry().register(new BlockItem(WILD_WHEAT, new BlockItem.Properties().group(ItemGroupBotL.BOTL_BLOCKS)).setRegistryName("wild_wheat"));
		event.getRegistry().register(new BlockItem(WILD_YAMS, new BlockItem.Properties().group(ItemGroupBotL.BOTL_BLOCKS)).setRegistryName("wild_yams"));
	}
}
