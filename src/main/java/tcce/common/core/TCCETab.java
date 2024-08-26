/*******************************************************************************
 * Copyright (c) 2012 Mrbrutal. All rights reserved.
 * 
 * @name Traincraft Community Edition Pack
 * @author TheDoctor1138
 ******************************************************************************/

package tcce.common.core;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import train.common.library.ItemIDs;

public class TCCETab extends CreativeTabs {

	public TCCETab(int par1, String par2Str) {
		super(par1, par2Str);
	}

	@Override
	public ItemStack getIconItemStack() {
		return new ItemStack(ItemIDs.minecartLocomogulBlue.item);
	}

	@Override
	public String getTranslatedTabLabel() {
		return super.getTabLabel();
	}

	@Override
	public Item getTabIconItem(){return ItemIDs.minecartLocomogulBlue.item;}
}
