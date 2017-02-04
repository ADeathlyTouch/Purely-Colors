package com.deathly.colors.utils;

import com.deathly.colors.Ref;
import com.deathly.colors.blocks.ModBlocks;
import net.minecraft.item.ItemStack;

import static net.minecraftforge.oredict.OreDictionary.registerOre;
/**
 * Created by Deathly on 11/20/2016 at 3:46 AM.
 */
public class ModOreDict {
    public static void registerOeDictEntries() {
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_WHITE).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_RED).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_GREY).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_YELLOW).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_GREEN).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_BROWN).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_CYAN).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_LIME).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_PURPLE).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_PINK).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_ORANGE).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_WHITE).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_BLACK).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_MAGENTA).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_LIGHTBLUE).get(ModBlocks.UNLIT), 1));
        registerOre("colorBrick", new ItemStack(ModBlocks.blockMap.get(Ref.PURE_LIGHTGREY).get(ModBlocks.UNLIT), 1));
    }
}
