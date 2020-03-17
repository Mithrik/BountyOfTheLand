package com.mithrik.botl.objects.loot_tables;

import com.mithrik.botl.util.ModInfo;

import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@EventBusSubscriber(modid = ModInfo.MODID, bus = Bus.MOD)
public class InitLootTables {
	@SubscribeEvent
	public static void onLootLoad(LootTableLoadEvent event) {
	    // CODE HERE...
	}
}

