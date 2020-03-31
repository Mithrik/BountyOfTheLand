package com.mithrik.botl.objects.compat;

import com.mithrik.botl.objects.items.InitItems;

import net.minecraft.block.ComposterBlock;

public class InitCompostables {
	
	// === CHANCE CONSTANTS ===
	private static final float LOW = 0.3f;
//	private static final float MEDIUM_LOW = 0.5f;
	private static final float MEDIUM = 0.65f;
//	private static final float HIGH = 0.85f;
//	private static final float DEFINITE = 1.0f;
	
	public static void setup(){
		ComposterBlock.CHANCES.put(InitItems.CARROT_SEEDS, LOW);
		ComposterBlock.CHANCES.put(InitItems.CORN_SEEDS, LOW);
		ComposterBlock.CHANCES.put(InitItems.MILLET_SEEDS, LOW);
		ComposterBlock.CHANCES.put(InitItems.POTATO_SEEDS, LOW);
		ComposterBlock.CHANCES.put(InitItems.RICE_SEEDS, LOW);
		ComposterBlock.CHANCES.put(InitItems.RYE_SEEDS, LOW);
		ComposterBlock.CHANCES.put(InitItems.YAM_SEEDS, LOW);
		
		ComposterBlock.CHANCES.put(InitItems.CORN, MEDIUM);
		ComposterBlock.CHANCES.put(InitItems.MANGO, MEDIUM);
		ComposterBlock.CHANCES.put(InitItems.MILLET, MEDIUM);
		ComposterBlock.CHANCES.put(InitItems.PEACH, MEDIUM);
		ComposterBlock.CHANCES.put(InitItems.RICE, MEDIUM);
		ComposterBlock.CHANCES.put(InitItems.RYE, MEDIUM);
		ComposterBlock.CHANCES.put(InitItems.YAM, MEDIUM);
	}
}
