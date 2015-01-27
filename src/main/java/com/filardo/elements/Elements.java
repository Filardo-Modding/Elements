package com.filardo.elements;


import com.filardo.elements.init.ElementsBlocks;
import com.filardo.elements.init.ElementsItems;
import com.filardo.elements.init.Recepies;
import com.filardo.elements.proxy.CommonProxy;
import com.filardo.elements.reference.Reference;
import com.filardo.elements.util.Log;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class Elements{
    @Mod.Instance(Reference.MOD_ID)
    public static Elements instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        // Register Items and Blocks
        ElementsBlocks.registerBlocks();
        ElementsItems.registerItems();
        //Initialize
        Recepies.init();
        proxy.preInit();
        // Register Handlers / Hooks etc.

        Log.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        proxy.init();
        Log.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        proxy.postInit();
        Log.info("Post Initialization Complete!");
    }
}
