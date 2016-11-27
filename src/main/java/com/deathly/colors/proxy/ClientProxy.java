package com.deathly.colors.proxy;

import com.deathly.colors.Items.ModItems;
import com.deathly.colors.blocks.ModBlocks;

import com.deathly.colors.recipe.ModRecipes;
import com.deathly.colors.utils.ModOreDict;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

    @Override
    public void preInit(FMLPreInitializationEvent e) {
        super.preInit(e);
        ModBlocks.initModels();
    }

    @Override
    public void init(FMLInitializationEvent e) {
        super.init(e);
        ModItems.registerRenders();
        ModRecipes.init();
        ModOreDict.registerOeDictEntries();
    }

    @Override
    public void postInit(FMLPostInitializationEvent e) {
        super.postInit(e);
    }


}
