package com.github.tiggels.arachne.core;

import com.github.tiggels.arachne.common.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;


/**
 * Created by Miles on 10/25/15.
 */
@Mod(modid="arachne", name="Arachne Enhancements Mod", version="0.00.000")
//@NetworkMod(clientSideRequired=true) // not used in 1.7
public class Arachne {

    // The instance of your mod that Forge uses.
    @Mod.Instance(value = "arachne")
    public static Arachne instance;

    // Says where the client and server 'proxy' code is loaded.
    @SidedProxy(clientSide="com.github.tiggels.arachne.client.ClientProxy", serverSide="tcom.github.tiggels.arachne.common.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler // used in 1.6.2
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);
    }

    @Mod.EventHandler // used in 1.6.2
    public void load(FMLInitializationEvent e) {
        proxy.init(e);
    }

    @Mod.EventHandler // used in 1.6.2
    public void postInit(FMLPostInitializationEvent e) {
        proxy.postInit(e);
    }
}