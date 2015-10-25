package com.github.tiggels.arachne.common;

import com.github.tiggels.arachne.item.ItemWax;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Miles on 10/25/15.
 */
public class CommonProxy {

    public static Item itemWax;

    public void preInit(FMLPreInitializationEvent e) {
        itemWax = new ItemWax();
        GameRegistry.registerItem(itemWax, "Wax Clump");
    }

    public void init(FMLInitializationEvent e) {

    }

    public void postInit(FMLPostInitializationEvent e) {

    }
}
