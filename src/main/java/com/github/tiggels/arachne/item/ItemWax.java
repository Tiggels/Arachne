package com.github.tiggels.arachne.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Miles on 10/25/15.
 */
public final class ItemWax extends Item {

    public ItemWax() {
        setMaxStackSize(128);
        setCreativeTab(CreativeTabs.tabMisc);
        setUnlocalizedName("waxItem");
    }
}
