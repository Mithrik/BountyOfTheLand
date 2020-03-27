package com.mithrik.botl.world.gen.features;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.Category;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.placement.ChanceConfig;
import net.minecraft.world.gen.placement.FrequencyConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.registries.ForgeRegistries;


public class InitFeatures {

	public void addFeatures(final FMLCommonSetupEvent event) {
		
		// Biome lists go here as a means of organization. If a feature is found in multiple biomes better specified through an array, add said array here and iterate it below.
		Biome[] wildBeetrootBiomes = {Biomes.FOREST,Biomes.WOODED_HILLS,Biomes.TAIGA,Biomes.TAIGA_HILLS,Biomes.TAIGA_MOUNTAINS};
		
		for(Biome registryBiome : ForgeRegistries.BIOMES) {
			// BEETROOTS
			for(Biome listedBiome : wildBeetrootBiomes) {
				if(registryBiome == listedBiome) {
					registryBiome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(FeatureConfigsBotL.WILD_BEETROOTS_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(12))));
				}
			}
			// CARROTS
			if(registryBiome == Biomes.BIRCH_FOREST || registryBiome == Biomes.BIRCH_FOREST_HILLS) {
				registryBiome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(FeatureConfigsBotL.WILD_CARROTS_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(12))));
			}
			// CORN
			if(registryBiome == Biomes.MODIFIED_WOODED_BADLANDS_PLATEAU || registryBiome == Biomes.WOODED_BADLANDS_PLATEAU) {
				registryBiome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(FeatureConfigsBotL.WILD_CORN_CONFIG).withPlacement(Placement.COUNT_HEIGHTMAP_DOUBLE.configure(new FrequencyConfig(1))));
			}
			if(registryBiome == Biomes.SAVANNA_PLATEAU) {
				registryBiome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(FeatureConfigsBotL.WILD_CORN_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(16))));
			}
			// MILLET
			if(registryBiome.getCategory() == Category.SAVANNA) {
				registryBiome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(FeatureConfigsBotL.WILD_MILLET_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(16))));
			}
			// POTATOES
			if(registryBiome == Biomes.MOUNTAINS || registryBiome == Biomes.WOODED_MOUNTAINS) {
				registryBiome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(FeatureConfigsBotL.WILD_POTATOES_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(16))));
			}
			// RICE
			if(registryBiome == Biomes.RIVER || registryBiome.getCategory() == Category.SWAMP) {
				registryBiome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(FeatureConfigsBotL.WILD_RICE_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(12))));
			}
			// RYE
			if(registryBiome.getCategory() == Category.TAIGA) {
				registryBiome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(FeatureConfigsBotL.WILD_RYE_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(16))));
			}
			// WHEAT
			if(registryBiome == Biomes.PLAINS) {
				registryBiome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(FeatureConfigsBotL.WILD_WHEAT_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(16))));
			}
			// YAMS
			if(registryBiome.getCategory() == Category.JUNGLE || registryBiome.getCategory() == Category.SWAMP) {
				registryBiome.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Feature.RANDOM_PATCH.withConfiguration(FeatureConfigsBotL.WILD_YAMS_CONFIG).withPlacement(Placement.CHANCE_HEIGHTMAP_DOUBLE.configure(new ChanceConfig(12))));
			}
		}
	}
}
