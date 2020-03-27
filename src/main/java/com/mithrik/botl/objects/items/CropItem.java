package com.mithrik.botl.objects.items;

import net.minecraft.entity.AgeableEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Hand;


/*
 * === SeedItem ===
 * 
 * All items that act as non-plantable crop items in Bounty of the Land use this class, an extension of the basic BlockNamedItem. The 
 * difference lies in that CropItem overrides itemInteracionForEntity() so these items can be used in mob breeding.
 * */
public class CropItem extends Item {

	public CropItem(Properties properties) {
		super(properties);
	}

	@Override
	public boolean itemInteractionForEntity(ItemStack stack, PlayerEntity playerIn, LivingEntity target, Hand hand) {
		boolean success = false;
		
		if(!target.world.isRemote() && !target.isChild() && target instanceof AgeableEntity && ((AgeableEntity) target).getGrowingAge() >= 0) {
			if(target instanceof CowEntity) {
				CowEntity cow = (CowEntity) target;
				if(!cow.isInLove()) {
					cow.setInLove(playerIn);
					if(!playerIn.isCreative()) {
						stack.shrink(1);
					}
					success = true;
				}
			}
			if(target instanceof SheepEntity) {
				SheepEntity sheep = (SheepEntity) target;
				if(!sheep.isInLove()) {
					sheep.setInLove(playerIn);
					if(!playerIn.isCreative()) {
						stack.shrink(1);
					}
					success = true;
				}
			}
		}
		if(target.isChild()) {
			if(!playerIn.isCreative()) {
				stack.shrink(1);
			}
			((AgeableEntity)target).ageUp((int) ((-((AgeableEntity)target).getGrowingAge()/20) * 0.1), true);
			success = true;
		}
		
		return success;
	}
}
