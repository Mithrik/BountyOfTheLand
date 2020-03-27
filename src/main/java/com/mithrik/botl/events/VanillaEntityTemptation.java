package com.mithrik.botl.events;

import java.util.Objects;

import com.mithrik.botl.objects.items.InitItems;
import com.mithrik.botl.util.ModInfo;

import net.minecraft.entity.Entity;
import net.minecraft.entity.ai.goal.TemptGoal;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = ModInfo.MODID, bus = Bus.MOD)
public class VanillaEntityTemptation {
	private static Ingredient SEEDS = null;
	private static Ingredient COW_FOOD = null;
	private static Ingredient PIG_FOOD = null;
	private static Ingredient SHEEP_FOOD = null;
	
	private static boolean temptationsLoaded = false;
	
	@SubscribeEvent
	public static void onPlayerInteract(EntityJoinWorldEvent event) {
		Entity entity = event.getEntity();
		if(!temptationsLoaded) {
			loadTemptationFoods();
		}
		
		if(entity instanceof ChickenEntity) {
			ChickenEntity animal = (ChickenEntity) entity;
			animal.goalSelector.addGoal(3, new TemptGoal(animal,1.0D,false,Ingredient.fromItems(InitItems.CORN_SEEDS, InitItems.MILLET_SEEDS, InitItems.RICE_SEEDS, InitItems.RYE_SEEDS)));
		}
		if(entity instanceof CowEntity) {
			CowEntity animal = (CowEntity) entity;
			animal.goalSelector.addGoal(3, new TemptGoal(animal,1.25D,false,Ingredient.fromItems(InitItems.CORN, InitItems.MILLET, InitItems.RICE, InitItems.RYE)));
		}
		if(entity instanceof PigEntity) {
			PigEntity animal = (PigEntity) entity;
			animal.goalSelector.addGoal(4, new TemptGoal(animal,1.2D,false,Ingredient.fromItems(InitItems.CORN, InitItems.YAM)));
		}
		if(entity instanceof SheepEntity) {
			SheepEntity animal = (SheepEntity) entity;
			animal.goalSelector.addGoal(3, new TemptGoal(animal,1.1D,false,Ingredient.fromItems(InitItems.MILLET, InitItems.RYE)));
		}
	}
	
	private static void loadTemptationFoods(){
		if(Objects.isNull(SEEDS)) {
			SEEDS = Ingredient.fromItems(InitItems.CORN_SEEDS, InitItems.MILLET_SEEDS, InitItems.RICE_SEEDS, InitItems.RYE_SEEDS);
		}
		if(Objects.isNull(COW_FOOD)) {
			COW_FOOD = Ingredient.fromItems(InitItems.CORN, InitItems.MILLET, InitItems.RICE, InitItems.RYE);
		}
		if(Objects.isNull(PIG_FOOD)) {
			PIG_FOOD = Ingredient.fromItems(InitItems.CORN, Items.BROWN_MUSHROOM, InitItems.YAM);
		}
		if(Objects.isNull(SHEEP_FOOD)) {
			PIG_FOOD = Ingredient.fromItems(InitItems.MILLET, InitItems.RYE);
		}
		temptationsLoaded = true;
	}
}
