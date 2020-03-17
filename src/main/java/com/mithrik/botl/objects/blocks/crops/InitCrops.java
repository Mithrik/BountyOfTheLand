package com.mithrik.botl.objects.blocks.crops;

import com.mithrik.botl.objects.items.InitItems;
import com.mithrik.botl.util.ModInfo;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.registries.ObjectHolder;

@EventBusSubscriber(modid = ModInfo.MODID, bus = Bus.MOD)
@ObjectHolder(ModInfo.MODID)
public class InitCrops {
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
	
	@SubscribeEvent
	public static void registerCrops(final RegistryEvent.Register<Block> event) {
		// CROP BLOCKS
		event.getRegistry().register(new CropCorn(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP)).setRegistryName("corn"));
		event.getRegistry().register(new CropMillet(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP)).setRegistryName("millet"));
		event.getRegistry().register(new CropGrain(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP), InitItems.RICE_SEEDS).setRegistryName("rice"));
		event.getRegistry().register(new CropGrain(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP), InitItems.RYE_SEEDS).setRegistryName("rye"));
		event.getRegistry().register(new CropYams(Block.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0f).sound(SoundType.CROP)).setRegistryName("yams"));
	}
}
