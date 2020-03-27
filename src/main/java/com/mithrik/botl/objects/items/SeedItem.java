package com.mithrik.botl.objects.items;

import net.minecraft.block.Block;
import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;

/*
 * === SeedItem ===
 * 
 * All items used to plant new crops by Bounty of the Land use this class, an extension of the basic BlockNamedItem. The difference
 * lies in that SeedItem overrides itemInteracionForEntity() so these items can be used in mob breeding.
 * */
public class SeedItem extends BlockNamedItem {
	
	public SeedItem(Block blockIn, Properties properties) {
		super(blockIn, properties);
	}
	@Override
	public boolean itemInteractionForEntity(ItemStack stack, PlayerEntity player, LivingEntity target, Hand hand) {
		boolean success = false;
		
		if(!target.world.isRemote() && !target.isChild() && target instanceof AgeableEntity && ((AgeableEntity) target).getGrowingAge() >= 0) {
			if(target instanceof ChickenEntity) {
				ChickenEntity chicken = (ChickenEntity) target;
				if(!chicken.isInLove()) {
					chicken.setInLove(player);
					if(!player.isCreative()) {
						stack.shrink(1);
					}
					success = true;
				}
			}
			if(target instanceof PigEntity) {
				PigEntity pig = (PigEntity) target;
				if(!pig.isInLove()) {
					pig.setInLove(player);
					if(!player.isCreative()) {
						stack.shrink(1);
					}
					success = true;
				}
			}
			if(target instanceof ParrotEntity) {
				ParrotEntity parrot = (ParrotEntity) target;
				if(!parrot.isTamed() && !parrot.isInLove()) {
					if(Math.random() <= (1/3)) {
						parrot.setTamedBy(player);
						parrot.setInLove(player);
						success = true;
						if(!player.isCreative()) {
							stack.shrink(1);
						}
					}
				}
			}
		}
		if(target.isChild()) {
			if(!player.isCreative()) {
				stack.shrink(1);
			}
			((AgeableEntity)target).ageUp((int) ((-((AgeableEntity)target).getGrowingAge()/20) * 0.1), true);
			success = true;
		}
		
		return success;
	}

}
