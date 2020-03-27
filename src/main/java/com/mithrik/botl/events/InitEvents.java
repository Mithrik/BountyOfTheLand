package com.mithrik.botl.events;

import net.minecraftforge.common.MinecraftForge;

public class InitEvents {
	
	public static void initEventRegisters() {
		//INSERT CUSTOM EVENT REGISTRATIONS HERE...
		MinecraftForge.EVENT_BUS.register(VanillaEntityTemptation.class);
	}
}
