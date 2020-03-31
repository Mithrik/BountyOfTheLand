package com.mithrik.botl.objects.blocks;

import com.mithrik.botl.ItemGroupBotL;
import com.mithrik.botl.objects.items.InitItems;
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
import net.minecraftforge.registries.IForgeRegistry;
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
	
	@ObjectHolder("corn")
	public static final Block CROP_CORN = null;
	@ObjectHolder("millet")
	public static final Block CROP_MILLET = null;
	@ObjectHolder("rice")
	public static final Block CROP_RICE = null;
	@ObjectHolder("rye")
	public static final Block CROP_RYE = null;
	@ObjectHolder("yams")
	public static final Block CROP_YAMS = null;
	
	//BLOCKS TO OVERWRITE
	@ObjectHolder("minecraft:carrots")
	public static final Block CROP_CARROTS = null;
	@ObjectHolder("minecraft:potatoes")
	public static final Block CROP_POTATOES = null;
	
	@SubscribeEvent
	public static void RegisterBlocks(final RegistryEvent.Register<Block> event) {
		IForgeRegistry<Block> r = event.getRegistry();
		
		// SIMPLE BLOCKS
		registerBlock(r, "slate", new Block(Block.Properties.create(Material.ROCK, MaterialColor.STONE).hardnessAndResistance(1.5f,6.0f).sound(SoundType.STONE)));
		
		// CROP BLOCKS
		registerBlock(r, "corn", new CropCorn(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP)));
		registerBlock(r, "millet", new CropMillet(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP)));
		registerBlock(r, "rice", new CropGrain(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP), InitItems.RICE_SEEDS));
		registerBlock(r, "rye", new CropGrain(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP), InitItems.RYE_SEEDS));
		registerBlock(r, "yams", new CropYams(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP)));
		
		// OVERWRITES
		event.getRegistry().register(new CropCarrots(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP)).setRegistryName("carrots"));
		event.getRegistry().register(new CropPotatoes(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP)).setRegistryName("potatoes"));

		// WILD CROP BLOCKS
		registerBlock(r, "wild_beetroots", createWildCropBlock());
		registerBlock(r, "wild_carrots", createWildCropBlock());
		registerBlock(r, "wild_corn", createWildCropBlock());
		registerBlock(r, "wild_millet", createWildCropBlock());
		registerBlock(r, "wild_potatoes", createWildCropBlock());
		registerBlock(r, "wild_rice", createWildCropBlock());
		registerBlock(r, "wild_rye", createWildCropBlock());
		registerBlock(r, "wild_wheat", createWildCropBlock());
		registerBlock(r, "wild_yams", createWildCropBlock());
	}
	
	@SubscribeEvent
	public static void RegisterBlockItems(final RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> r = event.getRegistry();
		
		// SIMPLE BLOCKS
		registerBlockItem(r,"slate", createBlockItem(SLATE));
		
		// WILD CROP BLOCKS
		registerBlockItem(r,"wild_beetroots", createBlockItem(WILD_BEETROOTS));
		registerBlockItem(r,"wild_carrots", createBlockItem(WILD_CARROTS));
		registerBlockItem(r,"wild_corn", createBlockItem(WILD_CORN));
		registerBlockItem(r,"wild_millet", createBlockItem(WILD_MILLET));
		registerBlockItem(r,"wild_potatoes", createBlockItem(WILD_POTATOES));
		registerBlockItem(r,"wild_rice", createBlockItem(WILD_RICE));
		registerBlockItem(r,"wild_rye", createBlockItem(WILD_RYE));
		registerBlockItem(r,"wild_wheat", createBlockItem(WILD_WHEAT));
		registerBlockItem(r,"wild_yams", createBlockItem(WILD_YAMS));
		}
	
	// === OBJECT TEMPLATES ===
	private static WildCropBlock createWildCropBlock(){
		return new WildCropBlock(Block.Properties.create(Material.PLANTS).hardnessAndResistance(0.0f).doesNotBlockMovement().sound(SoundType.PLANT));
	}
	
	private static BlockItem createBlockItem(Block block) {
		return new BlockItem(block, new BlockItem.Properties().group(ItemGroupBotL.BOTL_BLOCKS));
	}
	
	// === REGISTRATIONS ===
	private static <T extends BlockItem> void registerBlockItem(IForgeRegistry<Item> registry, String name, T item) {
		item.setRegistryName(name);
		registry.register(item);
	}
	
	private static <T extends Block> void registerBlock(IForgeRegistry<Block> registry, String name, T block) {
		block.setRegistryName(name);
		registry.register(block);
	}
}
